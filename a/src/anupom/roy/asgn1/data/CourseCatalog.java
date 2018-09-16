package anupom.roy.asgn1.data;

import anupom.roy.asgn1.dto.Course;
import anupom.roy.asgn1.exception.CourseNotFoundException;
import anupom.roy.asgn1.exception.DuplicateCourseException;

public interface CourseCatalog {
	public Course getCourse(String courseCode) throws CourseNotFoundException;

	public Course addCourse(Course course) throws DuplicateCourseException;

	public Course deleteCourse(String courseCode) throws CourseNotFoundException;

	public Course updateCourse(Course course) throws CourseNotFoundException;
}