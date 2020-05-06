package d20191227_OOP;

public class Medic extends Teran{
	int 치료력, mp;
	
	
	public Medic() {
		super();
		this.치료력 = 2;
		this.mp = 50;
	}
	
	void 치료하기(Teran t) {
		if(this.mp >= 5) {
			t.hp += 치료력;
			this.mp -= 5;
		}
		else System.out.println("mp가 없습니다.");
		if(t.hp >100) t.hp = 100;
		
		System.out.println("치료되었습니다.");
		
	}
	
}
