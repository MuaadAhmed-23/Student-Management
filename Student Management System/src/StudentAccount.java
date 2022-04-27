import java.util.Scanner; 
import java.util.Arrays;
public class StudentAccount {
	public static void main(String[] args) {
		System.out.print("Number of Students ? ");
		Scanner num_of_student = new Scanner(System.in);
		int prompt_student = num_of_student.nextInt();
		int count = 0;
		StudentManage[] studentManage = new StudentManage[prompt_student];
		do {
			System.out.println("==============");
			System.out.println("New Student");
			System.out.println("==============");
			System.out.print("Enter Name: ");
			Scanner prompt = new Scanner(System.in);
			String prompt_name = prompt.nextLine();
			
			System.out.print("Enter Year: ");
			Scanner ask_year = new Scanner(System.in);
			int prompt_year = ask_year.nextInt();
			
			System.out.print("Enter Grade: ");
			Scanner ask_grade = new Scanner(System.in);
			String prompt_grade = ask_grade.next();
			
			studentManage[count] = new StudentManage(prompt_name, prompt_year);
			studentManage[count].setGrade(prompt_grade);
			studentManage[count].setId(studentManage[count].rand_id(studentManage[count].getGrade()));
			studentManage[count].menu();
			
		 	System.out.println(studentManage[count]);
			
			count++;
			
		} while(count < prompt_student);
	}
}