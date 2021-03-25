package homework5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadDataApp {
    public static void main(String[] args) throws IOException {

        File file = new File("StudentList");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Mariia Semeniuk");
        pw.println("Nazar Dodor");
        pw.println("Anastasiya Vynogradska");
        pw.println("Andrii Ivanenko");
        pw.println("Anna Kadykalo");
        pw.println("Artur Burov");
        pw.println("Krystyna Harmatii");
        pw.println("Konstiantyn Kasharailo");
        pw.println("Mariana Oryniak");
        pw.println("Anhelina Fedchenco");
        pw.println("Anna Karpenko");
        pw.println("Vadym Cherechecha");
        pw.println("Vitalii Huk");
        pw.println("Yana Babenko");
        pw.println("Tetiana Chetvernia");

        pw.close();

        ArrayList<String> studentsList = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        String student = scanner.nextLine();
        studentsList.add(student);
        while (scanner.hasNext()){
            student = scanner.nextLine();
            studentsList.add(student);
        }
        System.out.println(studentsList);
        scanner.close();

        Collections.sort(studentsList);
        System.out.println(studentsList);


        File file1 = new File("SortStudentList");
        PrintWriter pw1 = new PrintWriter(file1);


        for (int i = 0; i < studentsList.size(); i++){
           String st =  studentsList.get(i);
           pw1.println(st);
        }

        pw1.close();
    }

}