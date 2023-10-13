package study.sem_8.model;

import java.util.List;

import study.sem_8.controller.Interfaces.IGetModel;
import study.sem_8.model.domain.Student;

public class Model implements IGetModel {

    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents() {
        return students;
    }
}