package com.bridgelabz.mongodemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bridgelabz.mongodemo.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
