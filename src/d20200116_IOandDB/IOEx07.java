package d20200116_IOandDB;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 자료형 단위로 데이터를 IO 할 수 있음

public class IOEx07 {
	public static void main(String[] args) throws IOException {
		// ex) primitive.dat
		
		File f = new File("C:\\Users\\goott7-15\\IOTest\\primitive.txt");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		FileInputStream fis = new FileInputStream(f);
		
		// 각 자료형 단위로 data를 저장
		DataOutputStream dos = new DataOutputStream(fos);
		
		// 각 자료형별로 데이터를 생성 ex) 게임 캐릭터
		dos.writeUTF("홍길동");
		dos.writeInt(20);
		dos.writeDouble(178.5);
		dos.writeBoolean(false);
		
		// 각 자료형으로 데이터를 읽어들이기
		DataInputStream dis = new DataInputStream(fis);
		
		// 읽어오기 수행 : 생성한 자료 순서대로 읽어오기
		String name = dis.readUTF();
		int age = dis.readInt();
		double height = dis.readDouble();
		boolean isChange = dis.readBoolean();
		
		System.out.println("캐릭터명 : " + name);
		System.out.println("캐릭터 나이 : " + age);
		System.out.println("캐릭터 키 : " + height);
		System.out.println("캐릭터 전직 여부 : " + isChange); 
		
		
		
	}

}
