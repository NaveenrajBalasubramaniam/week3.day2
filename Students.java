package week3.day2;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("ID Alone: "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("ID and name: "+id+" "+name);
	}
	public void getStudentInfo(String email, long phoneNum) {
		System.out.println("Email and phone number: "+email+" "+phoneNum);
	}
	public static void main(String[] args) {
		Students students = new Students();
		students.getStudentInfo(10001);
		students.getStudentInfo(1006, "Naveen");
		students.getStudentInfo("naveen@gmail.com", 9080739453l);

	}

}
