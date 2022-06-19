/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 19-06-2022/06/2022
 *   Time: 01:07 PM
 *   File: DateTag
 */

package com.example.apache_tomcat_demo;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;
import java.util.Date;

public class DateTag extends TagSupport {

    @Override
    public int doStartTag() throws JspException {

        JspWriter out = pageContext.getOut();
        try {
            out.println(new Date().toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return super.doStartTag();
    }
}
