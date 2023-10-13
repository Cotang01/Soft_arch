package study.sem_8.view;

import java.util.List;

import study.sem_8.controller.Interfaces.IGetView;
import study.sem_8.model.domain.Student;

public class View implements IGetView {
	
	public void printAllStudent(List<Student> students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}
}
