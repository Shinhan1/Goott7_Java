package d20200116_IOandDB;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// 객체도 저장하고 읽어들일 수 있음
// ex) Member Class를 읽어들이기

public class IOex08 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Member m = 
				new Member("java", "1234", "hong", "yuldoguk", "hwal@bin.dang");
		
		File f = new File("C:\\Users\\goott7-15\\IOTest\\member.dat");
		
		FileOutputStream fos = new FileOutputStream(f);
		
		// 객체로 output
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// 특정 객체를 저장(쓰기)
		oos.writeObject(m);
		
		// 데이터를 읽어오기
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// 객체를 일어오는 메소드
		Object ob = ois.readObject();
		
		Member mb = (Member)ob;
		System.out.println("id : " + mb.getId());
		System.out.println("addrs : " + mb.getAddrs());
		System.out.println("email : " + mb.getEmail());
		System.out.println("name : " + mb.getName());
		System.out.println("pw : " + mb.getPw());
		
		
		
		
		
		
		
	}

}
