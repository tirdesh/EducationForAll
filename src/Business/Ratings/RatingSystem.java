/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Ratings;

import java.util.ArrayList;
import java.util.List;
import Business.Profiles.Profile;
import Business.Profiles.StudentProfile;
// import Business.Profiles.EmployeeProfile;


/**
 *
 * @author tirdesh
 */
public class RatingSystem {
    private List<Double> studentRatings;
    private List<Double> employerRatings;

    public RatingSystem() {
        studentRatings = new ArrayList<>();
        employerRatings = new ArrayList<>();
    }

    public void addRating(double rating, Profile profile) {
        if (profile instanceof StudentProfile) {
            studentRatings.add(rating);
        } 
//        else if (profile instanceof EmployeeProfile) {
//            employerRatings.add(rating);
//        }
    }

    public double getAverageStudentRating() {
        return calculateAverageRating(studentRatings);
    }

    public double getAverageEmployerRating() {
        return calculateAverageRating(employerRatings);
    }
    
    public double getOverallAverageRating() {
        List<Double> allRatings = new ArrayList<>(studentRatings);
        allRatings.addAll(employerRatings);
        return calculateAverageRating(allRatings);
    }

    private double calculateAverageRating(List<Double> ratings) {
        if (ratings.isEmpty()) {
            return 0.0;
        }

        double totalRating = 0.0;
        for (Double rating : ratings) {
            totalRating += rating;
        }

        return totalRating / ratings.size();
    }
}
