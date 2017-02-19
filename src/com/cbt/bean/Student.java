package com.cbt.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {
	private String name;
	private Address addr;
	private String[] books;
	private List<String> hobbies;
	private Map<String, Integer> gradeMap;
	private String wife;
	private Set<String> games;
	private Properties info;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public void setBooks(String[] books) {
		this.books = books;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public void setGradeMap(Map<String, Integer> gradeMap) {
		this.gradeMap = gradeMap;
	}
	public void setWife(String wife) {
		this.wife = wife;
	}
	public void setGames(Set<String> games) {
		this.games = games;
	}
	public void setInfo(Properties info) {
		this.info = info;
	}
	
	
	public void show(){
		System.out.println("name="+name);
		System.out.println("addr="+addr.getAddr());
		System.out.println("books="+Arrays.toString(books));
		System.out.println("hobbies="+hobbies);
		System.out.println("gradeMap="+gradeMap);
		System.out.println("wife="+wife);
		System.out.println("games="+games);
		System.out.println("info="+info);
	}
}
