/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.CourseWork.Course;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentProfile extends Profile {

    Person person;
    private ArrayList<Course> courseList;

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
    
    public boolean isMatch(int id) {
        return person.getPersonId() == id;
    }

}
