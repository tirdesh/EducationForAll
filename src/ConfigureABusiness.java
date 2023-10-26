/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/


package Business;

import Business.AcademicCalendar.AcademicCalendar;
import Business.CourseWork.*;
import Business.Person.*;
import Business.Profiles.*;
import Business.UserAccounts.*;
import java.time.*;
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
        UserAccount actualuser= uadirectory.getActualuser();
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
        pp.addCourseToProfile(course1);
        
        // Course 2: On-Demand Course
        Course course2 = coursecatalog.newCourse("Web Development", "Build web applications", new ArrayList<>(), 4);
        course2.setTermBased(false);
        course2.setCourseDuration(LocalDate.of(2023, 8, 1), LocalDate.of(2023, 12, 31));
        course2.setSessionType("Recorded");
        course2.createOnDemandClassSchedule(LocalDate.of(2023, 8, 1), LocalDate.of(2023, 12, 31), LocalTime.of(10, 0), Arrays.asList(DayOfWeek.TUESDAY, DayOfWeek.THURSDAY));
        course2.getPrerequisites().add(course1);
        pp.addCourseToProfile(course2);
        
        // Course 3: Another Term-Based Course
        Course course3 = coursecatalog.newCourse("Database Management", "Learn about databases", new ArrayList<>(), 3);
        course3.setTermBased(true);
        course3.setCourseDuration("Spring", 2024, academicCalendar);
        course3.setSessionType("Live");
        course3.createLiveClassSchedule("Spring", 2024, academicCalendar, LocalTime.of(11, 0), Arrays.asList(DayOfWeek.TUESDAY, DayOfWeek.THURSDAY));
        
        // Create Tech Stack objects
        TechStack techStack1 = new TechStack(
            Arrays.asList("Java", "Python"),  // Programming Languages
            Arrays.asList("Spring", "React"),  // Frameworks
            Arrays.asList("Eclipse", "Git")   // Tools
        );

        TechStack techStack2 = new TechStack(
            Arrays.asList("JavaScript", "HTML"),  // Programming Languages
            Arrays.asList("Angular", "Node.js"), // Frameworks
            Arrays.asList("Visual Studio Code", "Git") // Tools
        );

        TechStack techStack3 = new TechStack(
            Arrays.asList("SQL", "Python"),  // Programming Languages
            Arrays.asList("MySQL", "MongoDB"),  // Frameworks
            Arrays.asList("SQL Server Management Studio", "Git") // Tools
        );

        // Set the Tech Stack for the courses
        course1.setTechStack(techStack1);
        course2.setTechStack(techStack2);
        course3.setTechStack(techStack3);
        
        return business;
        
        

    }

}
