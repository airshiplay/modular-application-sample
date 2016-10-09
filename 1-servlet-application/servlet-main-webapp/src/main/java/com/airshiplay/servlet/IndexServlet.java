package com.airshiplay.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet(name = "index", urlPatterns = "/index")
public class IndexServlet extends HttpServlet {
	private static final Logger logger = LoggerFactory
			.getLogger(IndexServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		logger.info("get");
		resp.getWriter().append("index").close();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		logger.info("pose");
		req.getRequestDispatcher("views/user/user.jsp").forward(req, resp);
	}
}
