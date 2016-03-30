package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.vo.UserVo;

@Controller
public class HelloController {

	@RequestMapping(value="greet")
	@ResponseBody
	public String greet(){
		return "hello this is jay";
	}
	
	
	
	@RequestMapping(value="greet1")
	@ResponseBody
	public UserVo greet1(){
		UserVo vo = new UserVo();
		vo.setName("jay");
		vo.setSkill("java");
		return vo;
	}
	
	
	@RequestMapping(value="greet2")
	public String greet2(Model model){
		model.addAttribute("name", "jay");
		return "hello";
		
	}
	
	@RequestMapping(value="greet3/{name}")
	public String greet3(Model model,@PathVariable String name){
		model.addAttribute("name", name);
		return "hello";
	}
	
	@RequestMapping("/doit")
	public String doIt(Model model) {
		
		model.addAttribute("hello", "Hello------");
		model.addAttribute("world", "World------");
		
		return "test";
	}
	
}
