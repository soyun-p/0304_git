package work;

import java.util.Scanner;

public class Ex3_work_for1 {
	public static void main(String[] args) {

		// 1에서 10까지의 숫자 중에서 홀수의 합을 계산하여 출력하라.

		// 결과 : 25

		int sum =0;  // 전역 변수

		for(int i = 1; i <= 10; i++) {			
			if( i % 2 == 1 ) {  // 홀수의 조건 제시
				sum += i;  // 홀수의 합 계산식

			} // if						

		} // for

		// for문 안에서 출력하면 for문에서 지정한 범위만큼 출력도 반복된다. 출력은 한 번만 할 것이기 때문에 for문 밖에서 출력한다.
		System.out.println("결과 : " + sum);  



		System.out.println();



		// 하루에 1원씩 이자가 붙는 예금이 있다. 키보드에서 원금과 예치일수를 입력받고, 예치일이 끝났을 때 나의 원금 출력.

		// 원금 : 1000
		// 예치일 : 5
		// 5일 후의 잔액은 1005원입니다.

		Scanner sc = new Scanner(System.in);

		System.out.println("원금 : ");
		int money = sc.nextInt();

		System.out.println("예치일 : ");
		int day = sc.nextInt();

		for(int i = 0; i < day; i++) {	// <= 으로는 원래 범위의 +1 번 반복하므로 < 를 써줘야 한다.
			money++;  // 원금에서 예치일만큼 1씩 증가.		

		} // for

		System.out.println(day + "일 후의 잔액은 " + money + "원입니다.");




	} // main

}
