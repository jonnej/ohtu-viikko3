package ohtu;

public class Course {
    private String _id;
    private String name;
    private String url;
    private int week;
    private boolean enabled;
    private String term;
    private int year;
    private int __v;
    private String fullName;
    private boolean miniproject;
    private int[] exercises;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int get__v() {
        return __v;
    }

    public void set__v(int __v) {
        this.__v = __v;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isMiniproject() {
        return miniproject;
    }

    public void setMiniproject(boolean miniproject) {
        this.miniproject = miniproject;
    }

    public int[] getExercises() {
        return exercises;
    }

    public void setExercises(int[] exercises) {
        this.exercises = exercises;
    }

    public int getTotalExerciseCount() {
        int totalExercises = 0;
        for (int i = 0; i < exercises.length; i++) {
            totalExercises += exercises[i];
        }
        return totalExercises;
    }

    @Override
    public String toString() {
        return fullName + " " + term + " " + year;
    }
}
