package oop;

public class Nick {

	public static void main(String[] args) {
		
		say_nick("hi");
		say_nick("fool");
	}
	
	public static void say_nick(String nick) {
	    if ("fool".equals(nick)) {
	        return;
	    }
	    System.out.println("���� ������ "+nick+" �Դϴ�.");
	}

}
