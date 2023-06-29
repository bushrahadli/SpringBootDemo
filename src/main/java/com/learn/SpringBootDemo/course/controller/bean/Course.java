package com.learn.SpringBootDemo.course.controller.bean;

import lombok.Data;

@Data
public class Course implements Comparable{

	private int id;
	private String courseName;
	private int authorName;
	private String title;
	
	
	public Course(int id, String courseName, int authorName) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.authorName = authorName;
	}


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return this.id-((Course) o).getId();
	}
	
	
	
}
