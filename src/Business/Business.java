/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.AcademicCalendar.AcademicCalendar;
import Business.CourseWork.CourseCatalog;
import Business.Employment.JobCatalog;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployerDirectory;
import Business.Profiles.ProfessorDirectory;
import Business.Profiles.StudentDirectory;

import Business.UserAccounts.UserAccountDirectory;
import java.time.LocalDate;

public class Business {

    String name;
    PersonDirectory persondirectory; //all people profiles regardless of the role
    StudentDirectory studentdirectory;
    ProfessorDirectory professordirectory;
    EmployerDirectory employerdirectory;
    UserAccountDirectory useraccountdirectory;
    CourseCatalog coursecatalog;
    JobCatalog jobcatalog;
    AcademicCalendar academicCalendar;

    public Business(String n) {
        name = n;
        persondirectory = new PersonDirectory();
        studentdirectory = new StudentDirectory();
        employerdirectory = new EmployerDirectory(this);
        professordirectory = new ProfessorDirectory(this);
        useraccountdirectory = new UserAccountDirectory();
        coursecatalog = new CourseCatalog();
        jobcatalog = new JobCatalog();
        academicCalendar = new AcademicCalendar();
        // Assuming academicCalendar is an instance of your AcademicCalendar class

        int startYear = 2023; // Starting year
        int endYear = startYear + 6; // Ending year (5 years into the future)
        for (int year = startYear; year <= endYear; year++) {
            // Generate term dates for each year
            academicCalendar.addTermDates("Fall", year, LocalDate.of(year, 9, 1), LocalDate.of(year, 12, 15));
            academicCalendar.addTermDates("Spring", year + 1, LocalDate.of(year, 1, 15), LocalDate.of(year, 5, 30));
            academicCalendar.addTermDates("Summer", year + 1, LocalDate.of(year, 6, 1), LocalDate.of(year, 8, 15));
            academicCalendar.addTermDates("Winter", year + 1, LocalDate.of(year, 12, 1), LocalDate.of(year, 1, 15).plusYears(1));
            // You can add more terms if needed
        }
    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }

    public JobCatalog getJobCatalog() {
        return jobcatalog;
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

    public EmployerDirectory getEmployerDirectory() {
        return employerdirectory;
    }

}
