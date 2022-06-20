/*   Created by IntelliJ IDEA.
 *   Author: Devansh Shukla (D-Coder135)
 *   Date: 20-06-2022/06/2022
 *   Time: 11:36 PM
 *   File: DaoFactory
 */

package com.example.apache_tomcat_demo.dao;

import org.apache.ibatis.io.Resources;

import java.io.InputStream;

public final class DaoFactory {

    private DaoFactory() {
    }

    public static CustomerDao getCustomerDao() {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
    }
}
