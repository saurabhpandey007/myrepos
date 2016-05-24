package com.rest.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("/hello")
public class Hello {

	
	@GET
	  @Produces(MediaType.TEXT_PLAIN)
	  public String sayPlainTextHello() {
	    return "Hello Jersey from plain";
	  }

	  // This method is called if XML is request
	  @GET
	  @Produces(MediaType.TEXT_XML)
	  public String sayXMLHello() {
	    return "<?xml version=\"1.0\"?>" + "<hello>"+"<h1>"+" Hello Jersey from xml"+"</h1>" + "</hello>";
	  }

	  // This method is called if HTML is request
	  @GET
	  @Produces(MediaType.TEXT_HTML)
	  public String sayHtmlHello() {
	    return "<html> " + "<title>" + "Hello Jersey " + "</title>"
	        + "<body><h1>" + "Hello Jersey from html" +"</h1>"+ "</body>" + "</html> ";
	  }
	  
	  
	  @GET
	  @Path("/get")
	 	@Produces( MediaType.APPLICATION_JSON )
		public Customer getData()  {
		  Customer cust = new Customer();        
          cust .setCustNo(Integer.parseInt("101"));
          cust .setCustName("Java4s");
          cust .setCustCountry("India");
       return cust;
	  }
}
