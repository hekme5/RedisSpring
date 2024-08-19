package com.emile.spring.RedisString.Repository;

import com.emile.spring.RedisString.Model.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<BookModel, String> {
}
