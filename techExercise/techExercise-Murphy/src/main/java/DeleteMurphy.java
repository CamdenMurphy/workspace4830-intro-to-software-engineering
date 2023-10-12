
/**
 * @file SimpleFormInsert.java
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteMurphy")
public class DeleteMurphy extends HttpServlet {
   private static final long serialVersionUID = 1L;

   public DeleteMurphy() {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	   String id = request.getParameter("id");
//	 String year = request.getParameter("year");
//     String make = request.getParameter("make");
//     String model = request.getParameter("model");
//     String price = request.getParameter("price");
     
			  
//			   Year: <input type="text" name="year"> <br />
//				Make: <input type="text" name="make"> <br />
//				Model: <input type="text" name="model"> <br />
//				Price: <input type="text" name="price"> <br />
				
//      String userName = request.getParameter("userName");
//      String email = request.getParameter("email");
//      String phone = request.getParameter("phone");
//      String address = request.getParameter("address");

      Connection connection = null;
      String deleteSql = " DELETE FROM carTableMurphy WHERE id = ?" ;
//      String insertSql = " INSERT INTO carTableMurphy (id, MYUSER, EMAIL, PHONE, ADDRESS) values (default, ?, ?, ?, ?)";

      try {
         DBConnectionMurphy.getDBConnection();
         connection = DBConnectionMurphy.connection;
         PreparedStatement preparedStmt = connection.prepareStatement(deleteSql);
         preparedStmt.setString(1, id);
        
         preparedStmt.execute();
         connection.close();
      } catch (Exception e) {
         e.printStackTrace();
      }

      // Set response content type
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "Vehicle Removed!";
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
      out.println(docType + //
            "<html>\n" + //
            "<head><title>" + title + "</title></head>\n" + //
            "<body bgcolor=\"#f0f0f0\">\n" + //
            "<h2 align=\"center\">" + title + "</h2>\n" + //
            "<ul>\n" + //

            "  <li><b>ID</b>: " + id + "\n" + //

            "</ul>\n");

      out.println("<a href=/techExercise-Murphy/search_murphy.html>Search Inventory</a> <br>");
      out.println("<a href=/techExercise-Murphy/insert_murphy.html>Insert Vehicle</a> <br>");
      out.println("<a href=/techExercise-Murphy/delete_murphy.html>Remove Vehicle</a> <br>");
      out.println("</body></html>");
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }

}
