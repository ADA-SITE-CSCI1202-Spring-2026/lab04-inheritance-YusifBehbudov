import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Person p1 = new Person("Jon", "Snow", "Male");
        Person p2 = new Person("Jon", "Snow", "Male");

        System.out.println(p1);
        System.out.println("Persons equal: " + p1.equals(p2));

        ArrayList<String> teacherCourses = new ArrayList<>();
        teacherCourses.add("Math");
        teacherCourses.add("Physics");

        Teacher t1 = new Teacher("Lala", "Aliyeva", "Female",
                "Science", teacherCourses);

        System.out.println("\n" + t1);

        Student s1 = new Student("Ilkin", "Abilov", "Male",
                "S12345");

        System.out.println("\n" + s1);

        ArrayList<String> phdCourses = new ArrayList<>();
        phdCourses.add("Advanced Algorithms");
        phdCourses.add("Machine Learning");

        PhdStudent phd1 = new PhdStudent("Sansa", "Stark", "Female",
                "PHD001", "Computer Science", phdCourses);

        System.out.println("\n" + phd1);
    }
}
