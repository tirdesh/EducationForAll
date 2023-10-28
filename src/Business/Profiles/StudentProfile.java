package Business.CourseWork;

import Business.AcademicCalendar.AcademicCalendar;
import Business.AcademicCalendar.TermDates;
import Business.CourseScheduler.Schedule;
import Business.Profiles.ProfessorProfile;
import Business.Profiles.StudentProfile;
import Business.Ratings.RatingSystem;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a course in an academic program.
 * 
 * @author tirdesh
 */
public class Course {
    private String courseName;
    private String description;
    private ArrayList<Course> prerequisites;
    private int courseHours;
    private boolean termBased; // True for term-based, False for on-demand
    private String term; // Term (e.g., Fall, Spring, etc.)
    private int termYear; // Year of the term
    private LocalDate startDate; // Start date (for on-demand courses)
    private LocalDate endDate; // End date (for on-demand courses)
    private String sessionType; // "Live" or "Recorded"
    private Schedule schedule;
    private TechStack techStack;
    private ProfessorProfile professorProfile;
    private ArrayList<StudentProfile> registeredStudents;
    private RatingSystem ratingSystem;


    

    public Course(String courseName, String description, ArrayList<Course> prerequisites, int courseHours) {
        // Constructor to initialize basic attributes
        this.courseName = courseName;
        this.courseHours = courseHours;
        this.description = description;
        this.prerequisites = prerequisites;
        this.schedule = new Schedule();
        this.techStack = new TechStack(new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        this.registeredStudents = new ArrayList<>();
        this.ratingSystem = new RatingSystem();
    }

    public RatingSystem getRatingSystem() {
        return ratingSystem;
    }

    // Getter and Setter methods for all attributes
    
    public void setProfessorProfile(ProfessorProfile professorProfile) {
        this.professorProfile = professorProfile;
    }

    public ProfessorProfile getProfessorProfile() {
        return professorProfile;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrerequisites(ArrayList<Course> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public ArrayList<Course> getPrerequisites() {
        return prerequisites;
    }

    public void setCourseHours(int courseHours) {
        this.courseHours = courseHours;
    }

    public int getCourseHours() {
        return courseHours;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public TechStack getTechStack() {
        return techStack;
    }

    public void setTechStack(TechStack techStack) {
        this.techStack = techStack;
    }

    public void setCourseDuration(String term, int termYear, AcademicCalendar academicCalendar) {
        this.termBased = true;
        this.term = term;
        this.termYear = termYear;
        TermDates termDates = academicCalendar.getTermDates(term, termYear);
        if (termDates != null) {
            this.startDate = termDates.getStartDate();
            this.endDate = termDates.getEndDate();
        }
    }

    public void setCourseDuration(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void createLiveClassSchedule(String term, int termYear, AcademicCalendar academicCalendar, LocalTime startTime, List<DayOfWeek> daysOfWeek) {
        // Set course duration based on academic calendar (or start and end dates)
        System.out.println(term);
        System.out.println(termYear);
        
        setCourseDuration(term, termYear, academicCalendar);

        // Set the session type
        setSessionType("Live");

        // Generate live class sessions
        getSchedule().generateSessions(getCourseHours(), startTime, daysOfWeek, getStartDate(), getEndDate());
    }

    public void createOnDemandClassSchedule(LocalDate startDate, LocalDate endDate, LocalTime startTime, List<DayOfWeek> daysOfWeek) {
        // Set course duration based on academic calendar (or start and end dates)
        setCourseDuration(startDate, endDate);

        // Set the session type
        setSessionType("On Demand");

        // Generate on-demand class sessions
        getSchedule().generateSessions(getCourseHours(), startTime, daysOfWeek, getStartDate(), getEndDate());
    }

    public void setTermBased(boolean termBased) {
        this.termBased = termBased;
    }

    public boolean isTermBased() {
        return termBased;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getTerm() {
        return term;
    }

    public void setTermYear(int termYear) {
        this.termYear = termYear;
    }

    public int getTermYear() {
        return termYear;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    public String getSessionType() {
        return sessionType;
    }
    
    public ArrayList<StudentProfile> getRegisteredStudents() {
        return registeredStudents;
    }
    
    public void addStudent(StudentProfile student) {
        this.registeredStudents.add(student);
    }
      private String Courseprogress;

    public String getCourseprogress() {
        return Courseprogress;
    }

    public void setCourseprogress(String Courseprogress) {
        this.Courseprogress = Courseprogress;
    }
    
}
