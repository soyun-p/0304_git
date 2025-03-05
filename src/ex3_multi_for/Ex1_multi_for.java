package ex3_multi_for;

public class Ex1_multi_for {
	public static void main(String[] args) {
		
		// 다중 for문 : for문 안에 for문이 있는 경우
		
		// 1  1  1  1  1
		// 2  2  2  2  2
		// 3  3  3  3  3
		
		for(int i = 1; i <= 3; i++) { // y축(행)으로 몇 칸.	
			
			for(int j = 1; j <= 6; j++) { // x축(열)으로 몇 칸.
				
				System.out.print(i + " ");  // i(1, 2, 3)를 j(6번)의 범위만큼 옆으로 한칸 씩(" ") 띄어서 출력.
				
			} // inner
			
			// inner for문을 다 수행하고 나면 inner for문을 나와서 줄바꿈을 실행한다. 
			
			System.out.println(); // 줄바꿈. 이후 다시 outer for문으로 돌아가서 outer for문의 +1된 i의 값으로 다시 inner for문을 수행한다.
			
		} // outer
		
		
		// 먼저 outer for문의 초기식, 조건식을 확인하고 {} 안으로 들어간 후 안에 있는 inner for문의 초기식과 조건식을 확인한다. 
		// 이후 inner for문의 초기식, 조건식이 참이면, inner for문을 j의 범위까지 전부 반복해서 실행한다.
		// 전부 실행했다면, inner for문을 나온 후 outer for문의 실행문을 실행한다.
		// 그리고 다시 outer for문의 i에서 +1된 값으로 위와 같은 과정을 한 번 더 거치고, 이를 i의 범위까지 반복한다.
		
		System.out.println("---------------------");
	
		
		
	} // main

}
