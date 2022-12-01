package com.multi.mvc03;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //�������α׷��� �̱������� ��������� ��ǰ ,�������
public class BookDAO {

	//mybatis�� ����
	@Autowired
	SqlSessionTemplate my; //SqlSessionTemplate��ü�� ����� ã�� //=@inject ("my") =�̸����� ã��
	
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