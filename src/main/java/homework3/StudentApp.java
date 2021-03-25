package homework3;



public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student();
        Student s1 = new Student("Andrey", "Tur",90.0);
        Student s2 = new Student("Svetlana", "Kvachov", 78.5);
        Student s3 = new Student("Sandeep", "Koval", 90.0);
        Student s4 = new Student("Nikolay", "Kozhanov",65.8);

        double averageRating = (s1.getRating() + s2.getRating() + s3.getRating() + s4.getRating())/4;
        String compareRatingStudents = student.betterStudent(s3,s1);


        System.out.println("The average rating: " + averageRating);
        System.out.println("The first student better then second: " + compareRatingStudents);
        System.out.println("*********");
        s1.printStudentData();
        System.out.println("*********");
        s2.printStudentData();
        System.out.println("*********");
        s3.printStudentData();
        System.out.println("*********");
        s4.printStudentData();
        System.out.println("*********");
        System.out.println("The new rating: " + s4.changeRating(78.4));
        System.out.println("Return average rating any number of students: " + student.getAverageRating(s1.getRating(),s2.getRating()));


    }
}
