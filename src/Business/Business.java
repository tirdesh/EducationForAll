/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.AcademicCalendar.AcademicCalendar;
import Business.CourseWork.CourseCatalog;
import Business.Person.PersonDirectory;
import Business.Profiles.ProfessorDirectory;
import Business.Profiles.StudentDirectory;

import Business.UserAccounts.UserAccountDirectory;
import java.time.LocalDate;

/**
 *
 * @author kal bugrara
 */
public class Business {

    String name;
    PersonDirectory persondirectory; //all people profiles regardless of the role
    StudentDirectory studentdirectory;
    ProfessorDirectory professordirectory;
    UserAccountDirectory useraccountdirectory;
    CourseCatalog coursecatalog;
    AcademicCalendar academicCalendar;

    public Business(String n) {
        name = n;
        persondirectory = new PersonDirectory();
        studentdirectory = new StudentDirectory();
        professordirectory = new ProfessorDirectory(this);
        useraccountdirectory = new UserAccountDirectory();
        coursecatalog = new CourseCatalog();
        academicCalendar = new AcademicCalendar();
        academicCalendar.addTermDates("Fall", 2023, LocalDate.of(2023, 9, 1), LocalDate.of(2023, 12, 15));
        academicCalendar.addTermDates("Spring", 2024, LocalDate.of(2024, 1, 15), LocalDate.of(2024, 5, 30));

    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }


    public ProfessorDirectory getProfessorDirectory() {
        return professordirectory;
    }
    
    public StudentDirectory getStudentDirectory() {
        return studentdirectory;
    }

    public CourseCatalog getCourseCatalog() {
        return coursecatalog;
    }

    public AcademicCalendar getAcademicCalendar() {
        return academicCalendar;
    }

}
