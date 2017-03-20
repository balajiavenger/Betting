package com.bet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.bet.dao.Restdao;
import com.bet.model.User;

import  javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class BetController {	
	 
	    @RequestMapping("/login")
	    public ModelAndView login(@ModelAttribute("User") User user) {
	    	ModelAndView mv = null;
	    	System.out.println("dad"+user.getFirstName());
	 if(user.getFirstName()!=null){
	    	  mv = new ModelAndView("login","error","Registration Success");
	 }
	 else
	 {
		 mv = new ModelAndView("login");
	 }
	    	 return mv;
	    }
	
	    @RequestMapping("/signup")
	    public ModelAndView signup(@ModelAttribute("User") User user) {
	    	 ModelAndView mv = null;
	    	if(user.getFirstName()!=null){
		    	  mv = new ModelAndView("signup","error","Username already exist");
		 }
		 else
	    	  mv = new ModelAndView("signup");
	         return mv;
		 
	    }
	    
	    @RequestMapping(value="/Register", method = RequestMethod.POST)
	    public String  register(@ModelAttribute("User") User user,HttpServletRequest req){//,RedirectAttributes redir) {
	    	System.out.println("succss"+user.getPassword());
	    	Restdao rst = new Restdao();
	    	int id =rst.register(user);
	    	System.out.println("dao result value"+id);
	    	//redir.addFlashAttribute("error","Registration successfull");
	    	if(id != 0)
	    	{
	    		return "forward:/login";	
	    	}
	    	else
	    	{
	    		return "forward:/signup";
	    	}
	    }
	    
	    @RequestMapping(value="/checkUserStatus" , method = RequestMethod.POST)
	    public void userstatus(ModelMap model, HttpSession session,HttpServletResponse response,
				HttpServletRequest request,@RequestParam(value = "apass", required = true)String password,@RequestParam(value = "aCode", required = true)String name) throws IOException{

				try {
					PrintWriter out = null;
					out = response.getWriter();
					System.out.println("Balaji Success"+password);
				System.out.println("Balaji Success"+name);
				Restdao rs = new Restdao();
				int acc = rs.login(name, password);
					if(acc>0)
						out.print("true");
					else
						out.print("false");
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				
			}
	    @RequestMapping("/dashboard")
	    public ModelAndView getDashboard() {
	 
	    	 ModelAndView mv = new ModelAndView("dashboard");
	         return mv;
	    }

}
