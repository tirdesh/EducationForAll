/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.AcademicCalendar;

/**
 *
 * @author tirdesh
 */
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AcademicCalendar {
    private Map<String, Map<Integer, TermDates>> termDatesByTerm;

    public AcademicCalendar() {
        termDatesByTerm = new HashMap<>();
    }

    public void addTermDates(String term, int year, LocalDate startDate, LocalDate endDate) {
        termDatesByTerm
            .computeIfAbsent(term, k -> new HashMap<>())
            .put(year, new TermDates(startDate, endDate));
    }

    public TermDates getTermDates(String term, int year) {
        Map<Integer, TermDates> termDatesByYear = termDatesByTerm.get(term);
        if (termDatesByYear != null) {
            return termDatesByYear.get(year);
        }
        return null;
    }
}

