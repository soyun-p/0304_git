package work;

import java.util.Scanner;

public class Ex6_work_for4 {
	public static void main(String[] args) {
		
		// 수1 : 3
		// 수2 : 5
		// 결과 : 12
		
		// 수1부터 수2 사이의 값들의 합을 출력하라. 큰 수, 작은 수 순서에 상관없이.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수1 : ");
		int n1 = sc.nextInt();
		
		System.out.print("수2 : ");
		int n2 = sc.nextInt();
		
		int res = 0;
		
		// 변수 간의 값 변경 : 임시 변수(n3)필요. 임시 변수는 잠시동안 값을 대입해놓을 공간.
		if(n1 > n2) { // 만약 n1이 n2보다 크면,
			int n3 = n1;  // n1의 값 5를 n3에 대입.
			n1 = n2;      // n2의 값 3을 n1에 대입.
			n2 = n3;      // n3의 값 5를 n2에 대입.
			
		} // if
		
		for(int i = n1; i <= n2; i++) {	
			
			res += i;
		
		}  // for
		
		System.out.println("결과 : " + res);
		
	} // main

}
