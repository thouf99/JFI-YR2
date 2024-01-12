import java.util.ArrayList;

public class Grade {
private String subject;
private int score;

public ArrayList<Student> students = new ArrayList<Student>();

Grade(String Subjects, int Scrores)
{
	this.subject = Subjects;
	this.score = Scrores;
}
//getters and setters for attributes

	public String getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setScore(int score) {
		this.score = score;
	}

	public static char getLetterGrade(int score)
{
	char letteredgrade;
	if(score >= 100 || score < 0){
		letteredgrade = 'E';
	}else {
		if(score >= 70)
		{
			letteredgrade = 'A';
		}
		else if(score >= 60)
		{
			letteredgrade = 'B';
		}
		else if(score >= 50)
		{
			letteredgrade = 'C';
		}
		else if(score >= 40)
		{
			letteredgrade = 'D';
		}
		else {
			letteredgrade = 'F';
		}
	}
	return letteredgrade;
}

public static String check(){
	if(Grade.getLetterGrade((40)) == 'F'){
		System.out.println(Student.class.getName());
	}
	return check();
}

public String toString()
{
	return " Grade = " +"Subject: " + subject + " , " + "Score: " + score  +" , " + Grade.getLetterGrade(getScore()) + " ] "+ "\n";
}
}
