import java.io.IOException;
import java.util.ArrayList;

public class t {
    public static void main(String[] args) throws IOException {
        Student[] students = FileUtil.parseStudents("C:\\Users\\cdlfg\\IdeaProjects\\am\\src\\students.txt");
        Se se = new Se(students, 2015210009);
        int p = se.KeyPosition();
        if (p != -1) {
            System.out.println(students[se.KeyPosition()].getName());
        }else {
            System.out.println("no");
        }

        TT tt = new TT();
        for (Student student : students) {
            tt.add(student.getName());
        }

        System.out.println(tt.ex("李潇"));
    }
}
