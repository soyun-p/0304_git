package ex3_multi_for;

public class Ex3_multi_for {

	public static void main(String[] args) {

		// *  *  *  *  *
		// 1  2  3  4  5  
		// *  *  *  *  *
		// 1  2  3  4  5
		// *  *  *  *  *

		for(int i = 0; i < 5; i++) { // int i = 1; i <= 5; i++ 도 가능. 다만 if문 조건식을 i % 2 != 0 으로 바꿔줘야 한다.
			
			// i의 시작점이 0인지, 1인지에 따라 if문의 조건식에서도 i가 홀수인지, 짝수인지가 정해진다.

			for(int j = 1; j <= 5; j++) {
				if( i % 2 == 0) {
					System.out.print("* ");
					
				}else{
					System.out.print(j + " ");
				}


			} // inner
			
			System.out.println();


		}// outer
		
		
		
		System.out.println("-------------------");
		
		
		
		// A  B  C  D
		// E  F  G  H
		// I  J  K  L
		
		
		char ch = 'A';	
		
		for(int i = 0; i < 3; i++) {
			
			for(int j = 0; j < 4; j++) {
				
				System.out.print(ch++ + " ");  
				// ++ch 로 하면 연산이 출력보다 먼저 적용되기 때문에 A부터 나오는 것이 아니라, A가 선행 증가한 B부터 나오게 된다.
				// 따라서 출력보다 연산이 늦은 ch++(후행 증가)를 사용한다.
				
				
			} // inner
			
			System.out.println();
			
		} // outer


	} // main

}
