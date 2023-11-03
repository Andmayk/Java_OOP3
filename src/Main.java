import data.Student;
import data.StudentGroup;
import data.Stream;
import data.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        LocalDate dateOfBirth = LocalDate.parse("2003-10-16");

//        dateOfBirth

        Student student1 = new Student("Sfn1","Ssn","Sp", dateOfBirth, 1L);
        Student student2 = new Student("Sfn2","Ssn","Sp", dateOfBirth, 2L);
        Student student3 = new Student("Sfn3","Ssn","Sp", dateOfBirth, 3L);
        Student student4 = new Student("Sfn4","Ssn","Sp", dateOfBirth, 4L);
        Student student5 = new Student("Sfn5","Ssn","Sp", dateOfBirth, 5L);
        Student student6 = new Student("Sfn6","Ssn","Sp", dateOfBirth, 6L);
        Student student7 = new Student("Sfn7","Ssn","Sp", dateOfBirth, 7L);
        Student student8 = new Student("Sfn8","Ssn","Sp", dateOfBirth, 8L);
        Student student9 = new Student("Sfn9","Ssn","Sp", dateOfBirth, 9L);
        Student studentA = new Student("SfnA","Ssn","Sp", dateOfBirth, 10L);
        Student studentB = new Student("SfnB","Ssn","Sp", dateOfBirth, 11L);

        Teacher teacher1 = new Teacher("Tfn","Tsn","Tp",LocalDate.parse("1990-02-16"));
        Teacher teacher2 = new Teacher("Tfn","Tsn","Tp",LocalDate.parse("1990-02-16"));
        List<Student> students1 = new ArrayList<>();
        List<Student> students2 = new ArrayList<>();
        List<Student> students3 = new ArrayList<>();
        students1.add(student1);
        students1.add(student2);
        students1.add(student3);
        students1.add(student4);
        students2.add(student5);
        students2.add(student6);
        students2.add(student7);
        students2.add(student8);
        students3.add(student9);
        students3.add(studentA);
        students3.add(studentB);
        StudentGroup studentGroup1 = new StudentGroup(teacher1,students1);
        StudentGroup studentGroup2 = new StudentGroup(teacher2,students2);
        StudentGroup studentGroup3 = new StudentGroup(teacher1,students3);
        List<StudentGroup> studentGroups1 = new ArrayList<>();
        List<StudentGroup> studentGroups2 = new ArrayList<>();
        studentGroups1.add(studentGroup1);
        studentGroups1.add(studentGroup2);
        studentGroups2.add(studentGroup2);
        Stream stream1 = new Stream("Fiziki",studentGroups1);
        Stream stream2 = new Stream("Liriki",studentGroups2);

        for (StudentGroup group: stream1 ) {
            System.out.println(group);

        }
        System.out.println(stream1);
    }
}