package test2;

import java.util.Scanner;

public class StudentMarkSheet {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] rollNumbers = new int[10];
		int[][] marks = new int[10][3];

		for (int i = 0; i < 10; i++) {
			System.out.println("Enter details for Student " + (i + 1) + ":");
			System.out.print("Roll Number: ");
			rollNumbers[i] = scanner.nextInt();

			System.out.print("Marks in Subject 1: ");
			marks[i][0] = scanner.nextInt();

			System.out.print("Marks in Subject 2: ");
			marks[i][1] = scanner.nextInt();

			System.out.print("Marks in Subject 3: ");
			marks[i][2] = scanner.nextInt();
		}

		System.out.println("\nStudent Details:");
		for (int i = 0; i < 10; i++) {
			int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
			double averageMarks = totalMarks / 3.0;

			System.out.println("Roll Number: " + rollNumbers[i]);
			System.out.println("Total Marks: " + totalMarks);
			System.out.println("Average Marks: " + averageMarks + "\n");
		}

		scanner.close();
	}
}
