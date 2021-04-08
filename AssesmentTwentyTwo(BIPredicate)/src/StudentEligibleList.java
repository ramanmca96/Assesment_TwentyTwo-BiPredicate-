import java.util.ArrayList;
import java.util.function.Predicate;

class StudentDetails {
	int StudentID;
	String StudentName;
	int StudentAge;

	public StudentDetails(int studentID, String studentName, int studentAge) {
		super();
		StudentID = studentID;
		StudentName = studentName;
		StudentAge = studentAge;
	}

}

public class StudentEligibleList {

	public static void main(String[] args) {

		ArrayList<StudentDetails> list = new ArrayList<StudentDetails>();

		list.add(new StudentDetails(18461, "KadaramKondan", 19));
		list.add(new StudentDetails(18462, "Rangan", 25));
		list.add(new StudentDetails(18463, "Arunmozhi", 16));
		list.add(new StudentDetails(18464, "Rajendiran", 18));

		Predicate<StudentDetails> check = (i) -> (i.StudentAge >= 18);
		
		
		for (StudentDetails studentDetails : list) {

			if (check.test(studentDetails))
				
			{
				System.out.println(studentDetails.StudentName + " " + studentDetails.StudentAge);
				System.out.println("He is Eligible For Watch the Movie");
				System.out.println(" ");
			}
			
			else
			{
				System.out.println(studentDetails.StudentName + " " + studentDetails.StudentAge);
				System.out.println("He is Not Eligible For Watch the Movie");
				System.out.println(" ");
			}	
			}
			
		}

	}
