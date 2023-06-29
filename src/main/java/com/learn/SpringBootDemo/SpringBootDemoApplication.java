package com.learn.SpringBootDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.learn.SpringBootDemo.course.controller.bean.Course;

@SpringBootApplication
public class SpringBootDemoApplication extends Object{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
		
		
	     Course restWithSpring = new Course(1, "REST with Spring", 99); 
	     Course learnSpringSecurity = new Course(2, "Learn Spring Security", 110); 
	     Course introToSpringMVC4 = new Course(3, "Introduction to Spring MVC 4", 0);

	   //  Read more: https://www.java67.com/2017/07/how-to-sort-arraylist-of-objects-using.html#ixzz82LoDsAzn
	     List<Course> listOfCourses = new ArrayList<>();
	     listOfCourses.add(restWithSpring);
	     listOfCourses.add(learnSpringSecurity);
	     listOfCourses.add(introToSpringMVC4);
	     
	     Comparator<Course> titleComparator 
	     = (c1, c2) -> c1.getTitle().compareTo(c2.getTitle()); 
	     
	     listOfCourses.sort(titleComparator);
	     
	     Collections.sort((List<Course>) listOfCourses);
	     
	}

}
