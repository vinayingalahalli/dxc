package com.tags;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class UppercaseTag extends SimpleTagSupport {

	
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out=getJspContext().getOut();
		StringWriter sw=new StringWriter();
		getJspBody().invoke(sw);
		out.print(sw.toString().toUpperCase());
		
	}
}
