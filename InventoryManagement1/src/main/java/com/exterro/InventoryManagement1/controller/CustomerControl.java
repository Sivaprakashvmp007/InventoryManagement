package com.exterro.InventoryManagement1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exterro.InventoryManagement1.entity.CustomerEn;
import com.exterro.InventoryManagement1.service.CustomerService;

@Controller
public class CustomerControl {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("index")
	public String getHome() {
		return "index.html";
	}
	@RequestMapping("addCustomer")
	public String addCustomer(CustomerEn customer) {
		CustomerEn customer1=customerService.addCustomer(customer);
		return (customer1 !=null)?"success.html":"failure.html";
	}
	@RequestMapping("viewAllCustomer")
	@ResponseBody
	
	public String viewAllCustomer() {
		//return customerService.viewAllCustomer();
		String result = "<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "<title>Inventory Management</title>\r\n"
				+ "<meta charset=\"utf-8\">\r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
				+ "<style>\r\n"
				+ "* {\r\n"
				+ "  box-sizing: border-box;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "body {\r\n"
				+ "  font-family:'Times New Roman', Times, serif;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "/* Style the header */\r\n"
				+ "header {\r\n"
				+ "  background-color: #034f84;\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "  padding: 28px;\r\n"
				+ "  text-align: center;\r\n"
				+ "  font-size: 35px;\r\n"
				+ "  color: rgb(253, 253, 253);\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "/* Create two columns/boxes that floats next to each other */\r\n"
				+ "nav {\r\n"
				+ "  float: left;\r\n"
				+ "  width: 30%;\r\n"
				+ "  height: 400px; /* only for demonstration, should be removed */\r\n"
				+ "  background-color:#92a8d1;\r\n"
				+ "  \r\n"
				+ "  padding: 1px;\r\n"
				+ "  text-decoration: none;\r\n"
				+ "  \r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "/* Style the list inside the menu */\r\n"
				+ "nav ul li a{\r\n"
				+ "  list-style-type: none;\r\n"
				+ "  padding: 0;\r\n"
				+ "  text-decoration: none;\r\n"
				+ "  padding:10px;\r\n"
				+ "  color:black;\r\n"
				+ "  padding-bottom:20px;\r\n"
				+ "  margin-bottom: 10px;\r\n"
				+ "  color:white;\r\n"
				+ "}\r\n"
				+ "li{\r\n"
				+ "  padding: 20px;\r\n"
				+ "  color: white;\r\n"
				+ "  font-size: 20px;\r\n"
				+ "  \r\n"
				+ "  text-decoration: none;\r\n"
				+ "}\r\n"
				+ "#storageBtn{\r\n"
				+ "  list-style-type: none;\r\n"
				+ "  padding: 0;\r\n"
				+ "  text-decoration: none;\r\n"
				+ "  \r\n"
				+ "  color:black;\r\n"
				+ "\r\n"
				+ "  text-decoration: none;\r\n"
				+ "  color:white;\r\n"
				+ "  border-color:#92a8d1;\r\n"
				+ "  background-color:#92a8d1;\r\n"
				+ "  box-shadow: none;\r\n"
				+ " \r\n"
				+ "  color: white;\r\n"
				+ "  font-size: 20px;\r\n"
				+ "  font-family: 'Times New Roman', Times, serif;\r\n"
				+ "\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "article {\r\n"
				+ "  float: left;\r\n"
				+ "  padding: 20px;\r\n"
				+ "  width: 70%;\r\n"
				+ "  color:#000000;\r\n"
				+ "  background-color: #dfe0e2;\r\n"
				+ "  height: 400px; /* only for demonstration, should be removed */\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "/* Clear floats after the columns */\r\n"
				+ "section::after {\r\n"
				+ "  content: \"\";\r\n"
				+ "  display: table;\r\n"
				+ "  clear: both;\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "/* Style the footer */\r\n"
				+ "footer {\r\n"
				+ " \r\n"
				+ "  padding: 10px;\r\n"
				+ "  text-align: center;\r\n"
				+ "  color: white;\r\n"
				+ "  background-color: #034f84;\r\n"
				+ "  \r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */\r\n"
				+ "@media (max-width: 600px) {\r\n"
				+ "  nav, article {\r\n"
				+ "    width: 100%;\r\n"
				+ "    height: auto;\r\n"
				+ "  }\r\n"
				+ "}\r\n"
				+ "</style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<header>\r\n"
				+ "  <h2>Inventory Management</h2>\r\n"
				+ "</header>\r\n"
				+ "\r\n"
				+ "<section>\r\n"
				+ "  <nav>\r\n"
				+ "    <ul>\r\n"
				+ "      <li><a href=\"customer1.html\">Customer</a></li>\r\n"
				+ "      <li><a href=\"items.html\">Items</a></li>\r\n"
				+ "      <form action=\"viewAllItems\">\r\n"
				+ "    	<li><input type=\"submit\" value=\"Storage\" id=\"storageBtn\">\r\n"
				+ "    	</form></li>\r\n"
				+ "      <li><a href=\"order.html\">Order</a></li>\r\n"
				+ "      <li><a href=\"bill.html\">Bill</a></li>\r\n"
				+ "    </ul>\r\n"
				+ "  </nav>\r\n"
				+ "  \r\n"
				
				+ "  <article><h2>Customer List</h2> <table><tr><th>ID</th><th>Name</th><th>mobile</th><th>emailId</th></tr>";
		for(CustomerEn cus: customerService.viewAllCustomer()) {
			result += "<tr><td>"+cus.getcID()+"</td><td>"+cus.getcName()+"</td><td>"+cus.getcMobile()+"</td><td>"+cus.getcEmail()+"</td></tr>";
			}
		result += "</table><a href=\"customer1.html\">Back</a></article>\r\n"
				+ "</section>\r\n"
				+ "\r\n"
				+ "<footer>\r\n"
				+ "  <p>copy rights @abcInc.</p>\r\n"
				+ "</footer>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>";
		return result;
	}

	
	@RequestMapping("deleteCustomer")
	@ResponseBody
	public String deleteCustomer(String cID) {
		return customerService.deleteCustomer(cID);
	}
	
}
