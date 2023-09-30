package study.sem_3.extra.first_extra;

public class Accounting {
	
	public int calculateNetSalary(Employee worker) {
		int tax = (int) (worker.getBaseSalary() * 0.25);//calculate in otherway
		return worker.getBaseSalary() - tax;
	}
	
}
