package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");

		int inputNumber = scanner.nextInt();

		/* 여기에 구현 코드를 작성 합니다. */
		int result = 0;
		for (int i = 0; i <= inputNumber; i++) {
			if (inputNumber % 2 == 0 && i % 2 == 0) {
					result += i;
			}else if(inputNumber % 2 != 0 && i % 2 != 0){
				result += i;
			}
		}
		System.out.println(result);
		scanner.close();
	}

}
