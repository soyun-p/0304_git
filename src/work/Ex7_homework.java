package work;

import java.util.Scanner;

public class Ex7_homework {
	public static void main(String[] args) {
		// single for문 사용
		// 피보나치 수열 만들기
		// 1  +  1   2   3  5  8  13  21 .... 
		
		// 1 1
		
		// 반복횟수 : 6  -> 1 1 2 3 5 8 까지 출력
		// a0 = 0
		//a1 : 1
		//a2 : a0 + a1 = 0 + 1 = 1
	    // a3 = a1 + a2 = 1 + 1 =2
		// a4 = a2 + a3 = 2 + 3 = 5
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반복횟수 : ");
		int num = sc.nextInt();
		
		int a0 = 0;
		int a1 = 1;
		int sum = 1;
		
		
		for(int i = 0; i <= num; i++) {
			sum = a0 + a1;
			sum++;
			sum += i;
			 
			System.out.print(sum + " ");
			
					
			
			
			
		} //for
		
		
		
		
		
		
	} // main

}
