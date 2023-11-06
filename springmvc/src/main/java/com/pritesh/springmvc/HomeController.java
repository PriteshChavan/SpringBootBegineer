package com.pritesh.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pritesh.springmvc.model.Alien;

@Controller
public class HomeController 
{
	
	@ModelAttribute
	public void modelData(Model m){
		m.addAttribute("name","Alien");
	}
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
/*	@RequestMapping("add")
	public String add(HttpServletRequest req) {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int num3 = i+j;
		
		HttpSession session = req.getSession();
		session.setAttribute("num5", num3);
		return "result.jsp";
		//return "result.jsp?num3=" + num3;
	}*/
	
	@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m) {
		
		
		//ModelAndView mv = new ModelAndView("result");
		//mv.setViewName("result");
		
		int num3 = i+j;
		//mv.addObject("num3",num3);
		m.addAttribute("num3", num3);
		return "result";
		//return "result.jsp?num3=" + num3;
	}
	
	@RequestMapping("addAlien")
	public String addAlien(@ModelAttribute Alien a, Model m) {
		
//		Alien a = new Alien();
//		a.setAid(aid);
//		a.setAname(aname);
		
		//m.addAttribute("alien", a);
		
		return "result";
	}
	
}
