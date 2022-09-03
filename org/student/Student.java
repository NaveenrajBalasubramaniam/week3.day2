package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Alex");
	}
	public void studentDept() {
		System.out.println("ECE");
	}
	public void studentId() {
		System.out.println("1005");
	}
	public static void main(String[] args) {
		Student student = new Student();
		student.collageName();
		student.collageCode();
		student.collageRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();

	}

}
