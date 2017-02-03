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
		Book b1 = new Book(18, "Mathematics", 200, "R.D.Sharma");
		Book b2 = new Book(18, "Physics", 200, "H.C.Verma");
		List<Book> l = new ArrayList<Book>();
		l.add(b1);
		l.add(b2);
		return l;
	}

}
