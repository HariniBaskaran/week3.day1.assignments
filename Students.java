package week3.day1.assignments;

public class Students {
	int id;
	
	void getStudentInfo(int id) {
		this.id = id;
	}
	
	void getStudentInfo(int id,String name) {
		System.out.println("Student id:"+ this.id +"\n"+"Student name:"+name);
	}
	
	void getStudentInfo(String email,long PhoneNumber) {
		
		System.out.println("Student email:"+email+"\n"+"Student PhoneNumber:"+PhoneNumber);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=new Students();
		s.getStudentInfo(31);
		s.getStudentInfo(34, "Harini");
		s.getStudentInfo("harini31195@gmail.com",8526413600L);
	}

}
