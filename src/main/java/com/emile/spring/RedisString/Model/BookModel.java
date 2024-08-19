package com.emile.spring.RedisString.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class BookModel implements Serializable {

    @Id
    private String isbn;
    private String title;
    private String country;


    @Override
    public String toString() {
        return "Book{" + "isbn='" + isbn + '\'' + ", title='" + title + '\'' + ", country='" + country + '\'' + '}';
    }

}
