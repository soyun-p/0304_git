package ex1_scanner;

import java.util.Scanner;

// ctrl + Shift + o(알파벳) : import.
// Sc 입력 후 ctrl + space : import 된 후 Scanner 클래스까지 나옴.

// 외부에서 가져다 쓰는 클래스에 대해 import해놓는 것은 필수!


public class Ex1_scanner {
	public static void main(String[] args) {
		
		// 키보드에서 값을 입력받을 수 있도록 해 주는 Scanner 클래스
		Scanner sc = new Scanner(System.in); // 
		
		System.out.println("정수 : ");
		int n = sc.nextInt();  // 실제 정수(nextInt이기 때문) 값을 입력받고 엔터 키를 누르기 전까지는 다음 줄로 내려가지 않음.
		
		System.out.println("입력받은 값 : " + n);  // 입력 받은 값을 출력.
		
		System.out.println("문장 : ");
		String s = sc.next();  
		// String 타입(그냥 next로만)의 값을 입력받고 엔터 키를 누르기 전까지는 다음 줄로 내려가지 않음. 
		// next는 숫자도 문자열로 인식하여 출력하지만, 그렇다고 연산까지 입력받아 출력하지는 못한다.
		// 즉, 10 + 10 을 입력해도 최초 등장하는 연산자 앞의 문자열인 10까지밖에 출력하지 못함.
		
		System.out.println("입력받은 문장 : " + s);
		
		
		// nextInt(), nextBoolean() 등이 있음. 그러나 nextInt(), next()를 주로 사용.
		
		
		
		
	} // main

}
