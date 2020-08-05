package com.customer.tag;

import java.io.IOException;
import java.util.List;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.customer.model.Customer;

public class CustomerResult extends SimpleTagSupport {

	private List<Customer> customerList;

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	@Override
	public void doTag() throws IOException {
		JspWriter out = getJspContext().getOut();
		String headings[] = { "Id", "Name", "Gender", "Age", "City", "Contact" };
		out.print("<table border='1px'>");
		out.print("<tr>");
		for (String heading : headings) {
			out.print("<th>" + heading + "</th>");
		}
		out.print("</tr>");
		for (Customer customer : customerList) {
			out.print("<tr>");
			out.print("<td>" + customer.getId() + "</td>");
			out.print("<td>" + customer.getName() + "</td>");
			out.print("<td>" + customer.getGender() + "</td>");
			out.print("<td>" + customer.getAge() + "</td>");
			out.print("<td>" + customer.getCity() + "</td>");
			out.print("<td>" + customer.getContact() + "</td>");
			out.print("</tr>");
		}
		out.print("</table>");
	}
}
