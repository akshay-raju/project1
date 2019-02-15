package com.Assignment1;

public class PracStudent {

	public static void main(String[] args) {
		Person p = new Person("Raja","Khammmam");
		Student s = new Student("Renu","Vizag");
		Teacher t = new Teacher("Sahithi","Kakinda");
		System.out.println(t.addCourse("Maths"));
		System.out.println(s.addCourseGrade("Maths",89));

	}

}
