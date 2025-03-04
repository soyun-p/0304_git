package work;

import java.util.Scanner;

public class Ex4_work_for2_gugudan {
	public static void main(String[] args) {

		// 키보드에서 숫자를 입력받고, 그에 해당하는 구구단을 출력하라. 단, 2~9사이의 값을 입력받지 않았다면,
		// "구구단 범위의 숫자를 입력하세요" 출력

		// 단 : 10
		// 구구단 범위의 숫자를 입력하세요.

		// 단 : 3
		// 3 x 1 = 3 ... 3 x 9 = 27

		Scanner sc = new Scanner(System.in);

		System.out.print("단 : ");  // println에서 ln만 빼면 강제로 줄 바꿈 없이 입력 가능
		int dan = sc.nextInt();

		if(dan > 2 && dan > 9) {
			System.out.println("구구단 범위의 숫자를 입력하세요"); 
		}  else {
			for(int i = 1; i <= 9; i++) { // i의 범위. 1에서 시작, 9에서 끝. i를 1씩 올려서 연산 수행.
				int res = dan * i;
			    System.out.println(dan + "x" + i + "=" + res);
		} // else  if-else문 이용-> else문 안에 for문 작성.
			

		} // for

	}  // main

}
