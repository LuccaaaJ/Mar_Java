package chapter08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BufferedReaderEx {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\\\javaex\\\\phone.txt");
		InputStreamReader is = new InputStreamReader(new FileInputStream(f), "UTF-8");
		BufferedReader reader = new BufferedReader(is);
		String line;
		StringTokenizer st;
		HashMap<String, String> map = new HashMap<String, String>();
		while(!(line = reader.readLine()).equals("q")) {			
			st = new StringTokenizer(line, " ");
			while(st.hasMoreTokens()) {
				map.put(st.nextToken(), st.nextToken());
			}			
		}
		
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("�̸� >> ");
			String name = s.next();
			if(name.equals("�׸�")) break;
			System.out.println("��ȭ��ȣ : " + map.get(name));
		}
		System.out.println("��ȭ��ȣ �˻��� �����մϴ�...");
	}
}