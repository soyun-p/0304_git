package ex3_multi_for;

public class Ex6_multi_for {
	public static void main(String[] args) {
		
		// 1 2 3 4 5 6 7 8 9 10
		// 2 3 4 5 6 7 8 9 10 1
		// 3 4 5 6 7 8 9 10 1 2
		//    ..............
		// 10 9 8 7 6 5 4 3 2 1
		
		
		for(int i = 1; i <= 10; i++) {
			
			for(int j = 0; j < 10; j++) {
				int num = i + j;  
				// i값이 증가될 때마다 j값과 더하여서 num 출력. 이때 10이 넘어가는 자리에는 11부터 19까지가 채워져서 출력됨.
				// 이때 아래와 같은 if문을 추가해서 num이 10을 넘어가면, 10을 넘어간 num에 10씩 빼서 출력하는 코드를 넣어준다.
				
				if(num > 10) { // num이 10을 넘으면,
					num -= 10; // num에서 10씩 빼라
				}
				
				System.out.print(num + " "); // num 출력.
				
				
			} // inner
			
			System.out.println();
			
		} // outer
		
	} // main

}
