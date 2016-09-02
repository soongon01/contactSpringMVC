package kr.or.kosta.contact.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.or.kosta.contact.model.Contact;

@Controller
public class ContactAdminController {
	
	@RequestMapping("/hello")
	public @ResponseBody List<String> hello() {
		System.out.println("hello");
		
		List<String> list = new ArrayList<String>();
		list.add("kim");
		list.add("lee");
		list.add("park");
		
		return list;
	}
	
	@RequestMapping(value="/result")
	public @ResponseBody Map<String, String> result() {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("name", "kim");
		map.put("addr", "seoul");
		map.put("age", "20");
		
		return map;
	}
	
	@RequestMapping(value="/search")
	public @ResponseBody Contact search() {
		
		Contact contact = new Contact();
		contact.setId(1);
		contact.setName("kim");
		contact.setEmail("kim@a.a");
		contact.setAge(30);
		contact.setAddr("seoul");
		
		return contact;
	}
	
	@RequestMapping(value="/")
	public String index() {
		return "index"; // WEB-INF/views/index.jsp
	}
	
	@RequestMapping(value="/regist")
	public ModelAndView regist() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("regist");
		mav.addObject("name", "±è¼ø°ï");
		mav.addObject("greet", "¾È³çÇÏ¼¼¿ä");
		
		return mav;
	}
	
	@RequestMapping(value="/doCalc")
	public ModelAndView doCalc(HttpServletRequest request) {
		
		int numOne = Integer.parseInt(request.getParameter("numOne"));
		int numTwo = Integer.parseInt(request.getParameter("numTwo"));
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", numOne + numTwo);
		mav.setViewName("result");
		return mav;
	}
}




