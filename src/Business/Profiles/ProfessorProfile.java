/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;
import Business.CourseWork.Course;

import java.util.ArrayList;

public class ProfessorProfile extends Profile {
    private ArrayList<Course> courseList;

    public ProfessorProfile(Person p) {
        super(p);
        courseList = new ArrayList<>();
    }

    @Override
    public String getRole() {
        return "Professor";
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void addCourseToProfile(Course course) {
        courseList.add(course);
    }

    public void removeCourseFromProfile(Course course) {
        courseList.remove(course);
    }
    
    public Course findCourse(String courseName) {
        for (Course course : courseList) {
            if (course.getCourseName().equals(courseName)) {
                return course;
            }
        }
        return null; // Not found after going through the whole list
    }
    
}
