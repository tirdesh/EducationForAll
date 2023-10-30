package Business.Employment;

import Business.Employment.*;
import java.util.ArrayList;

public class JobCatalog {
    
    private ArrayList<Job> jobList;
    
    public JobCatalog() {
        jobList = new ArrayList<>();
    }

    public ArrayList<Job> getJobList() {
        return jobList;
    }

    public Job newJob(String title, String description, String location) {
        Job job = new Job(title, description, location);
        jobList.add(job);
        return job;
    }
    
    public void deleteJob(Job jobToDelete) {
        if (jobToDelete != null) {
            int deletedId = jobToDelete.getJobId();
            jobList.remove(jobToDelete);
            if (deletedId == Job.getIdCounter()) {
                Job.decrementIdCounter();
            }
            // You can add more logic here if needed
        }
    }

    public Job findJob(String jobTitle) {
        for (Job job : jobList) {
            if (job.getTitle().equals(jobTitle)) {
                return job;
            }
        }
        return null; // Not found after going through the whole list
    }

    
}
