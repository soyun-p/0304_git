package work;

import java.util.Scanner;

public class Ex2_work_scanner2 {
	public static void main(String[] args) {

		// 수1 : 11
		// 수2 : 50
		// 연산자 : +

		// 11 + 50 = 61

		Scanner sc = new Scanner(System.in);

		System.out.println("수1 : ");
		int n1 = sc.nextInt();		

		System.out.println("수2 : ");
		int n2 = sc.nextInt();		
		
		System.out.println("연산자 : ");
		String op = sc.next();		   // 스위치문을 이용하여 연산자를 스트링으로 받을 수 있도록 코딩한다.


		int res;
		switch(op) {
		case "+":
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			break;

		case "-":
			System.out.println(n1 + " - " + n2 + " = " + (n1-n2));
			break;

		case "*":
			System.out.println(n1 + " x " + n2 + " = " + (n1*n2));
			break;

		case "/":
			System.out.println(n1 + " / " + n2 + " = " + (n1/n2));
			break;

		case "%":
			System.out.println(n1 + " % " + n2 + " = " + (n1%n2));
			break;

		default:
			System.out.println("올바른 연산자를 입력하세요.");
			break;
		}




		} // main


}
