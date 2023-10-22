/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.PersonDirectory;
import Business.Profiles.ProfessorDirectory;
import Business.Profiles.StudentDirectory;

import Business.UserAccounts.UserAccountDirectory;

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


    public Business(String n) {
        name = n;
        persondirectory = new PersonDirectory();
        studentdirectory = new StudentDirectory();
        professordirectory = new ProfessorDirectory(this);
        useraccountdirectory = new UserAccountDirectory();


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



}
