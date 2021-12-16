package com.required;

import org.springframework.beans.factory.annotation.Required;

public class Book {
private Integer bookid;
private String name;
//@Required
public void setBookid(Integer bookid) {
this.bookid = bookid;
}
public Integer getBookid() {
return bookid;
}
//@Required
public void setName(String name) {
this.name = name;
}
public String getName() {
return name;
}}
