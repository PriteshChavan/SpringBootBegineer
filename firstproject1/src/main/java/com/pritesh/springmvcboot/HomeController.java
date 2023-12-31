package com.pritesh.springmvcboot;

import java.util.List;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pritesh.springmvcboot.model.Alien;

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
	
/*	@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m) {
		
		
		//ModelAndView mv = new ModelAndView("result");
		//mv.setViewName("result");
		
		int num3 = i+j;
		//mv.addObject("num3",num3);
		m.addAttribute("num3", num3);
		return "result";
		//return "result.jsp?num3=" + num3;
	}
	*/
	//replacement for upper code
	
	@GetMapping("getAliens")
	public String getAliens(Model m) {
		List<Alien> aliens = Arrays.asList(new Alien(101,"Naven"), new Alien(102,"Pritesh"));
		
		m.addAttribute("result", aliens);
		
		return "showAliens";
	}
	
	
	//@RequestMapping(value="addAlien", method=RequestMethod.POST)
	@PostMapping(value="addAlien")
	public String addAlien(@ModelAttribute Alien a, Model m) {
		
//		Alien a = new Alien();
//		a.setAid(aid);
//		a.setAname(aname);
		
		//m.addAttribute("alien", a);
		
		return "result";
	}
	
}
