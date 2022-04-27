import java.util.Scanner; 
import java.util.ArrayList;
import java.util.Random;
import java.lang.*;
public class StudentManage extends StudentAccount{
	private String name;
	private int year;
	public int id;
	public String grade;
	public int current = 0;
	public int balance = (int)(Math.random()*3000 + 2500);
	public String course = "";
	public int count1 = 0;
	public int count2 = 0;
	public int count3 = 0;
	public int count4 = 0;
	
	
	public StudentManage(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public int rand_id(String grade) {
		int rand_Id_grade = (int)(Math.random()*2000 + 1000);
		System.out.println("ID: " + grade + rand_Id_grade);
		return rand_Id_grade ;
	}

	void tuition() {
		char choice = '\0';
		Scanner scanner_choice = new Scanner(System.in);
		do {
			System.out.println("Choose courses: \n 1 for Intro to Psych \n 2 for Biostats \n 3 for Accounting \n 4 for Communications \n 5 for Exit Course Selection \n");
			System.out.print("Enter Choice: ");
			char choice_2 = scanner_choice.next().charAt(0);
			choice = Character.toUpperCase(choice_2);
			
			if(choice == '1') {
				count1 += 1;
				if(count1 > 1) {
					current += 0;
					course += "";
					System.out.println("Course already selected, choose another course.");
				} else if (count1 <= 1) {
					current += 600;
					course += " Intro to Psych ";
				}
			} else if (choice == '2') {
				count2 += 2;
				if(count2 > 2) {
					current += 0;
					course += "";
					System.out.println("Course already selected, choose another course.");
				} else {
					current += 600;
					course += " Biostats ";
				}
			} else if (choice == '3') {
				count3 += 3;
				if(count3 > 3) {
					current += 0;
					course += "";
					System.out.println("Course already selected, choose another course.");
				} else {
					current += 600;
					course += " Accounting ";
				}
			} else if (choice == '4') {
				count4 += 4;
				if(count4 > 4) {
					current += 0;
					course += "";
					System.out.println("Course already selected, choose another course.");
				} else {
					current += 600;
					course += " Communication ";
				}
			}
		} while(choice != '5');
	}
	
	void menu () {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		System.out.println("choose an option \n A for Choose Courses \n B for Check Balance \n C for Pay Tuition \n D for Check Status \n E for Tuition Due \n F for Exit Student");
		do {
			System.out.print("Enter Option: ");
			char opt_U = scanner.next().charAt(0);
			option = Character.toUpperCase(opt_U);
			switch(option) {
				case 'A':
					tuition();
					break;
				case 'B':
					System.out.println("Balance: " + balance);
					break;
				case 'C':
					System.out.print("Payment Amount: ");
					Scanner amount_paying = new Scanner(System.in);
					int amount_typed = amount_paying.nextInt();
					balance -= amount_typed;
					current -= amount_typed;
					if (current < 0) {
						current = 0;
					}
					break;
				case 'D':
					System.out.println("Name: " + name);
					rand_id(grade);
					System.out.println("Courses: " + course);
					System.out.println("Balance: " + balance);
					break;
				case 'E':
					System.out.println("Amount Owed: " + current);
					break;
			}
		} while(option != 'F');
	}
}