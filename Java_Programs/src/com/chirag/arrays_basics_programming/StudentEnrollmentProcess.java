package com.chirag.arrays_basics_programming;

record Course(Integer id, String name, Double fee) {
}

record Offer(String offerText) {
}

record EducationInstitute(Course[] courses, Offer[] offers) {
	public void enrollStudentInCourse(int courseId, String studentName) {
		boolean isFound = false;

		for (Course course : courses) {
			if (course.id() == courseId) {
				IO.println(studentName + " enrolled in: " + course.name());
				isFound = true;
				break;
			}
		}
		if (!isFound) {
			System.err.println("Course with ID " + courseId + " not found.");
		}
	}
}

record Student(String name, EducationInstitute institute) {
	public void viewCoursesAndFees() {
		for (Course course : institute.courses()) {
			IO.println(course.id() + " : " + course.name() + " : " + course.fee());
		}
	}

	public void viewOffers() {
		for (Offer offer : institute.offers()) {
			IO.println(offer.offerText());
		}
	}

	public void enrollInCourse(int courseId) {
		institute.enrollStudentInCourse(courseId, name);
	}
}

public class StudentEnrollmentProcess {
	public static void main(String[] args) {

		Course c1 = new Course(1, "Java", 35000.0);
		Course c2 = new Course(2, ".Net", 30000.0);
		Course c3 = new Course(3, "Python", 32000.0);

		Course[] courses = { c1, c2, c3 };

		Offer offer1 = new Offer("Special discount: Get 20% off on all courses!");
		Offer offer2 = new Offer("Limited time offer: Enroll in any two courses and get one course free!");

		Offer[] offers = { offer1, offer2 };

		EducationInstitute institute = new EducationInstitute(courses, offers);

		String name = IO.readln("Enter student name: ");

		Student student = new Student(name, institute);

		student.viewCoursesAndFees();
		student.viewOffers();

		int input = Integer.parseInt(IO.readln("Enter course ID to enroll: "));
		student.enrollInCourse(input);
	}
}
