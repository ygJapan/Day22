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
		customers.add(new String[] {"3/1","国語","古文の教科書100ページから120ページをやる"});
		customers.add(new String[] {"3/2","数学","数Aの教科書80ページから95ページをやる"});
		customers.add(new String[] {"3/3","社会","日本史の教科書70ページから75ページを暗記する"});
		customers.add(new String[] {"3/4","理科","元素記号全て暗記する"});
		customers.add(new String[] {"3/5","英語","この世の全ての全単語を暗記する"});
		mv.addObject("customers",customers);
		mv.setViewName("index");
		return mv;
	}
	
//	public ModelAndView indexPost(ModelAndView mv) {
//		ArrayList<String[]>customers = new ArrayList<String[]>();
//		customers.add(new String[] {"佐藤HTML太郎","35歳","男性"});
//		customers.add(new String[] {"鈴木Java太郎","24歳","男性"});
//		customers.add(new String[] {"高橋CSS子","29歳","女性"});
//		mv.addObject("customers",customers);
//		mv.setViewName("index");
//		return mv;
}
