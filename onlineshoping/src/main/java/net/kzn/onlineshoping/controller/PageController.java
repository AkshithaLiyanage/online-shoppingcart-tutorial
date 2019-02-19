package net.kzn.onlineshoping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.shopingbackend.dao.CategoryDAO;


@Controller
public class PageController {

	@Autowired
	CategoryDAO categorydao;
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("categories",categorydao.list());
		mv.addObject("userClickHome", true);
		
		mv.addObject("title","Home");
		return mv;
		
	}

	@RequestMapping(value= {"/about"})
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickAbout",true);
		mv.addObject("title", "About");
		return mv;
	}
	
	@RequestMapping(value= {"/contact"})
	public ModelAndView contact() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickContact", true);
		mv.addObject("title", "Contact");
		return mv;
	}
}
