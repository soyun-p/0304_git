package work;

import java.util.Scanner;

public class Ex5_work_for3 {
	public static void main(String[] args) {
		
		// 스캐너를 통해 정수 n을 입력받는다. 1부터 입력받은 n까지의 합 계산하여 출력.
		
		// 입력 : 5
		// 결과 : 15
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		int n = sc.nextInt();
		
		int sum = 0; // 1부터 n까지 입력받은 숫자들의 합을 저장할 공간을 초기화해준다.
		
		for(int i = 1; i <= n; i++) {
			
			sum += i;  // 초기화된 sum에 1부터 n만큼 반복해서 더하고 다시 sum에 대입.
			
		} // for : 1부터 n을 모두 더하는 계산식
		
		System.out.println("결과 : " + sum);
		
		

		
		
	} // main

}
