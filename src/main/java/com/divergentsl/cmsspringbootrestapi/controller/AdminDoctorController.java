package com.divergentsl.cmsspringbootrestapi.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminDoctorController {

	private static final long serialVersionUID = 1L;

	private Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());

	@PostMapping("adminlogin")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("username");
		String password = request.getParameter("password");

		if (password.equals("admin123")) {
			ModelAndView modelAndView = new ModelAndView("adminpanel");
			return modelAndView;
		} else {
			ModelAndView modelAndView = new ModelAndView("index");
			modelAndView.addObject(password,"Incorrect Username and Password");
			return modelAndView;
		}
	}

}
