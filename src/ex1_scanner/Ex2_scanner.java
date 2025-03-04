package ex1_scanner;

import java.util.Scanner;

public class Ex2_scanner {
	public static void main(String[] args) {
		
		// 스캐너를 이용하여 키보에서 입력받은 값 출력해보자.
		
		// 이름 : park
		// 나이 : 23
		// 내 이름은 park이고, 나이는 23 입니다.
		
		Scanner sc = new Scanner(System.in);  // 키보드 값을 입력받을 수 있는 스캐너 클래스 선언
		
		System.out.println("이름 : ");
	    String name = sc.next();            // 이름 입력받는 코드
	    
	    System.out.println("나이 : ");
	    int age = sc.nextInt();	    	 // 나이 입력받는 코드   
	    
	    System.out.println("내 이름은 " + name + "이고, 나이는 " + age + "입니다.");
	    // 변수 이름은 의미있게 짓는 습관 들이기!
	    
	    
		
	}  // main

}
