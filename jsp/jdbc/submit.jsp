<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" %>
<%@ page import="java.sql.*" %>

<%
    // Get the form data from the request object
    String name = request.getParameter("name");
    String address = request.getParameter("address");

    
    // Establish the database connection
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    String query = "insert into voters values(?,?)";
    
    try{
    	Class.forName("com.mysql.jdbc.Driver");
    	conn = DriverManager.getConnection("jdbc:mysql://localhost:4306/db","root","");
    	ps = conn.prepareStatement(query);
    	ps.setString(1,name);
    	ps.setString(2,address);
    	int i = ps.executeUpdate();
    	if(i>0){
    		out.println("data successfully uploaded");
    	}else{
    		out.print("Error");
    	}
    	
    }
    catch(Exception e){
    	out.print(e);
    }
    
%>
