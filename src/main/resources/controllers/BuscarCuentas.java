package controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BuscarCuentas")
public class BuscarCuentas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BuscarCuentas() {
        super();
    }

	public ServletConfig getServletConfig() {
		return null;
	}

	public String getServletInfo() {
		return null; 
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String dni = request.getParameter("dni");
		String saldo = request.getParameter("saldo");
		Query queryClien = new Query();
		try {
			//System.out.println(con.Authentication(user, password));
			if(queryClien.Authentication(user, password))
			//if(user.equals("juan") && password.equals("0000"))
				response.sendRedirect("main.jsp");
			else
				response.sendRedirect("error.jsp");
		} catch (SQLException e) {
			System.out.println("Error");
		}
	}

}
