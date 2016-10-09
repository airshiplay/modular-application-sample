package com.airshiplay.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebFilter(urlPatterns = "/user/*")
public class UserFilter implements Filter {
	private static final Logger logger = LoggerFactory
			.getLogger(UserFilter.class);

	public void destroy() {
		logger.info("filter destroy");
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain filterChain) throws IOException, ServletException {
		logger.info("filter doFilter");
		filterChain.doFilter(arg0, arg1);
	}

	public void init(FilterConfig arg0) throws ServletException {
		logger.info("user filter init");
	}

}
