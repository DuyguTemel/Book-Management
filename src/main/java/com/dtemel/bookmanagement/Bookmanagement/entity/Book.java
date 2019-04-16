package com.dtemel.bookmanagement.Bookmanagement.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Book implements Serializable{

    @Id
    @GeneratedValue
    private Long id;

    private String bookName;

    private String author;
}
