package d20200116_IOandDB;

import java.io.Serializable;

// 멤버에 대한 클래스
// 가져다가 쓸 수 있음
// 객체 직렬화 - 보낼 객체를 잘게 쪼개기

public class Member implements Serializable{
	
	private String id, name, addrs, email;
	
	// 직렬화에서 빼서(보호하기 위해서) 보내고 싶을 때
	transient String pw;		// 호출했을 때 null값이 뜸
	
	public Member() {
		super();
	}
	
	/* 생성자 오버로딩 */
	public Member(String id, String pw, String name, String addrs, String email) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.addrs = addrs;
		this.email = email;
			
	}

	/* getter and setter */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
