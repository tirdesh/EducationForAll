/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Person.Person;

import java.util.ArrayList;


public class StudentDirectory {


    ArrayList<StudentProfile> studentlist;

    public StudentDirectory() {

     studentlist = new ArrayList();

    }

    public ArrayList<StudentProfile> getStudentlist() {
        return studentlist;
    }

    public StudentProfile newStudentProfile(Person p) {

        StudentProfile sp = new StudentProfile(p);
        studentlist.add(sp);
        return sp;
    }
    
    public void deleteStudentProfile(StudentProfile profileToDelete) {
        if (profileToDelete != null) {
            studentlist.remove(profileToDelete);
        }
    }

    
    public StudentProfile findStudent(int id) {

        for (StudentProfile sp : studentlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
    }
    
    public StudentProfile findStudentWithMostCourses() {
        StudentProfile studentWithMostCourses = null;
        int maxCourseCount = 0;

        for (StudentProfile student : studentlist) {
            int courseCount = student.getCourseList().size();
            if (courseCount > maxCourseCount) {
                maxCourseCount = courseCount;
                studentWithMostCourses = student;
            }
        }

        return studentWithMostCourses;
    }

    
}
