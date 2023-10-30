/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Profiles;

import Business.Business;
import Business.Person.Person;

import java.util.ArrayList;

public class ProfessorDirectory {

    Business business;
    ArrayList<ProfessorProfile> professorlist;

    public ProfessorDirectory(Business d) {

        business = d;
        professorlist = new ArrayList();

    }

    public ProfessorProfile newProfessorProfile(Person p) {

        ProfessorProfile sp = new ProfessorProfile(p);
        professorlist.add(sp);
        return sp;
    }
    
    public void deleteProfessorProfile(ProfessorProfile profileToDelete) {
        if (profileToDelete != null) {
            professorlist.remove(profileToDelete);
        }
    }

    public ArrayList<ProfessorProfile> getProfessorlist() {
        return professorlist;
    }

    public ProfessorProfile findProfessor(int id) {

        for (ProfessorProfile sp : professorlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
    }
    
    public ProfessorProfile findProfessorWithMostCourses() {
        ProfessorProfile professorWithMostCourses = null;
        int maxCourseCount = 0;

        for (ProfessorProfile professor : professorlist) {
            int courseCount = professor.getCourseList().size();
            if (courseCount > maxCourseCount) {
                maxCourseCount = courseCount;
                professorWithMostCourses = professor;
            }
        }

        return professorWithMostCourses;
    }

    
}
