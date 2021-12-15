package com.example.demo.controller;

import java.io.IOException;
import java.security.Provider.Service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class StudentController {
	
	@Autowired
	EmpService service;



	@RequestMapping("/")
	public ModelAndView dem(ModelAndView mv) {
	mv.setViewName("index");
	
	return mv;
	}

	@RequestMapping("/print")
	public ModelAndView demo(@RequestParam("name") String name, ModelAndView mv)
	{
	mv.setViewName("index");
	mv.addObject("username",name);
	return mv;
	}

	@RequestMapping("/save")
	public ModelAndView empsave(ModelAndView mv, Employee emp)
	{
	service.saveEmp(emp);
	mv.setViewName("index");
	List<Employee> list = service.getEmployees();
	System.out.println(emp);
	mv.addObject("all",list);
	return mv;
	}

	@RequestMapping(value = "/delete/{id}")
	public ModelAndView deleteEmp(@PathVariable("id") int id,ModelAndView mv){
	mv.setViewName("redirect:/save");
	service.deleteEmp(id);
	return mv;
	}
	
	@RequestMapping(value = "/edit")
	public ModelAndView editEmp(@RequestParam("id") int id,ModelAndView mv){
	mv.setViewName("update");
	mv.addObject("id",id);
	return mv;
	}
	}