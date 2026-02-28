import java.util.ArrayList;

public class PhdStudent extends Student {
    private String department;
    private ArrayList<String> courses;

    public PhdStudent (String firstName, String lastName, String gender, String studentId, String department, ArrayList<String> courses) {
        super(firstName, lastName, gender, studentId);
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

    public boolean equals(PhdStudent pStud) {
        if (pStud == null) return false;
        return super.equals(pStud) &&
               department.equals(pStud.department) &&
               courses.equals(pStud.courses);
    }
}