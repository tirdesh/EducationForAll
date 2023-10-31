/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Business;
import Business.Person.Person;

import java.util.ArrayList;

public class EmployerDirectory {

    Business business;
    ArrayList<EmployerProfile> employerlist;

    public EmployerDirectory(Business d) {

        business = d;
        employerlist = new ArrayList();

    }

    public EmployerProfile newEmployerProfile(Person p, String companyName, String industry) {

        EmployerProfile sp = new EmployerProfile(p,companyName, industry);
        employerlist.add(sp);
        return sp;
    }
    
    public void deleteEmployerProfile(EmployerProfile profileToDelete) {
        if (profileToDelete != null) {
            employerlist.remove(profileToDelete);
        }
    }

    public ArrayList<EmployerProfile> getEmployerlist() {
        return employerlist;
    }

    public EmployerProfile findEmployer(int id) {

        for (EmployerProfile sp : employerlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
    }
    
    public EmployerProfile findEmployerWithMostJobs() {
        EmployerProfile employerWithMostJobs = null;
        int maxJobCount = 0;

        for (EmployerProfile employer : employerlist) {
            int jobCount = employer.getJobOpenings().size();
            if (jobCount > maxJobCount) {
                maxJobCount = jobCount;
                employerWithMostJobs = employer;
            }
        }

        return employerWithMostJobs;
    }

    
}
