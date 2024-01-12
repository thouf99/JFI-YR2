import java.util.ArrayList;

public class Student {
	private String name;
	private String department;
	private int age;
	private String userName;
	private int studentNumber;
	private boolean fullTime;

	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public int getAge() {
		return age;
	}
	public String getUserName() {
		return userName;
	}
	public int getStudentNumber() {
		return studentNumber;
	}
	public boolean isFullTime() {
		return fullTime;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}
	public void setFullTime(boolean fullTime) {
		this.fullTime = fullTime;
	}

	//using arraylist to call grades
	public ArrayList<Grade> grade = new ArrayList<Grade>();
	

	Student(String name,String department,int age,int studentNumber,boolean fullTime)
	{
		this.name = name;
		this.department = department;
		this.age = age;
		this.studentNumber = studentNumber	;
		this.fullTime = fullTime;

		String num = String.valueOf(studentNumber);
		String name_num = name + num;
		String [] array_name_num = name_num.split(" ");
		userName = array_name_num[0].substring(0,1)+ array_name_num[1].substring(0,4) + num.substring(0,3);
		userName.toLowerCase();


	}

	public String toString()
	{
		return "Student = name: " + name +  " , " + "department: " + department +  " , " + "age: " + age +  ", "
				+"username: " + userName.toLowerCase() + "," + "studentNumber: " + studentNumber + " ," + "full-time: " + fullTime
				+ "\n" + "Grades: " + grade.toString() +"\n";
	}

}
