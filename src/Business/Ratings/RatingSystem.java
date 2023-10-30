/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Ratings;

import Business.Profiles.EmployerProfile;
import java.util.ArrayList;
import java.util.List;
import Business.Profiles.Profile;
import Business.Profiles.StudentProfile;
import java.text.DecimalFormat;
// import Business.Profiles.EmployeeProfile;



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
        else if (profile instanceof EmployerProfile) {
            employerRatings.add(rating);
        }
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
        double frating = totalRating / ratings.size();
        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        String formattedRating = decimalFormat.format(frating);
        return Double.parseDouble(formattedRating);
    }
}
