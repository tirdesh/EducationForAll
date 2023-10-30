/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.CourseWork.Course;
import Business.Person.Person;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class StudentProfile extends Profile {

    Person person;
    private ArrayList<Course> courseList;
    private Map<Course, Integer> courseProgressMap = new HashMap<>();

    //    Transcript transcript;
    //   EmploymentHistroy employmenthistory;

    public StudentProfile(Person p) {
        super(p);
        courseList = new ArrayList<>();

//        transcript = new Transcript(this);
//        employmenthistory = new EmploymentHistroy();
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void addCourseToProfile(Course course) {
        courseList.add(course);
        updateCourseProgress(course, 0);
    }

    public void removeCourseFromProfile(Course course) {
        courseList.remove(course);
        courseProgressMap.remove(course); // Remove the grade when removing the course

    }
    
    public Course findCourse(String courseName) {
        for (Course course : courseList) {
            if (course.getCourseName().equals(courseName)) {
                return course;
            }
        }
        return null; // Not found after going through the whole list
    }
    
    public void updateCourseProgress(Course course, int progress) {
        if (progress >= 0 && progress <= 100) {
            courseProgressMap.put(course, progress);
        } else {
            // Handle invalid progress value...
        }
    }

    public Integer getCourseProgress(Course course) {
        return courseProgressMap.get(course);
    }
    
    public boolean isMatch(int id) {
        return person.getPersonId() == id;
    }

}
