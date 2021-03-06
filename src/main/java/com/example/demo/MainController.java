package com.example.demo;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping(value="/")
	public ModelAndView indexPost(ModelAndView mv) {
		ArrayList<String[]>customers = new ArrayList<String[]>();
		customers.add(new String[] {"佐藤HTML太郎","35歳","男性"});
		customers.add(new String[] {"鈴木Java太郎","24歳","男性"});
		customers.add(new String[] {"高橋CSS子","29歳","女性"});
		mv.addObject("customers",customers);
		mv.setViewName("index");
		return mv;
	}
}
