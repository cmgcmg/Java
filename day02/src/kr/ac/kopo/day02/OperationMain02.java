package kr.ac.kopo.day02;


//ctrl + shift + c �ڵ�

//nextint ����

//next ���ڿ� .. nextLine ���ڿ� ���� ����


import java.util.Scanner;

public class OperationMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int msg;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("������ �Է��ϼ��� : ");
		
		msg = sc.nextInt();
		
		/*
		System.out.printf("%d�� Ȧ¦ ���� : ", msg);
		
		if(msg == 0) System.out.println("0");
		
		else if (msg % 2 == 0) System.out.println("¦��");
		
		else System.out.println("Ȧ��");
		
		*/
		
		boolean result = (msg > 0 && msg % 2 == 0);
		System.out.println(msg + "�� ¦�� ���� : " + result);
		
		sc.close();
	}

}