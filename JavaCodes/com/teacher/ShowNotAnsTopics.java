package com.teacher;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.add.sq.DaoRegister;

@WebServlet("/ShowNotAnsTopics")
public class ShowNotAnsTopics extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ShowNotAnsTopics() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DaoRegister dao=new DaoRegister();
		String loginId= (String)request.getParameter("loginId");
		PrintWriter out= response.getWriter(); 
		try {
			out.println(dao.showNotAnsTopics(Integer.parseInt(loginId)));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
