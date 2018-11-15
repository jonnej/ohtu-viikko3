package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.Arrays;

import org.apache.http.client.fluent.Request;

public class Main {

    public static void main(String[] args) throws IOException {
        // ÄLÄ laita githubiin omaa opiskelijanumeroasi
        String studentNr = "012345678";
        if ( args.length>0) {
            studentNr = args[0];
        }

        String url = "https://studies.cs.helsinki.fi/courses/students/"+studentNr+"/submissions";

        String bodyText = Request.Get(url).execute().returnContent().asString();

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);

        String coursesUrl = "https://studies.cs.helsinki.fi/courses/courseinfo";
        String coursesText = Request.Get(coursesUrl).execute().returnContent().asString();
        Course[] courses = mapper.fromJson(coursesText, Course[].class);

        System.out.println("opiskelijanumero: " + studentNr + "\n");

        for (Course course : courses) {
            printCourse(subs, course);
        }

    }

    public static void printCourse(Submission[] subs, Course course) {
        int totalExercises = 0;
        int totalHours = 0;

        System.out.println(course + "\n");

        for (Submission submission : subs) {
            if (!submission.getCourse().equals(course.getName())) {
                continue;
            }
            System.out.println("Viikko " + submission.getWeek());
            System.out.println(" " + submission.print(course.getExercises()[submission.getWeek()]));
            totalExercises += submission.getExercises().length;
            totalHours += submission.getHours();
        }

        System.out.println("\n" + "yhteensä: " + totalExercises + "/" + course.getTotalExerciseCount() + " tehtävää " + totalHours + " tuntia" + "\n");
    }
}