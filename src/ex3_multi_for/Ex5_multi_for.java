package ex3_multi_for;

public class Ex5_multi_for {
	
	public static void main(String[] args) {
		
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		
		
		
		for(int i = 0; i < 5; i++) {  // i = 1, j < i 로 범위 지정해도 가능.
			
			for(int j = 0; j <= i; j++) {	// j의 범위가 꼭 숫자로만 표기할 필요는 없다.			
				
				// *을 1개씩 늘여가며 출력해야 하므로 inner for문은 outer for문의 수와 같게 돌아야 한다.
				// 그러나 j의 범위를 숫자로 지정해버리면 5x5 줄로 출력되어버린다.
				// 따라서 j의 범위를 i와 같게 하면 출력되는 *의 숫자도 i와 함께 1개씩 늘어난다.
				System.out.print("* ");
				
			} //inner
			
			System.out.println();
			
		} // outer
		
		
		
		
		
	} // main

}
