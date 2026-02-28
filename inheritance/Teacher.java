import java.util.ArrayList;

public class Teacher extends Person {
    private String department;
    private ArrayList<String> courses;

    public Teacher(String firstName, String lastName, String gender,
                   String department, ArrayList<String> courses) {
        super(firstName, lastName, gender);
        this.department = department;
        this.courses = courses;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return super.toString() +
               ", Department: " + department +
               ", Courses: " + courses;
    }

    public boolean equals(Teacher t) {
        if (t == null) return false;
        return super.equals(t) &&
               department.equals(t.department) &&
               courses.equals(t.courses);
    }
}