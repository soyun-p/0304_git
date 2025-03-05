package work;

import java.util.Scanner;

public class Ex7_homework {
	public static void main(String[] args) {
		// single for문 사용
		// 피보나치 수열 만들기
		// 1  +  1   2   3  5  8  13  21 .... 
		
		// 1 1
		
		// 반복횟수 : 6  -> 1 1 2 3 5 8 까지 출력
	
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반복횟수 : ");
		int cnt = sc.nextInt();
		
		// 변수 3개 준비
		int n1 = 1;
		int n2 = 0;
		int n3 = 0;
		
		
		for(int i = 0; i < cnt; i++) { // 0~2까지의 범위
			n2 = n3;
			n3 = n1;
			n1 = n2 + n3;  // 피보나치 수열을 나타내는 식. 꼭 i를 수행문에 사용할 필요는 없다.
			
			// i = 0 -> n2 = n3 = 0, n3 = n1 = 1, n1 = n2+n3 = 1  => n3를 출력하기 때문에 n3값에 주목
			// i = 1 -> n2 = n3 = 1, n3 = n1 = 1, n1 = n2+n3 = 2
			// i = 2 -> n2 = n3 = 1, n3 = n1 = 2, n1 = n2+n3 = 3
			// n3 = (순서대로) 1, 1, 2 출력.
		 	
			 
			System.out.print(n3 + " ");
					
		} //for
		
		
		
		
		
		
	} // main

}
