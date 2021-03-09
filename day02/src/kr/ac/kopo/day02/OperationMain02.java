package kr.ac.kopo.day02;


//ctrl + shift + c 자동

//nextint 정수

//next 문자열 .. nextLine 문자열 개행 제거


import java.util.Scanner;

public class OperationMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int msg;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("정수를 입력하세요 : ");
		
		msg = sc.nextInt();
		
		/*
		System.out.printf("%d의 홀짝 여부 : ", msg);
		
		if(msg == 0) System.out.println("0");
		
		else if (msg % 2 == 0) System.out.println("짝수");
		
		else System.out.println("홀수");
		
		*/
		
		boolean result = (msg > 0 && msg % 2 == 0);
		System.out.println(msg + "의 짝수 유무 : " + result);
		
		sc.close();
	}

}