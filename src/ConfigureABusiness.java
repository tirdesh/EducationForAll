/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/


package Business;

import Business.AcademicCalendar.AcademicCalendar;
import Business.CourseWork.*;
import Business.Employment.Job;
import Business.Employment.JobCatalog;
import Business.Person.*;
import Business.Profiles.*;
import Business.UserAccounts.*;
import com.github.javafaker.Faker;
import java.text.DecimalFormat;
import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;




class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Information Systems");
        Faker fake = new Faker();


// Create Persons
      PersonDirectory persondirectory = business.getPersonDirectory();



// Create Admins to manage the business
        ProfessorDirectory professordirectory = business.getProfessorDirectory();
        //ProfessorProfile employeeprofile0 = employeedirectory.newProfessorProfile(xeroxadminperson001);

        EmployerDirectory employerdirectory = business.getEmployerDirectory();
   
// Create User accounts that link to specific profiles
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();
        UserAccount actualuser= uadirectory.getActualuser();
        //UserAccount ua3 = uadirectory.newUserAccount(employeeprofile0, "admin", "XXXX"); /// order products for one of the customers and performed by a sales person

        StudentDirectory studentdirectory = business.getStudentDirectory();
        CourseCatalog coursecatalog = business.getCourseCatalog();
        JobCatalog jobcatalog = business.getJobCatalog();
        AcademicCalendar academicCalendar = business.getAcademicCalendar();
        
        Person s = persondirectory.newPerson();
        s.setFirst_name("stu");
        s.setLast_name("dent");
        s.setEmail("student@gmail.com");
        StudentProfile sp = studentdirectory.newStudentProfile(s);
        uadirectory.newUserAccount(sp, "student", "student");
        
        for (int i = 1; i <= 30; i++) {
            Faker faker = new Faker();
            Person studentPerson = persondirectory.newPerson();
            studentPerson.setFirst_name(faker.name().firstName());
            studentPerson.setLast_name(faker.name().lastName()); // Append a unique number to each student's last name
            studentPerson.setEmail(faker.internet().emailAddress());

            StudentProfile studentProfile = studentdirectory.newStudentProfile(studentPerson);

            // Create UserAccount for each student
            uadirectory.newUserAccount(studentProfile, faker.name().username(), "student"+i);
        }

        
        Person p = persondirectory.newPerson();
        p.setFirst_name("prof");
        p.setLast_name("essor");
        p.setEmail("professor@gmail.com");
        ProfessorProfile pp = professordirectory.newProfessorProfile(p);
        uadirectory.newUserAccount(pp, "professor", "professor");
        
        // Create 3 professors using a for loop
        for (int i = 1; i <= 10; i++) {
            Faker faker = new Faker();
            Person professorPerson = persondirectory.newPerson();
            professorPerson.setFirst_name(faker.name().firstName());
            professorPerson.setLast_name(faker.name().lastName()); // Append a unique number to each professor's last name
            professorPerson.setEmail(faker.internet().emailAddress());

            ProfessorProfile professorProfile = professordirectory.newProfessorProfile(professorPerson);

            // Create UserAccount for each professor
            uadirectory.newUserAccount(professorProfile, faker.name().username(), "professor"+i);
        }
        
        
        Person e = persondirectory.newPerson();
