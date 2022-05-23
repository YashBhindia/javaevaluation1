package com.masai;

import java.util.Scanner;

public class Course {
	
	int courseId;
	String courseName;
	int courseFee;
	
    void displayCourseDetails(int courseId, String courseName, int courseFee) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
		
		System.out.println("course id is:"+courseId);
		System.out.println("course name is:"+courseName);
		System.out.println("coourse fee is:"+courseFee);
	}
	
	static void authenticate(String username,String password) {
		if(username == "Admin" && password == "1234") {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter couse name");
			String courseName = scan.nextLine();
			
			System.out.println("Enter course id");
			int courseid = scan.nextInt();
			
			System.out.println("Enter course fee");
			int courseFee = scan.nextInt();
			
			scan.close();
			
			Course k1 = new Course();
			k1.displayCourseDetails(courseid,courseName,courseFee);
		}
		else
			System.out.println("Invalid Username or password");
	}
	public static void main(String[] args) {
		
		
		authenticate("Admin","1234");
		
//		authenticate("Admni","12");
		
	}
	
	

}

