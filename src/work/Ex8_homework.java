package work;

import java.util.Scanner;

public class Ex8_homework {
	public static void main(String[] args) {

		// if문 사용

		// 키보드에서 연도를 입력받고, 해당 연도가 윤년인지 판단.

		// 조건1 : 4로 나누어 떨어지지만, 100으로는 나누어지지 않는 연도
		// 조건2 : 400으로 나누어 떨어지는 연도

		// 연도 : 200
		// 2000년은 윤년입니다.

		// 연도 : 2025
		// 2025년은 평년입니다.

		
		Scanner sc = new Scanner(System.in);

		System.out.print("연도 : ");
		int year = sc.nextInt();

		if( year % 400 == 0 ) {
			if(year % 4 == 0  && year % 100 == 0) {
				System.out.println(year + "년은 윤년입니다.");
			}
		
		} else {
			System.out.println(year + "년은 평년입니다.");
		}
		
		
		/* 선생님 풀이
		
		if(year % 4 == 0 && year != 0 || year % 400 == 0) {
			System.out.println(year + "윤년입니다.");
		}else {
			System.out.println(year + "평년입니다.");
		}                                                        */


     } // main

}
