package Business.CourseWork;

import java.util.ArrayList;

public class CourseCatalog {
    
    private ArrayList<Course> courseList;
    
    public CourseCatalog() {
        courseList = new ArrayList<>();
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public Course newCourse(String courseName, String description, ArrayList<Course> prerequisites, int courseHours) {
        Course course = new Course(courseName, description, prerequisites, courseHours);
        courseList.add(course);
        return course;
    }
    
    public void deleteCourse(Course courseToDelete) {
        if (courseToDelete != null) {
            courseList.remove(courseToDelete);
            // You can add more logic here if needed
        }
    }

    public Course findCourse(String courseName) {
        for (Course course : courseList) {
            if (course.getCourseName().equals(courseName)) {
                return course;
            }
        }
        return null; // Not found after going through the whole list
    }
    
    public ArrayList<Course> getCoursesByTermAndYear(String termAndYear) {
    ArrayList<Course> coursesByTermAndYear = new ArrayList<>();

    for (Course course : courseList) {
        if (course.isTermBased()) {
            String courseTermAndYear = course.getTerm() + " " + course.getTermYear();
            if (courseTermAndYear.equals(termAndYear)) {
                coursesByTermAndYear.add(course);
            }
        }
    }

    return coursesByTermAndYear;
}

    
}
