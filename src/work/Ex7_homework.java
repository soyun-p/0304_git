package work;

import java.util.Scanner;

public class Ex7_homework {
	public static void main(String[] args) {
		// single for문 사용
		// 피보나치 수열 만들기
		// 1  +  1   2   3  5  8  13  21 .... 
		
		// 반복횟수 : 6  -> 1 1 2 3 5 8 까지 출력
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반복횟수 : ");
		int num = sc.nextInt();
		
		int res = 0;
		int sum = 1;		
		
		for(int i = 1; i <= num; i++) {
			
			res = sum += i;  // sum = 1
			System.out.print(sum + " ");
			
					
			
			
			
		} //for
		
		
		
		
		
		
	} // main

}
