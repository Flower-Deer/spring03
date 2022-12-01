package com.multi.mvc03;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //서버프로그램에 싱글톤으로 만들어지는 부품 ,구성요소
public class BookDAO {

	//mybatis를 끼자
	@Autowired
	SqlSessionTemplate my; //SqlSessionTemplate객체를 오토로 찾음 //=@inject ("my") =이름으로 찾음
	
	public void insert(BookVO vo) {
		my.insert("book.create", vo);
	}
	public void update(BookVO vo) {
		my.update("book.up2", vo);
	}
	public void delete(BookVO vo) {
		my.delete("book.delete2", vo);
	}
	
	public BookVO one(BookVO vo) {
		//BookVO bag = my.selectOne("book.one", vo); //bookVO
		//return bag;
		return my.selectOne("book.one", vo);
	}
	
	public List<BookVO> all() {
		return my.selectList("book.all");
	}
}