package com.rest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rest.model.Book;
import com.rest.service.ExampleService;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService{

	@Override
	public List<Book> getBook(String id) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		b1.setAuthor("R.D.Sharma");
		b1.setId(18);
		b1.setPages(200);
		b1.setTitle("Mathematics");
		
		Book b2 = new Book();
		b2.setAuthor("H.C.Verma");
		b2.setId(18);
		b2.setPages(200);
		b2.setTitle("Physics");
		
		List<Book> l = new ArrayList<Book>();
		l.add(b1);
		l.add(b2);
		return l;
	}

	@Override
	public Book getBookXml(String id) {
		// TODO Auto-generated method stub
		Book b1 = new Book("R.D.Sharma");
//		b1.setAuthor();
		b1.setId(18);
		b1.setPages(200);
		b1.setTitle("Mathematics");
		
		Book b2 = new Book();
		b2.setAuthor("H.C.Verma");
		b2.setId(18);
		b2.setPages(200);
		b2.setTitle("Physics");
		
		List<Book> l = new ArrayList<Book>();
		l.add(b1);
		l.add(b2);
		return b1;
	}
}
