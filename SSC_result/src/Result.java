import java.text.DecimalFormat;
import java.util.Scanner;

public class Result {

	static String seatNumber = null;
	static String name = null;
	static String motherName = null;
	static int engish;
	static int hindi;
	static int marathi;
	static int mathamatics;
	static int scienceAndTechnology;
	static int socialScience;
	static int total;
	final static String division = "PUNE";
	static double percentage;
	static int count = 0;

	static Scanner sc = new Scanner(System.in);

	private void m1() {
		System.out.println("   ===============================WELCOME==================================");
		System.out.println("   ========================================================================");
		System.out.println("   MAHARASHTRA STATE BOARD OF SECONDARY & HIGHER SECONDARY EDUCATION, PUNE");
		System.out.println("   ------------------------------------------------------------------------");
		System.out.println("                  SSC EXAMINATION RESULT FEBRUARY 2025                     ");
		Result.m2();
		Result.m3();
	}

	static private void m2() {
		System.out.print("Enter Your Seat Number :");
		seatNumber = sc.nextLine();
		System.out.print("Enter Your Name is Full Format :");
		name = sc.nextLine();
		System.out.print("Enter Your Mother Name (First Name required only):");
		motherName = sc.nextLine();
	}

	public static void m3() {
		System.out.println();

		if (!(seatNumber == null) && !(name == null) && !(motherName == null))// i having problem checking this
																				// condition
		{

			// System.out.println("ok");
			Result.marks();

		} else {
			System.out.println("\n====================Please fill the data properly=============================");
			Result.m2();
		}
	}

	private static int subj(int mark) {
		// int mark1=mark;
		if (mark <= 100) {
			if (mark < 35) {
				++count;

				System.out.println("\nNext sbject is:");
			} else {
				System.out.println("\nNext sbject is:");
			}
		} else {
			System.out.println("\nEnter Your correct English Mark:");
			Result.marks();
		}
		return count;
	}

	private static int lastSubj(int mark) {
		// int mark1=mark;
		if (mark <= 100) {
			if (mark < 35) {
				++count;
				Result.failed();

			} else {
				System.out.println("------------------------------------------------------------------------------");
			}
		} else {
			System.out.println("\nEnter Your correct English Mark:");
			Result.marks();
		}
		return count;
	}

	private static int marks() {
		System.out.println("/n==================Please Enter Your Subject Marks=============================");
		// 1st subject logic
		System.out.print("Engish(1st Lang):");
		engish = sc.nextInt();
		count = Result.subj(engish);
		// System.out.println(count);

		// 2nd logic
		System.out.print("Hindi(2st Lang):");
		hindi = sc.nextInt();
		count = Result.subj(hindi);
		// System.out.println(count);

		// 3rd subject logic
		System.out.print("Marathi(3st Lang):");
		marathi = sc.nextInt();
		count = Result.subj(marathi);
		// System.out.println(count);

		// 4th subject logic
		System.out.print("Mathematics:");
		mathamatics = sc.nextInt();
		count = Result.subj(mathamatics);
		// System.out.println(count);

		// 5th subject logic
		System.out.print("Science & Technology:");
		scienceAndTechnology = sc.nextInt();
		count = Result.subj(scienceAndTechnology);
		// System.out.println(count);

		// 6th subject logic
		System.out.print("Social Science:");
		socialScience = sc.nextInt();
		count = Result.lastSubj(socialScience);
		// System.out.println(count);

		total = engish + hindi + marathi + mathamatics + scienceAndTechnology + socialScience;
		// System.out.println("total mark is:"+total);
		Result.output();

		return total;
	}

	private static void perscentage(int a) {
		// System.out.println(a);
		double part = a;
		double whole = 600;

		percentage = (part / whole) * 100;
		DecimalFormat df = new DecimalFormat("0.00");
		df.format(percentage);

		// System.out.println(percentage);

	}

	private static void output() {
		if (!(count == 0)) {
			// System.out.println("failed");
			Result.failed();

		} else {
			// System.out.println("pass");
			Result.perscentage(total);
			Result.result();
		}
	}

	static private void failed() {
		System.out
				.println("===========================================================================================");

		System.out.println("\"You failed " + count + " subject the 10th-grade exam. Don't give up, try again!\"");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println(
				"======Reminder: Fill out the exam form for 10th standard in October!=========================");

	}

	static private void result() {
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("                   MAHARASHTRA STATE BOARD OF SECONDARY                             ");
		System.out.println("                  AND HIGHER SECONDARY EDUCATION, PUNE                              ");
		System.out.println("\n                  SSC EXAMINATION FEBRUARY-2025 RESULT                              ");
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("NAME   :  " + name);
		System.out.println("MOTHER NAME :  " + motherName);
		System.out.println("SEAT NO :  " + seatNumber);
		System.out.println("DIVISION : " + division);
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("SUBJECT CODE          |                 SUBJECT NMAE               |     MARKS OBTAINED |");
		System.out.println("-------------------------------------------------------------------------------------|");
		System.out.println(
				"     03               |                ENGLISH(1ST LANG)           |     " + engish + "        |");
		System.out.println("-------------------------------------------------------------------------------------|");
		System.out.println(
				"     15               |                HINDI(2ST LANG)             |     " + hindi + "         |");
		System.out.println("-------------------------------------------------------------------------------------|");
		System.out.println(
				"     03               |                MARATHI(3/4 LANG)           |     " + marathi + "       |");
		System.out.println("-------------------------------------------------------------------------------------|");
		System.out.println(
				"     03               |                MATHEMATICS                 |     " + mathamatics + "       |");
		System.out.println("-------------------------------------------------------------------------------------|");
		System.out.println("     03               |                SCIENCE & TECHNOLOGY        |     "
				+ scienceAndTechnology + "       |");
		System.out.println("-------------------------------------------------------------------------------------|");
		System.out.println("     03               |                SOCIAL SCIENCES             |     " + socialScience
				+ "       |");
		System.out.println("-------------------------------------------------------------------------------------|");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(
				"                      |                TOTAL :                      |     " + total + "         |");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("                      |                PERCENTAGE  :                |     " + percentage
				+ "         |");
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(
				"                       |             RESULT : PASS                                                |");
		System.out.println("-----------------------------------------------------------------------------------------");

	}

	public static void main(String[] args) {
		new Result().m1();

	}
}
