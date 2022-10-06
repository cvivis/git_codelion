package day3.LikeLion;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise() {
        students = new ArrayList<>();
        this.students.add("권하준");
        this.students.add("조성윤");
    }

    public List<String> getStudents() {
        return students;
    }
}
