package com.multi.mvc03;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@Autowired
	MemberDAO dao;
	
	@RequestMapping("one3")
	public void one(MemberVO vo, Model model) {
		MemberVO result = dao.one(vo);
		model.addAttribute("vo", result);
	}
	
	@RequestMapping("all3")
	public void all(Model model) {
		List<MemberVO> list = dao.all();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("insert2")
	public void insert(MemberVO vo) {
		dao.insert(vo);
	}
	
	@RequestMapping("update")
	public void update(MemberVO vo) {
		dao.update(vo);
	}
	
}
