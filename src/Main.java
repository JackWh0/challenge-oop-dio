import br.com.dio.challenge.domain.Bootcamp;
import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Dev;
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
//        System.out.println(javaCourse.toString());

        Course pythonCourse = new Course();
        pythonCourse.setTitle("Python course");
        pythonCourse.setDescription("Python Course! Already available!");
        pythonCourse.setWorkload(25);
//        System.out.println(pythonCourse.toString());

        Mentoring javaMentoring = new Mentoring();
        javaMentoring.setTitle("Java mentoring");
        javaMentoring.setDescription("Watch this mentoring to get more knowledge");
        javaMentoring.setDate(LocalDate.now());
//        System.out.println(javaMentoring.toString());

        Bootcamp javaBootcamp = new Bootcamp();
        javaBootcamp.setTitle("Bootcamp Java Developer");
        javaBootcamp.setDescription("Please join us!");
        javaBootcamp.getAvailableContent().add(javaCourse);
        javaBootcamp.getAvailableContent().add(javaMentoring);

        Bootcamp pythonBootcamp = new Bootcamp();
        pythonBootcamp.setTitle("Bootcamp Python Developer");
        pythonBootcamp.setDescription("Feel free to join us");
        pythonBootcamp.getAvailableContent().add(pythonCourse);

        Dev jackwh0 = new Dev();
        jackwh0.setName("Jackson");
        jackwh0.subscribeToBootcamp(javaBootcamp);

        System.out.println(jackwh0.getName() + " has subscribed to get the following content: " + jackwh0.getSubscribedContent());

        jackwh0.updateProgress();

        System.out.println("Already finished content: " + jackwh0.getAlreadyFinishedContent());
        System.out.println("To do content: " + jackwh0.getSubscribedContent());
        System.out.println("Xp: " + jackwh0.calculateTotalXp());

        System.out.println("------------------------------");

        Dev heidenDev = new Dev();
        heidenDev.setName("Heiden");
        heidenDev.subscribeToBootcamp(pythonBootcamp);
        System.out.println(heidenDev.getName() + " has subscribed to get the following content: " + heidenDev.getSubscribedContent());
        heidenDev.updateProgress();
        System.out.println("Already finished content: " + heidenDev.getAlreadyFinishedContent());
        System.out.println("To do content: " + heidenDev.getSubscribedContent());
        System.out.println("Xp: " + heidenDev.calculateTotalXp());


    }
}