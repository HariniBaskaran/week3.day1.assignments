package week3.day1.assignments.org.student;

import week3.day1.assignments.org.department.Department;

public class Student extends Department{

	public void studentName(String stuName) {
		System.out.println("Student Name is "+stuName);
	}
	
	public void studentDept(String stuDept) {
		System.out.println("Student department is "+stuDept);
	}
	
	public void studentId(int stuId)
	{
		System.out.println("Student id is " + stuId);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu=new Student();
		stu.collegeName("AAMEC");
		stu.collegeCode(8204);
		stu.collegeRank(1);
		stu.studentName("Harini");
		stu.studentId(34);
		stu.studentDept(stu.deptName("CSE"));
	}

}
