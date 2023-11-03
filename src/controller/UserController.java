package controller;

import data.Stream;
import data.Student;
import data.Teacher;
import data.User;
import service.DataService;
import service.StreamService;
import service.StudentGroupService;
import view.UserView;

import java.time.LocalDate;
import java.util.List;

public class UserController {

    private final DataService dataService = new DataService();
    private final StudentGroupService studentGroupService = new StudentGroupService();

    //— Модифицировать класс Контроллер, добавив в него созданный сервис;
    private final StreamService streamService = new StreamService();
    private final UserView userView = new UserView();

    public void createStudent(String firstName, String secondName, String patronymic, LocalDate dateOfBirth){
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        List<User> userList = dataService.getAll();
        userView.sendOnConsole(userList);
    }

    public void createStudentGroup(Teacher teacher, List<Student> students){
        studentGroupService.createStudentGroup(teacher, students);
    }

    public Student getStudentInStudentGroup(String firstName, String secondName){
        return studentGroupService.getStudentFromStudentGroup(firstName, secondName);
    }

    public List<Student> getSortedListStudentFromStudentGroup(){
        return studentGroupService.getSortedStudentGroup();
    }

    public List<Student> getSortedListByFIOStudentFromStudentGroup(){
        return studentGroupService.getSortedByFIOStudentGroup();
    }

    //— Модифицировать класс Контроллер, добавив в него метод, сортирующий список потоков, путём вызова созданного сервиса.
    public List<Stream> getSortedStreamByCountGroup(List<Stream> streams){
        return streamService.getSortedStreamByCountGroup(streams);
    }


}
