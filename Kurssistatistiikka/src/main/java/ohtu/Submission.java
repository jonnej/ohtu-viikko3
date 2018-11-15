package ohtu;

public class Submission {
    private int week;
    private int hours;
    private String course;
    private int[] exercises;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int[] getExercises() {
        return exercises;
    }

    public void setExercises(int[] exercises) {
        this.exercises = exercises;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getWeek() {
        return week;
    }

    public String printExercises() {
        String print = "";
        for (int i = 0; i < exercises.length; i++) {
            print += " " + i;
            if (i + 1 != exercises.length) {
                print += ",";
            }
        }

        return print;
    }

    @Override
    public String toString() {
        return course + ", viikko " + week + " tehtyjä tehtäviä yhteensä " + exercises.length + " aikaa kului " + hours
                + " tehdyt tehtävät:" + printExercises();
    }
    
}