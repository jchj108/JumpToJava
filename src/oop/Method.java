package oop;

public class Method {

	public int sum(int a, int b) { // 입출력 모두 있다
		return a+b;
	}
	
	public String say() { // 입력값이 없고 출력만 있다
		return "Hi";
	}

	public void su(int a, int b) { // 리턴(출력)값이 없다
		System.out.println(a+"과 "+b+"의 합은 "+(a+b)+"입니다.");
	}
	public void say2() { // 입출력 모두 없다
	    System.out.println("Hi");
	}
	public void say_nick(String nick) {
	    if ("fool".equals(nick)) {
	        return;
	    }
	    System.out.println("나의 별명은 "+nick+" 입니다.");
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
