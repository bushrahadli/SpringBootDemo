package com.learn.SpringBootDemo.course.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.SpringBootDemo.course.controller.bean.Course;

@RestController
public class CourseController {

	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return Arrays.asList(new Course(1, "First Course", "Authored"));
	}
	
}
	