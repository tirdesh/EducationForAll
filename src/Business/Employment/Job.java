/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employment;

import Business.CourseWork.Course;
import Business.CourseWork.TechStack;
import Business.Profiles.EmployerProfile;
import java.util.ArrayList;


public class Job {
    private int jobId;
    private String title;
    private String description;
    private String location;
    private TechStack techStack;
    private ArrayList<Course> relevantCourses;
    private EmployerProfile employerProfile;
    private boolean isOpen;
    private static int idCounter = 1;


    public Job(String title, String description, String location) {
        this.jobId = ++idCounter;
        this.title = title;
        this.description = description;
        this.location = location;
        this.techStack = new TechStack(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        this.relevantCourses = new ArrayList<>();
        this.isOpen = true; // By default, a job is open when created
    }

    public ArrayList<Course> getRelevantCourses() {
        return relevantCourses;
    }

    public void setRelevantCourses(ArrayList<Course> relevantCourses) {
        this.relevantCourses = relevantCourses;
    }

    public EmployerProfile getEmployerProfile() {
        return employerProfile;
    }

    public void setEmployerProfile(EmployerProfile employerProfile) {
        this.employerProfile = employerProfile;
    }
    
    public int getJobId() {
        return jobId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public TechStack getTechStack() {
        return techStack;
    }

    public void setTechStack(TechStack techStack) {
        this.techStack = techStack;
    }
    
    public static void decrementIdCounter() {
        idCounter--;
    }

    public static int getIdCounter() {
        return idCounter;
    }
    
}
