package com.webmvc.notice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	public void  execute(HttpServletRequest req, HttpServletResponse resp);
	public String getViewPage();
	public boolean isForward();
	
}
