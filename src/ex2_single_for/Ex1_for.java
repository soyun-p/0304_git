package ex2_single_for;

public class Ex1_for {

	public static void main(String[] args) {

		// single for문: 단일 for문


		// for문 : 특정 명령을 원하는 만큼 반복적으로 수행하기 위해 사용하는 반복문.
		/* for문 기본식
		 for(초기식; 조건식; 증감식){
		    조건식이 참일 때 실행되는 영역		 
		 }		 		  
		 */

		int number = 5;  // 전역 변수

		// 전역 변수 : 전체 영역에서 사용할 수 있는 변수. main에서 선언.
		// 지역변수 i는 현재 for문을 벗어나서 사용할 수 없다. 이는 if문, switch문에서도 마찬가지.

		for( int i = 0; i <= 2; i++ ) {  // 증감식이 없으면, 조건식을 참으로 간주하여 실행한다.
			// number = 10;
			// 지역변수 i는 현재 for문을 벗어나서 사용할 수 없다.
			System.out.println(i);  
			// 증감식은 조건식을 불충족할 때까지 계속 출력. 메모리 부족하면 오류나면서 중단.
			// 무한히 반복하는 코드는 좋은 코드는 아니다.
			// i++;  // 증감식은 꼭 괄호 안에서뿐만 아니라 for문 안에서도 사용 가능하다.
		}

		// j = 11; -> 오류. for문 안에서 선언되었기 때문에 for문 밖에서는 사용할 수 없다.
		// 반면에 for문 바깥에서 선언된 변수들은 for문 안에서도 사용할 수 있다.



		System.out.println("---------------------");



		// 10부터 1까지 감소되는 값을 출력하는 for문을 만드시오.

		for(int i = 10; i >= 1; i--) {
			System.out.println(i);

			// 여기서 i는 위의 for문에도 있지만, 서로 다른 영역 내에서 선언된 지역 변수이기 때문에, 이름이 중복되어도 상관없다.

		} // for



		System.out.println("---------------------");



		// 1부터 100까지 반복하는 for문을 만들되, 3의 배수만 출력

		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}

		} // for		


		System.out.println("---------------------");

		// 또 다른 방법
		for( int i = 3; i <= 100; i += 3 ) { // 초기화를 3으로 하고, 증감식에서 3씩 더하기.
			System.out.println(i);
		} // for 2





	} // main

}
