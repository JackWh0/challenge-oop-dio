import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Mentoring;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course javaCourse = new Course();
        javaCourse.setTitle("Java course");
        javaCourse.setDescription("OOP Course! Click right now!");
        javaCourse.setWorkload(40);
        System.out.println(javaCourse.toString());

        Course pythonCourse = new Course();
        pythonCourse.setTitle("Python course");
        pythonCourse.setDescription("Python Course! Already available!");
        pythonCourse.setWorkload(25);
        System.out.println(pythonCourse.toString());

        Mentoring javaMentoring = new Mentoring();
        javaMentoring.setTitle("Java mentoring");
        javaMentoring.setDescription("Watch this mentoring to get more knowledge");
        javaMentoring.setDate(LocalDate.now());
        System.out.println(javaMentoring.toString());

    }
}