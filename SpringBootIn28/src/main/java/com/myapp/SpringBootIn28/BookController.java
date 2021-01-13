package com.myapp.SpringBootIn28;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
@GetMapping("/books")
public List<Book> books(){
	List<Book> bookList = new ArrayList<>();
	bookList.add(new Book(10,"My Half Girlfreinds","Sudarshan"));
	bookList.add(new Book(11,"Trauman","Sowmya"));
	bookList.add(new Book(11,"My Half Fooklamn","Saritha"));
	return bookList;
}
}
