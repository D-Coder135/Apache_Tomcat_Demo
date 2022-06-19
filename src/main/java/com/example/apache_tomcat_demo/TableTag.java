/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 19-06-2022/06/2022
 *   Time: 11:16 PM
 *   File: TableTag
 */

package com.example.apache_tomcat_demo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class TableTag extends BodyTagSupport {

    @Override
    public int doAfterBody() throws JspException {

        JspWriter out = getPreviousOut();

        String content = getBodyContent().getString().trim();

        try {
            String[] rows = content.split("\n");
            out.println("<table border = '1'>");
            out.println("<thead>");
            out.println("<tr>");
            String[] values = rows[0].split(",");

            out.println("</tr>");
            out.println("</thead>");
            out.println("</table>");
        } catch (Exception ex) {

        }

        return super.doAfterBody();
    }
}
