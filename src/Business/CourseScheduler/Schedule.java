/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CourseScheduler;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Session> sessions;
    private List<DayOfWeek> daysOfWeek;

    public Schedule() {
        this.sessions = new ArrayList<>();
        this.daysOfWeek = null;
    }

    public List<DayOfWeek> getDaysOfWeek() {
        return daysOfWeek;
    }
    
    private List<LocalDate> calculateDaysInRange(LocalDate startDate, LocalDate endDate, List<DayOfWeek> daysOfWeek) {
        List<LocalDate> daysInRange = new ArrayList<>();
        for (LocalDate currentDay = startDate; !currentDay.isAfter(endDate); currentDay = currentDay.plusDays(1)) {
            if (daysOfWeek.contains(currentDay.getDayOfWeek())) {
                daysInRange.add(currentDay);
            }
        }
        return daysInRange;
    }

    public void generateSessions(int courseHours, LocalTime startTime, List<DayOfWeek> daysOfWeek, LocalDate startDate, LocalDate endDate) {
        this.daysOfWeek = daysOfWeek;
        List<LocalDate> daysInRange = calculateDaysInRange(startDate, endDate, daysOfWeek);

        if (daysInRange.isEmpty()) {
            return; // No days of the specified days of the week in the given range
        }

        int hoursPerSession = courseHours / daysInRange.size();

        // Create sessions for each day in daysInRange
        for (LocalDate date : daysInRange) {
            sessions.add(new Session(date, startTime, startTime.plusHours(hoursPerSession)));
        }
    }
    

    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }

    public class Session {
        private LocalDate date;
        private LocalTime startTime;
        private LocalTime endTime;

        public Session(LocalDate date, LocalTime startTime, LocalTime endTime) {
            this.date = date;
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public LocalDate getDate() {
            return date;
        }

        public LocalTime getStartTime() {
            return startTime;
        }

        public LocalTime getEndTime() {
            return endTime;
        }

    }
}
