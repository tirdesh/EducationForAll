/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profiles;

import Business.Employment.Job;
import java.util.ArrayList;

import Business.Person.Person;


public class EmployerProfile extends Profile {
    private String companyName;
    private ArrayList<Job> jobOpenings;
    private String industry;
    // Add more attributes specific to employer profiles here.

    public EmployerProfile(Person p, String companyName, String industry) {
        super(p);
        this.companyName = companyName;
        this.industry = industry;
        this.jobOpenings = new ArrayList<>();
        // Initialize other attributes here.
    }

    @Override
    public String getRole() {
        return "Employer";
    }

    public String getCompanyName() {
        return companyName;
    }

    public ArrayList<Job> getJobOpenings() {
        return jobOpenings;
    }

    public void addJobOpening(Job jobOpening) {
        jobOpenings.add(jobOpening);
    }

    public void removeJobOpening(Job jobOpening) {
        jobOpenings.remove(jobOpening);
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }


    // Add getters and setters for other attributes as needed.
}
