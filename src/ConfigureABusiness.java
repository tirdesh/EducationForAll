/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/


package Business;

import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.ProfessorDirectory;
import Business.Profiles.ProfessorProfile;
import Business.Profiles.StudentDirectory;

import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;


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
        
        return business;

    }

}
