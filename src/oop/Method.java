package oop;

public class Method {

	public int sum(int a, int b) { // ����� ��� �ִ�
		return a+b;
	}
	
	public String say() { // �Է°��� ���� ��¸� �ִ�
		return "Hi";
	}

	public void su(int a, int b) { // ����(���)���� ����
		System.out.println(a+"�� "+b+"�� ���� "+(a+b)+"�Դϴ�.");
	}
	public void say2() { // ����� ��� ����
	    System.out.println("Hi");
	}
	public void say_nick(String nick) {
	    if ("fool".equals(nick)) {
	        return;
	    }
	    System.out.println("���� ������ "+nick+" �Դϴ�.");
	}
	
	public static void main(String[] args) {
		Method test = new Method();
		System.out.println(test.sum(3, 4));
		String a = test.say();
		System.out.println(a);
		
		test.su(3, 4);
		test.say2();
		test.say_nick("fool ");
	 
	}
}