//        p.setFirst_name("emp");
//        p.setLast_name("loyer");
        e.setEmail("employer@gmail.com");
        EmployerProfile ep = employerdirectory.newEmployerProfile(e, "Top Company", "Best Industry");
        uadirectory.newUserAccount(ep, "employer", "employer");
        
        for (int i = 1; i <= 10; i++) {
            Faker faker = new Faker();
            Person person = persondirectory.newPerson();
            person.setEmail(faker.internet().emailAddress());

            EmployerProfile empProfile = employerdirectory.newEmployerProfile(person, faker.company().name(), faker.company().industry());

            // Create UserAccount for each professor
            uadirectory.newUserAccount(empProfile, faker.name().username(), "employer"+i);
        }
        
        // Course 1: Term-Based Course
        Course course1 = coursecatalog.newCourse("Introduction to Programming", "Learn the basics of programming", new ArrayList<>(), 3);
        course1.setTermBased(true);
        course1.setCourseDuration("Fall", 2023, academicCalendar);
        course1.setSessionType("Live");
        course1.createLiveClassSchedule("Fall", 2023, academicCalendar, LocalTime.of(9, 0), Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY));
        pp.addCourseToProfile(course1);
        
        // Course 2: On-Demand Course
        Course course2 = coursecatalog.newCourse("Web Development", "Build web applications", new ArrayList<>(), 4);
        course2.setTermBased(false);
        course2.setCourseDuration(LocalDate.of(2023, 8, 1), LocalDate.of(2023, 12, 31));
        course2.setSessionType("Recorded");
        course2.createOnDemandClassSchedule(LocalDate.of(2023, 8, 1), LocalDate.of(2023, 12, 31), LocalTime.of(10, 0), Arrays.asList(DayOfWeek.TUESDAY, DayOfWeek.THURSDAY));
        course2.getPrerequisites().add(course1);
        pp.addCourseToProfile(course2);
        
        // Course 3: Another Term-Based Course
        Course course3 = coursecatalog.newCourse("Database Management", "Learn about databases", new ArrayList<>(), 3);
        course3.setTermBased(true);
        course3.setCourseDuration("Spring", 2024, academicCalendar);
        course3.setSessionType("Live");
        course3.createLiveClassSchedule("Spring", 2024, academicCalendar, LocalTime.of(11, 0), Arrays.asList(DayOfWeek.TUESDAY, DayOfWeek.THURSDAY));
        
        
        
        Job job1 = jobcatalog.newJob("Software Engineer", "Develop software applications", "San Francisco, CA");
        job1.setEmployerProfile(ep);
        ep.addJobOpening(job1);
        Job job2 = jobcatalog.newJob("Web Developer", "Build websites and web applications", "New York, NY");
        job2.setEmployerProfile(ep);
        job2.getRelevantCourses().add(course2);
        ep.addJobOpening(job2);
        Job job3 = jobcatalog.newJob("Data Analyst", "Analyze and interpret data", "Chicago, IL");

          // Create Tech Stack objects
        TechStack techStack1 = new TechStack(
            Arrays.asList("Java", "Python"),  // Programming Languages
            Arrays.asList("Spring", "React"),  // Frameworks
            Arrays.asList("Eclipse", "Git")   // Tools
        );

        TechStack techStack2 = new TechStack(
            Arrays.asList("JavaScript", "HTML"),  // Programming Languages
            Arrays.asList("Angular", "Node.js"), // Frameworks
            Arrays.asList("Visual Studio Code", "Git") // Tools
        );

        TechStack techStack3 = new TechStack(
            Arrays.asList("SQL", "Python"),  // Programming Languages
            Arrays.asList("MySQL", "MongoDB"),  // Frameworks
            Arrays.asList("SQL Server Management Studio", "Git") // Tools
        );

        // Set the Tech Stack for the courses
        course1.setTechStack(techStack1);
        course2.setTechStack(techStack2);
        course3.setTechStack(techStack3);
        
        job1.setTechStack(techStack1);
        job2.setTechStack(techStack2);
        job3.setTechStack(techStack3);
        
        // Create lists for course titles and descriptions
        ArrayList<String> courseTitles = new ArrayList<>();
        ArrayList<String> courseDescriptions = new ArrayList<>();
        ArrayList<Integer> courseHours = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        

        // Populate the lists with course titles and descriptions
        courseTitles.add("Introduction to Computer Science");
        courseDescriptions.add("Learn the fundamentals of computer science, including algorithms and data structures.");

        courseTitles.add("Web Development Fundamentals");
        courseDescriptions.add("Explore the basics of web development, covering HTML, CSS, and JavaScript.");

        courseTitles.add("Database Design and Management");
        courseDescriptions.add("Gain expertise in designing and managing relational databases.");

        courseTitles.add("Mobile App Development with Android");
        courseDescriptions.add("Create mobile apps for Android devices using Java and Android Studio.");

        courseTitles.add("Machine Learning and Data Science");
        courseDescriptions.add("Dive into machine learning and data science with real-world applications.");

        courseTitles.add("Artificial Intelligence and Robotics");
        courseDescriptions.add("Discover the exciting world of AI and robotics, including autonomous systems.");

        courseTitles.add("Cybersecurity and Ethical Hacking");
        courseDescriptions.add("Learn about cybersecurity threats and ethical hacking techniques.");

        courseTitles.add("Digital Marketing Strategy");
        courseDescriptions.add("Develop digital marketing strategies for businesses and brands.");

        courseTitles.add("Financial Accounting Principles");
        courseDescriptions.add("Master the principles of financial accounting and financial statement analysis.");

        courseTitles.add("Business Ethics and Corporate Responsibility");
        courseDescriptions.add("Explore ethical considerations in business and corporate social responsibility.");

        courseTitles.add("Environmental Science and Sustainability");
        courseDescriptions.add("Study environmental science and sustainable practices for a greener world.");

        courseTitles.add("Graphic Design and Visual Communication");
        courseDescriptions.add("Create visually stunning designs and learn about visual communication.");

        courseTitles.add("Public Speaking and Presentation Skills");
        courseDescriptions.add("Improve your public speaking and presentation skills for various contexts.");

        courseTitles.add("Art History and Appreciation");
        courseDescriptions.add("Dive into the history of art and appreciate diverse art forms.");

        courseTitles.add("Creative Writing and Storytelling");
        courseDescriptions.add("Enhance your creative writing and storytelling abilities.");

        courseTitles.add("Introduction to Psychology");
        courseDescriptions.add("Explore the fundamental concepts and principles of psychology.");

        courseTitles.add("Music Theory and Composition");
        courseDescriptions.add("Learn music theory and composition techniques for aspiring musicians.");

        courseTitles.add("Film Production and Cinematography");
        courseDescriptions.add("Discover the art of filmmaking, including cinematography and production.");

        courseTitles.add("Astronomy and Space Exploration");
        courseDescriptions.add("Embark on a journey through the cosmos, exploring astronomy and space.");

        courseTitles.add("History of Ancient Civilizations");
        courseDescriptions.add("Uncover the history of ancient civilizations from around the world.");
        
        // Create 20 courses with different details
        for (int i = 1; i <= 20; i++) {
            int randomInt = (int) (Math.random() * courseTitles.size());
            String randomCourseTitle = courseTitles.get(randomInt);
            String randomCourseDescription = courseDescriptions.get(randomInt);
            int randomCourseHours = courseHours.get(new Random().nextInt(courseHours.size()));
                    
            Course newCourse = coursecatalog.newCourse(randomCourseTitle, randomCourseDescription, new ArrayList<>(), randomCourseHours);

            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                // Create an academic calendar-based course
                String term = (i % 4 == 0) ? "Spring" : (i % 4 == 1) ? "Summer" : (i % 4 == 2) ? "Fall" : "Winter";
                int year = 2023 + (i / 4); // Adjust term and year for each course
                // Ensure that the year doesn't exceed 2029
                if (year > 2028) {
                    year = 2028;
                }
                if (year == 2023){
                    term = "Fall";
                }
                newCourse.setTermBased(true);
                newCourse.setCourseDuration(term, year, academicCalendar);
                newCourse.setSessionType("Live");
                newCourse.createLiveClassSchedule(term, year, academicCalendar, LocalTime.of(9, 0), Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY));
            } else {
                // Create an on-demand course
                newCourse.setTermBased(false);
                LocalDate startDate = LocalDate.of(2023, 8, 1).plusMonths(i); // Adjust start date
                LocalDate endDate = startDate.plusMonths(4); // Set end date 4 months after start date
                newCourse.setCourseDuration(startDate, endDate);
                newCourse.setSessionType("Recorded");
                newCourse.createOnDemandClassSchedule(startDate, endDate, LocalTime.of(10, 0), Arrays.asList(DayOfWeek.TUESDAY, DayOfWeek.THURSDAY));

                // Add prerequisites to every odd-numbered course
                if (i % 2 != 0) {
                    newCourse.getPrerequisites().add(coursecatalog.getCourseList().get(i - 1)); // Add the previous course as a prerequisite
                }
            }
            newCourse.getRatingSystem().addRating(1 + (5 - 1) * fake.random().nextDouble(), studentdirectory.getStudentlist().get(i % studentdirectory.getStudentlist().size()));
            newCourse.getRatingSystem().addRating(1 + (5 - 1) * fake.random().nextDouble(), employerdirectory.getEmployerlist().get(i % employerdirectory.getEmployerlist().size()));

            // Get a professor's profile from professordirectory
            ProfessorProfile professorProfile = professordirectory.getProfessorlist().get(i % professordirectory.getProfessorlist().size()); // Assuming you have at least 3 professors

            // Add the course to the professor's profile
            professorProfile.addCourseToProfile(newCourse);
            newCourse.setProfessorProfile(professorProfile);
        }

        for (int i = 1; i <= 10; i++) {
            Faker faker = new Faker();
            String randomCourseTitle = faker.educator().course();
            String randomCourseDescription = faker.lorem().sentence(5);
            int randomCourseHours = courseHours.get(new Random().nextInt(courseHours.size()));
                    
            Course newCourse = coursecatalog.newCourse(randomCourseTitle, randomCourseDescription, new ArrayList<>(), randomCourseHours);

            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                // Create an academic calendar-based course
                String term = (i % 4 == 0) ? "Spring" : (i % 4 == 1) ? "Summer" : (i % 4 == 2) ? "Fall" : "Winter";
                int year = 2023 + (i / 4); // Adjust term and year for each course
                // Ensure that the year doesn't exceed 2029
                if (year > 2028) {
                    year = 2028;
                }
                if (year == 2023){
                    term = "Fall";
                }
                newCourse.setTermBased(true);
                newCourse.setCourseDuration(term, year, academicCalendar);
                newCourse.setSessionType("Live");
                newCourse.createLiveClassSchedule(term, year, academicCalendar, LocalTime.of(9, 0), Arrays.asList(DayOfWeek.MONDAY, DayOfWeek.WEDNESDAY, DayOfWeek.FRIDAY));
            } else {
                // Create an on-demand course
                newCourse.setTermBased(false);
                LocalDate startDate = LocalDate.of(2023, 8, 1).plusMonths(i); // Adjust start date
                LocalDate endDate = startDate.plusMonths(4); // Set end date 4 months after start date
                newCourse.setCourseDuration(startDate, endDate);
                newCourse.setSessionType("Recorded");
                newCourse.createOnDemandClassSchedule(startDate, endDate, LocalTime.of(10, 0), Arrays.asList(DayOfWeek.TUESDAY, DayOfWeek.THURSDAY));

                // Add prerequisites to every odd-numbered course
                if (i % 2 != 0) {
                    newCourse.getPrerequisites().add(coursecatalog.getCourseList().get(i - 1)); // Add the previous course as a prerequisite
                }
            }
            // Generate random student and employer ratings with two decimal places
            double studentRating = 1.00 + (4.00 * fake.random().nextDouble());
            double employerRating = 1.00 + (4.00 * fake.random().nextDouble());

            // Format the ratings to two decimal places
            DecimalFormat decimalFormat = new DecimalFormat("#0.00");
            String formattedStudentRating = decimalFormat.format(studentRating);
            String formattedEmployerRating = decimalFormat.format(employerRating);

            // Convert the formatted ratings back to double
            double finalStudentRating = Double.parseDouble(formattedStudentRating);
            double finalEmployerRating = Double.parseDouble(formattedEmployerRating);

            // Get a student and employer to assign the ratings
            StudentProfile randomStudent = studentdirectory.getStudentlist().get(i % studentdirectory.getStudentlist().size());
            EmployerProfile randomEmployer = employerdirectory.getEmployerlist().get(i % employerdirectory.getEmployerlist().size());

            // Add the ratings to the course's rating system
            newCourse.getRatingSystem().addRating(finalStudentRating, randomStudent);
            newCourse.getRatingSystem().addRating(finalEmployerRating, randomEmployer);
            
            // Get a professor's profile from professordirectory
            ProfessorProfile professorProfile = professordirectory.getProfessorlist().get(i % professordirectory.getProfessorlist().size()); // Assuming you have at least 3 professors

            // Add the course to the professor's profile
            professorProfile.addCourseToProfile(newCourse);
            newCourse.setProfessorProfile(professorProfile);
        }
        
        for (int i = 1; i <= 20; i++) {
            Faker faker = new Faker();
            String randomJobTitle = faker.job().title();
            String randomJobDescription = faker.lorem().sentence(5);
            String randomJobLocation = faker.address().city() + ", " + faker.address().state();

            // Create a new job opening with Faker-generated data
            Job job = jobcatalog.newJob(randomJobTitle, randomJobDescription, randomJobLocation);

            // Get a random employer profile from the employerdirectory
            EmployerProfile employerProfile = employerdirectory.getEmployerlist().get(i % employerdirectory.getEmployerlist().size());

            // Assign the job to the employer
            job.setEmployerProfile(employerProfile);

            // Add the job opening to the employer's list of job openings
            employerProfile.addJobOpening(job);
        }


        
        // Set a random tech stack for existing courses in the course catalog
        for (Course course : coursecatalog.getCourseList()) {
            TechStack randomTechStack;
            randomTechStack = generateRandomTechStack();
            course.setTechStack(randomTechStack);
        }
        
        for (Job job : jobcatalog.getJobList()) {
            TechStack randomTechStack = generateRandomTechStack();
            job.setTechStack(randomTechStack);
        }
        
        for (ProfessorProfile ppr: professordirectory.getProfessorlist()){
            // Generate and add random ratings from students
            for (StudentProfile studentProfile : studentdirectory.getStudentlist()) {
                double studentRating = 1 + (5 - 1) * fake.random().nextDouble();
                                        // Format the random rating to two decimal places
                DecimalFormat decimalFormat = new DecimalFormat("#0.00");
                String formattedRating = decimalFormat.format(studentRating);
                // Convert the formatted rating back to a double
                double finalRating = Double.parseDouble(formattedRating);
                ppr.getRatingSystem().addRating(finalRating, studentProfile);
            }

            // Generate and add random ratings from employers
            for (EmployerProfile employerProfile : employerdirectory.getEmployerlist()) {
                double employerRating = 1 + (5 - 1) * fake.random().nextDouble();
                        // Format the random rating to two decimal places
                DecimalFormat decimalFormat = new DecimalFormat("#0.00");
                String formattedRating = decimalFormat.format(employerRating);
                // Convert the formatted rating back to a double
                double finalRating = Double.parseDouble(formattedRating);
                ppr.getRatingSystem().addRating(finalRating, employerProfile);
            }        
        }

        
        assignCoursesToStudents(business);
        assignRandomRelevantCoursesToJobs(business);

        for (StudentProfile stu: studentdirectory.getStudentlist()) {

            // Assuming you have a list of enrolled courses for each student
            List<Course> enrolledCourses = stu.getCourseList(); // Replace with your actual list

            for (Course course : enrolledCourses) {
                // Generate a random progress value (0 to 100) or use your own logic to set progress
                int progress = (int) (Math.random() * 101); // Random progress value

                // Set the course progress for the student
                stu.updateCourseProgress(course, progress);
            }
        }
        
        UserAccount ua1 = uadirectory.findUserAccountByProfile(employerdirectory.findEmployerWithMostJobs());
        System.out.println("Employer with most jobs");
        System.out.println(ua1.getUserLoginName());
        System.out.println(ua1.getPassword());
        
        UserAccount ua2 = uadirectory.findUserAccountByProfile(professordirectory.findProfessorWithMostCourses());
        System.out.println("Professor with most Courses");
        System.out.println(ua2.getUserLoginName());
        System.out.println(ua2.getPassword());
        
        UserAccount ua3 = uadirectory.findUserAccountByProfile(coursecatalog.findCourseWithMaxStudents().getProfessorProfile());
        System.out.println("Professor teaching the most popular course");
        System.out.println(ua3.getUserLoginName());
        System.out.println(ua3.getPassword());
        
        UserAccount ua4 = uadirectory.findUserAccountByProfile(studentdirectory.findStudentWithMostCourses());
        System.out.println("Student with most courses");
        System.out.println(ua4.getUserLoginName());
        System.out.println(ua4.getPassword());
        
        
        return business;
    }
    
    // Method to generate a random Tech Stack
    public static TechStack generateRandomTechStack() {
        Random random = new Random();

        // List of possible values for each category
        String[] programmingLanguages = {
        "Java", "Python", "C++", "JavaScript", "Ruby", "Swift",
        "C#", "PHP", "Go", "Rust", "TypeScript", "Kotlin",
        "Perl", "Scala", "Haskell", "Objective-C", "Lua", "Dart",
        "SQL", "HTML"
        };
        String[] frameworks = {       
        "Spring", "Hibernate", "React", "Angular", "Node.js", "Django",
        "Ruby on Rails", "Vue.js", "Laravel", "Express.js", "Flask", "Struts",
        "Ember.js", "Play Framework", "Meteor", "Symfony", "ASP.NET Core", "CakePHP",
        "MySQL", "MongoDB"
        };
        String[] tools = {
        "Eclipse", "IntelliJ IDEA", "Git", "Visual Studio Code", "PyCharm", "Sublime Text",
        "NetBeans", "Android Studio", "Xcode", "Atom", "Notepad++", "Vim",
        "Eclipse", "Visual Studio", "CLion", "WebStorm", "Rider", "Code::Blocks",
        "SQL Server Management Studio"
        };

        // Create lists to store unique random values
        List<String> randomProgrammingLanguagesList = new ArrayList<>();
        List<String> randomFrameworksList = new ArrayList<>();
        List<String> randomToolsList = new ArrayList<>();


        // Ensure a minimum of 3 unique random values for each category
        while (randomProgrammingLanguagesList.size() < 3 || randomFrameworksList.size() < 3 || randomToolsList.size() < 3) {
            String randomProgrammingLanguage = programmingLanguages[random.nextInt(programmingLanguages.length)];
            String randomFramework = frameworks[random.nextInt(frameworks.length)];
            String randomTool = tools[random.nextInt(tools.length)];

            // Add unique values to the lists
            if (!randomProgrammingLanguagesList.contains(randomProgrammingLanguage)) {
                randomProgrammingLanguagesList.add(randomProgrammingLanguage);
            }
            if (!randomFrameworksList.contains(randomFramework)) {
                randomFrameworksList.add(randomFramework);
            }
            if (!randomToolsList.contains(randomTool)) {
                randomToolsList.add(randomTool);
            }
        }

        // Create a new Tech Stack with the random values
        return new TechStack(randomProgrammingLanguagesList, randomFrameworksList, randomToolsList);
    }
    
        public static void assignCoursesToStudents(Business business) {
        CourseCatalog coursecatalog = business.getCourseCatalog();
        StudentDirectory studentdirectory = business.getStudentDirectory();

        Random random = new Random();

        for (StudentProfile studentProfile : studentdirectory.getStudentlist()) {
            // Randomly assign courses to students
            int numberOfCoursesToAssign = random.nextInt(5) + 1; // Assign 1 to 5 courses

            ArrayList<Course> availableCourses = coursecatalog.getCourseList();
            Collections.shuffle(availableCourses);

            for (int i = 0; i < numberOfCoursesToAssign && i < availableCourses.size(); i++) {
                Course course = availableCourses.get(i);
                studentProfile.addCourseToProfile(course);
                course.addStudent(studentProfile);
            }
        }
    }

        public static void assignRandomRelevantCoursesToJobs(Business business) {
            CourseCatalog courseCatalog = business.getCourseCatalog();
            JobCatalog jobCatalog = business.getJobCatalog();
            Random random = new Random();

            for (Job job : jobCatalog.getJobList()) {
                int numberOfRelevantCourses = random.nextInt(5) + 1; // Assign 1 to 3 relevant courses
                List<Course> availableCourses = new ArrayList<>(courseCatalog.getCourseList());
                Collections.shuffle(availableCourses);

                for (int i = 0; i < numberOfRelevantCourses && i < availableCourses.size(); i++) {
                    Course course = availableCourses.get(i);
                    job.getRelevantCourses().add(course);
                }
            }
        }

}
