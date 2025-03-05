package ex3_multi_for;

public class Ex2_multi_for {
	public static void main(String[] args) {

		for(int i = 0; i < 3; i++) {  // 3행	

			for(int j = 0; j < 2; j++) {  // 2열
				
				System.out.print(j + " ");

			} // inner
			
			System.out.println();


		} // outer
		
		
		
		System.out.println("------------------");
		
		
		// 1  2  3  4
		// 5  6  7  8
		
		int n = 0; 		
		
		for(int i = 0; i < 2; i++) {
			
			for(int j = 0; j < 4; j++) { // i랑 j 헷갈리지 않게 주의
				
				System.out.print(++n + " ");
				

			} // inner
			
			System.out.println();
			
			
		} // outer



	} // main

}
