import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "John", 85.5));
        students.add(new Student(2, "Alice", 90.0));
        students.add(new Student(3, "Bob", 78.3));
        students.add(new Student(4, "Eve", 92.7));
        students.add(new Student(5, "Charlie", 88.2));
        students.add(new Student(6, "Diana", 76.8));
        students.add(new Student(7, "Frank", 95.1));
        students.add(new Student(8, "Grace", 82.4));
        students.add(new Student(9, "Henry", 79.6));
        students.add(new Student(10, "Ivy", 87.3));

        double averageScore = students.stream()
                .mapToDouble(Student::getScore)
                .average()
                .orElse(0.0);
        System.out.println("Средний балл: " + averageScore);

        Optional<Student> studentWithHighestScore = students.stream()
                .max(Comparator.comparingDouble(Student::getScore));
        studentWithHighestScore.ifPresent(student -> System.out.println("Студент с самым высоким баллом: "
                + student.getName() + " (Балл: " + student.getScore() + ")"));

        Optional<Student> studentWithLowestScore = students.stream()
                .min(Comparator.comparingDouble(Student::getScore));
        studentWithLowestScore.ifPresent(student -> System.out.println("Студент с самым низким баллом: "
                + student.getName() + " (Балл: " + student.getScore() + ")"));

        List<Student> highScorers = students.stream()
                .filter(student -> student.getScore() > 80)
                .toList();
        System.out.println("Студенты с баллом > 80: " + highScorers.stream().map(Student::getName).toList());

        List<Student> sortedByScoreDescending = students.stream()
                .sorted(Comparator.comparingDouble(Student::getScore).reversed())
                .toList();
        System.out.println("Студенты, отсортированные по баллам (по убыванию): " + sortedByScoreDescending.stream().map(Student::getName).toList());

        Map<Double, List<Student>> studentsGroupedByScore = students.stream()
                .collect(Collectors.groupingBy(Student::getScore));

        studentsGroupedByScore.forEach((score, studentList) -> {
            List<String> studentNames = studentList.stream().map(Student::getName).toList();
            System.out.println("Студенты с баллом " + score + ": " + studentNames);
        });
    }
}