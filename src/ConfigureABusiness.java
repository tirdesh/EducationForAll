/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/


package Business;

import Business.AcademicCalendar.AcademicCalendar;
import Business.CourseWork.Course;
import Business.CourseWork.CourseCatalog;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.ProfessorDirectory;
import Business.Profiles.ProfessorProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;

import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;



/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Information Systems");

// Create Persons
      PersonDirectory persondirectory = business.getPersonDirectory();



// Create Admins to manage the business
        ProfessorDirectory professordirectory = business.getProfessorDirectory();
        //ProfessorProfile employeeprofile0 = employeedirectory.newProfessorProfile(xeroxadminperson001);


   
// Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        //UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "admin", "XXXX"); /// order products for one of the customers and performed by a sales person

        StudentDirectory studentdirectory = business.getStudentDirectory();
        CourseCatalog coursecatalog = business.getCourseCatalog();
        AcademicCalendar academicCalendar = business.getAcademicCalendar();
        
        Person s = persondirectory.newPerson();
        s.setFirst_name("stu");
        s.setLast_name("dent");
        s.setEmail("student@gmail.com");
        StudentProfile sp = studentdirectory.newStudentProfile(s);
        uadirectory.newUserAccount(sp, "student", "student");
        
        Person p = persondirectory.newPerson();
        p.setFirst_name("prof");
        p.setLast_name("essor");
        p.setEmail("professor@gmail.com");
        ProfessorProfile pp = professordirectory.newProfessorProfile(p);
        uadirectory.newUserAccount(pp, "professor", "professor");
        
        // Course 1: Term-Based Course
        Course course1 = coursecatalog.newCourse("Introduction to Programming", "Learn the basics of programming", new ArrayList<>(), 3);
        course1.setTermBased(true);
        course1.setCourseDuration("Fall", 2023, academicCalendar);
        course1.setSessionType("Live");
        course1.createLiveClassSchedule("Fall", 2023, academicCalendar, LocalTime.of(9, 0), Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY));

        // Course 2: On-Demand Course
        Course course2 = coursecatalog.newCourse("Web Development", "Build web applications", new ArrayList<>(), 4);
        course2.setTermBased(false);
        course2.setCourseDuration(LocalDate.of(2023, 8, 1), LocalDate.of(2023, 12, 31));
        course2.setSessionType("Recorded");
        course2.createOnDemandClassSchedule(LocalDate.of(2023, 8, 1), LocalDate.of(2023, 12, 31), LocalTime.of(10, 0), Arrays.asList(DayOfWeek.TUESDAY, DayOfWeek.THURSDAY));

        // Course 3: Another Term-Based Course
        Course course3 = coursecatalog.newCourse("Database Management", "Learn about databases", new ArrayList<>(), 3);
        course3.setTermBased(true);
        course3.setCourseDuration("Spring", 2024, academicCalendar);
        course3.setSessionType("Live");
        course3.createLiveClassSchedule("Spring", 2024, academicCalendar, LocalTime.of(11, 0), Arrays.asList(DayOfWeek.TUESDAY, DayOfWeek.THURSDAY));
        
        System.out.println(coursecatalog);
        System.out.println(uadirectory);
        System.out.println(coursecatalog);
        System.out.println(coursecatalog);
        
        return business;
        
        

    }

}
