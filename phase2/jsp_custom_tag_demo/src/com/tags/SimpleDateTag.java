package com.tags;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleDateTag extends SimpleTagSupport {

	@Override
	public void doTag() throws IOException {
		JspWriter out=getJspContext().getOut();
		out.print(new SimpleDateFormat("dd-MMMM-yyyy EEEE HH:mm:ss").format(new Date()));
	}
}
