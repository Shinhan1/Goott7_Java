package d20200114_SwingThread;

// OOP가 제공한느 4가지
// 캡슐화, 상속, 추상화, 다형성
// 다형성(메소드 오버라이딩)

// VO(Value Object), JavaBean
// DTO(Data Transfer Object)
// POJO(Plain Old Java Object)

public class ATM_T {
	// 계좌정보, 총액, 입출금액
	private String account;
	private int balance;
	private int money;
	
	// 생성자
	public ATM_T() {
		// TODO Auto-generated constructor stub
		this.account = "A0001";
		this.balance = 1000;
		
	}

	// 생성자 오버로딩
	public ATM_T(String account, int balence) {
		super();
		this.account = account;
		this.balance = balence;
	}

	// getter, setter
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalence() {
		return balance;
	}

	public void setBalence(int balence) {
		this.balance = balence;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	// 입금 : deposit()
	public synchronized void deposit(int money) {
		balance += money;
		System.out.println(money + "원이 입금되었습니다.");
		System.out.println("현재 잔액은 " + balance + "원 입니다.");
		notifyAll();
		
	}
	
	// 출금 : withDraw()
	public synchronized void withDraw(int money) {
		if(balance >= money) {
			balance -= money;
			System.out.println(money + "원 출금되었습니다.");
			System.out.println("현재 잔액은 " + balance + "원 입니다.");
		
		}else
			System.out.println("잔액이 부족합니다.");

	}

}
