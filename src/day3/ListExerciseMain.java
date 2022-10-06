package day3;

import java.util.List;

public class ListExerciseMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();

        List<String> students = listExercise.getStudents();

        for (String student : students) {
            System.out.println(student);
        }
    }
}

