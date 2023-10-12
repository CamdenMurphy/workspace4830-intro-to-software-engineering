import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchMurphy")
public class SearchMurphy extends HttpServlet {
   private static final long serialVersionUID = 1L;

   public SearchMurphy() {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String keyword = request.getParameter("keyword");
      search(keyword, response);
   }

   void search(String keyword, HttpServletResponse response) throws IOException {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "Vehicle Inventory";
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + //
            "transitional//en\">\n"; //
      out.println(docType + //
            "<html>\n" + //
            "<head><title>" + title + "</title></head>\n" + //
            "<body bgcolor=\"#f0f0f0\">\n" + //
            "<h1 align=\"center\">" + title + "</h1>\n");

      Connection connection = null;
      PreparedStatement preparedStatement = null;
      try {
         DBConnectionMurphy.getDBConnection();
         connection = DBConnectionMurphy.connection;

         if (keyword.isEmpty()) {
        	 String selectSQL = "SELECT * FROM carTableMurphy";
//            String selectSQL = "SELECT * FROM myTableMurphy0907";
            preparedStatement = connection.prepareStatement(selectSQL);
         } else {
            String selectSQL = "SELECT * FROM carTableMurphy WHERE MAKE LIKE ?";
//            String selectSQL = "SELECT * FROM myTableMurphy0907 WHERE EMAIL LIKE ?";
            String carMake = "%" + keyword + "%";
//            String theUserEmail = "%" + keyword + "%";
            preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setString(1, carMake);
//            preparedStatement.setString(1, theUserEmail);
         }
         ResultSet rs = preparedStatement.executeQuery();

         while (rs.next()) {
        	 int id = rs.getInt("id");
        	 String year = rs.getString("year").trim();
        	 String make = rs.getString("make").trim();
        	 String model = rs.getString("model").trim();
        	 String price = rs.getString("price").trim();
        	 
        	 if (keyword.isEmpty() || make.contains(keyword)) {
        		 out.println("ID: " + id + ", ");
        		 out.println("Year: " + year + ", ");
        		 out.println("Make: " + make + ", ");
        		 out.println("Model: " + model + ", ");
        		 out.println("Price: " + price + "<br>");
        	 }
//            int id = rs.getInt("id");
//            String userName = rs.getString("myuser").trim();
//            String email = rs.getString("email").trim();
//            String phone = rs.getString("phone").trim();
//            String address = rs.getString("address").trim();
//
//            if (keyword.isEmpty() || email.contains(keyword)) {
//               out.println("ID: " + id + ", ");
//               out.println("User: " + userName + ", ");
//               out.println("Email: " + email + ", ");
//               out.println("Phone: " + phone + ", ");
//               out.println("Address: " + address + "<br>");
//            }
         }
         out.println("<a href=/techExercise-Murphy/search_murphy.html>Search Inventory</a> <br>");
         out.println("<a href=/techExercise-Murphy/insert_murphy.html>Insert Vehicle</a> <br>");
         out.println("<a href=/techExercise-Murphy/delete_murphy.html>Remove Vehicle</a> <br>");
//         out.println("<a href=/webproject-ex-0907-murphy/search_murphy.html>Search Data</a> <br>");
         out.println("</body></html>");
         rs.close();
         preparedStatement.close();
         connection.close();
      } catch (SQLException se) {
         se.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if (preparedStatement != null)
               preparedStatement.close();
         } catch (SQLException se2) {
         }
         try {
            if (connection != null)
               connection.close();
         } catch (SQLException se) {
            se.printStackTrace();
         }
      }
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }

}
