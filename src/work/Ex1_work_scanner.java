package work;

import java.util.Scanner;

public class Ex1_work_scanner {
	public static void main(String[] args) {
		
		// 키보드에서 말을 입력받는다.
		// 입력받은 월이 몇일까지 있는지를 출력
		
		// 입력 : 5
		// 5월은 31일까지 있습니다.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		int month = sc.nextInt();
		
		int day;
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
			
		case 2:
			System.out.println(month + "월은 28일까지 있습니다.");
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 30까지 있습니다.");
			break;
			
		default:
			System.out.println("올바른 값을 입력해주세요.");
			System.out.println("재입력 : ");
			
			break;
		}
		
		
		
		
	} // main

}
