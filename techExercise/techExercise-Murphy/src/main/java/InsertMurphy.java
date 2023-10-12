
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

@WebServlet("/InsertMurphy")
public class InsertMurphy extends HttpServlet {
   private static final long serialVersionUID = 1L;

   public InsertMurphy() {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 String year = request.getParameter("year");
     String make = request.getParameter("make");
     String model = request.getParameter("model");
     String price = request.getParameter("price");
			  
//			   Year: <input type="text" name="year"> <br />
//				Make: <input type="text" name="make"> <br />
//				Model: <input type="text" name="model"> <br />
//				Price: <input type="text" name="price"> <br />
				
//      String userName = request.getParameter("userName");
//      String email = request.getParameter("email");
//      String phone = request.getParameter("phone");
//      String address = request.getParameter("address");

      Connection connection = null;
      String insertSql = " INSERT INTO carTableMurphy (id, YEAR, MAKE, MODEL, PRICE) values (default, ?, ?, ?, ?)";
//      String insertSql = " INSERT INTO carTableMurphy (id, MYUSER, EMAIL, PHONE, ADDRESS) values (default, ?, ?, ?, ?)";

      try {
         DBConnectionMurphy.getDBConnection();
         connection = DBConnectionMurphy.connection;
         PreparedStatement preparedStmt = connection.prepareStatement(insertSql);
         preparedStmt.setString(1, year);
         preparedStmt.setString(2, make);
         preparedStmt.setString(3, model);
         preparedStmt.setString(4, price);
        
         preparedStmt.execute();
         connection.close();
      } catch (Exception e) {
         e.printStackTrace();
      }

      // Set response content type
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "Vehicle Added!";
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
      out.println(docType + //
            "<html>\n" + //
            "<head><title>" + title + "</title></head>\n" + //
            "<body bgcolor=\"#f0f0f0\">\n" + //
            "<h2 align=\"center\">" + title + "</h2>\n" + //
            "<ul>\n" + //

            "  <li><b>Year</b>: " + year + "\n" + //
            "  <li><b>Make</b>: " + make + "\n" + //
            "  <li><b>Model</b>: " + model + "\n" + //
            "  <li><b>Price</b>: " + price + "\n" + //

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
