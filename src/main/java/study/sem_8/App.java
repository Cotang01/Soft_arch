package study.sem_8;

import java.util.ArrayList;
import java.util.List;

import study.sem_8.controller.Controller;
import study.sem_8.model.Model;
import study.sem_8.model.domain.Student;
import study.sem_8.view.View;
import study.sem_8.controller.Interfaces.IGetModel;
import study.sem_8.controller.Interfaces.IGetView;

public class App {

    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student("Сергей", 21, 101);
        Student s2 = new Student("Андрей", 22, 111);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь", 23, 301);
        Student s5 = new Student("Даша", 25, 171);
        Student s6 = new Student("Лена", 23, 104);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);

        IGetModel mod = new Model(students);
        IGetView viw = new View();

        Controller cntrl = new Controller(mod, viw);
        cntrl.update();

    }
	
}
