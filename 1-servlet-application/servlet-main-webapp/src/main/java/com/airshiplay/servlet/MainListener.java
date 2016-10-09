package com.airshiplay.servlet;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebListener
public class MainListener implements ServletRequestListener {
	private static final Logger logger = LoggerFactory
			.getLogger(MainListener.class);

	public void requestDestroyed(ServletRequestEvent arg0) {
		logger.debug("requestDestroyed");
	}

	public void requestInitialized(ServletRequestEvent arg0) {
		logger.debug("requestInitialized");
	}

}
