package homework3;

import org.jetbrains.annotations.NotNull;

public class Student {

    private String firstName;
    private String lastName;
    private double rating;

    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String name, String lastName, double rating) {
        this.firstName = name;
        this.rating = rating;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        if (this.firstName.isEmpty()) {
            System.out.println("The name cannot be empty");
        } else
            this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        if (this.lastName.isEmpty()) {
            System.out.println("The last name cannot be empty");
        } else
            this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setRating(double rating) {
        if (rating < 0.0 || rating > 100.0) {
            System.out.println("The rating must be from 0 to 100");
        } else
            this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public String betterStudent(@NotNull Student student1, @NotNull Student student2) {
      String a = "true";
      String b = "false";
      String c = "Student ratings are equal";
      if (student1.getRating() > student2.getRating()) {
          return a;
      } else if (student1.getRating() < student2.getRating()) {
          return b;
      }
        return c;
    }


    public void printStudentData() {
        System.out.println("Student name: " + firstName);
        System.out.println("Student rating: " + rating);
    }

    public double changeRating(double newRating) {
        return this.rating = newRating;
    }

    public double getAverageRating (@NotNull double ...studentRating){
        double result = 0;
        for(double n: studentRating)
            result += n;
        double average = 0;
        return average = result/studentRating.length;
    }

}






