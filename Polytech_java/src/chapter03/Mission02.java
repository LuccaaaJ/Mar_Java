package chapter03;

import java.util.Random;
import java.util.Scanner;

//user �� com �� �ִ�.
//user�� 1,2,3 - ���� ���� ��
//com �� random �ϰ� ��ǻ�Ͱ� �����Ѵ�.
//1ȸ�� ������ �ϰ� ���� �̰���� ȭ�鿡 ����϶�!
//if ���� switch �߿� �����ؼ� ���α׷� �ۼ�




public class Mission02 {

	public static void main(String[] args) {
		// 1) Math.random() �޼��带 Ȱ���ؼ� ������ ����
		// 1+ Math.random *3(�ִ밪)
		// int com = (int)(Math.random()*3);
				
		// 2) random() Ŭ���� nextint, nextdouble...
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int count = 0;
		final int try_number = 10; // ���
		boolean state = true; // ���°� �������� ����
		
		
		while(true) {
			count ++;
			
			if(count > try_number) break;
			 state = false;
			
			 rand.setSeed(System.currentTimeMillis());
			 System.out.println(System.currentTimeMillis());
			 int com = 1 + rand.nextInt(3);
			
	
			System.out.println("����(1), ����(2), ��(3) >> ");
			int user = scan.nextInt();
			
			if( com ==1) System.out.println("��ǻ�� : ����");
			else if( com ==2) System.out.println("��ǻ�� : ����" );
			else  System.out.println("��ǻ�� : ��");
			
	
			 int result = user -com;
			 
			 if(result == 0)  System.out.println("���º�!");
			 else if( result == -1 || result == 2) System.out.println("��ǻ�� ��!");
			 else {			
				 System.out.println("����� ��!");
			 }
			
			 break;
			 }				
		
			scan.close();
					System.out.println("====================================");
				if(state) System.out.println("����� �¸�");
				else System.out.println("�õ�Ƚ�� ����!!");
	} 
	
	
  }