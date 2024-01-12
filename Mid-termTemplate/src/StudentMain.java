import java.util.ArrayList;
import java.util.Scanner;
public class StudentMain {

	private static ArrayList<Student> student1 = new ArrayList<Student>();
	private static ArrayList<Grade> level = new ArrayList<Grade>();

	public static void main(String[] args) {


		student1.add(new Student("Bert Smith", "Computing", 21, 12345, true));
		student1.add(new Student("Olivia Green", "Computing", 19, 23464, true));
		student1.add(new Student("Eloise Jones", "Computing", 18, 34744, false));
		student1.add(new Student("Ben Bird", "Computing", 42, 34834, false));
		student1.add(new Student("Karen Brown", "Computing", 25, 45632, false));

		student1.get(4).grade.add(new Grade("programming", 62));
		student1.get(4).grade.add(new Grade("Web Dev", 51));
		student1.get(4).grade.add(new Grade("Maths", 43));
		student1.get(4).grade.add(new Grade("Algorithms", 43));

		student1.get(0).grade.add(new Grade("programming", 52));
		student1.get(0).grade.add(new Grade("Web Dev", 63));
		student1.get(0).grade.add(new Grade("Maths", 76));
		student1.get(0).grade.add(new Grade("Algorithms", 68));


		student1.get(2).grade.add(new Grade("programming", 65));
		student1.get(2).grade.add(new Grade("Web Dev", 63));
		student1.get(2).grade.add(new Grade("Maths", 37));
		student1.get(2).grade.add(new Grade("Algorithms", 40));

		student1.get(3).grade.add(new Grade("programming", 55));
		student1.get(3).grade.add(new Grade("Web Dev", 29));
		student1.get(3).grade.add(new Grade("Maths", 56));
		student1.get(3).grade.add(new Grade("Algorithms", 38));


		student1.get(1).grade.add(new Grade("programming", 73));
		student1.get(1).grade.add(new Grade("Web Dev", 82));
		student1.get(1).grade.add(new Grade("Maths", 72));
		student1.get(1).grade.add(new Grade("Algorithms", 66));
//		System.out.println(student1.toString());

		String input;

		Scanner sn = new Scanner(System.in);

		while (true) {
			//Print the options for the user to choose from
			System.out.println("Available Options");
			System.out.println("Press 1 print out a report of all students including " +
								"lettered grades for each module score");
			System.out.println("Press 2 print the name of all students with a failed module ");
			System.out.println("Press 3 print out average grade for each student");
			System.out.println("Press 4 Add a new student to the system taking in name, department, age, student\n" +
					"number and a grade for each of the four modules");
			System.out.println("Press 5 to exit");

			input = sn.next();
			switch (input) {
				case "1":
					//
					System.out.println(student1.toString());
					break;
				case "2":
					//
					System.out.println("done with job number 2");
					break;
				case "3":
					//
					System.out.println("done with job number 3");
					break;
				case "4":
					//
					System.out.println("done with job number 4");
					break;
				case "5":
					//exit from the program
					System.out.println("Exiting...");
					System.exit(0);
				default:
					// Will do this if it's not an option
					System.out.println("Invalid");

			}
		}

	}
}
