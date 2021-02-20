package oop;

public class Animal {

		String name; // 객체 변수, 또는 인스턴스 변수, 멤버 변수, 속성이라 명명
		
		public void setName(String name) {
			this.name = name;
		}
		public int sum(int a, int b) {
			return a+b;
		}
		
		public static void main(String[] args) {
			Animal cat = new Animal();
			cat.setName("mew");
			
			Animal dog = new Animal();
			dog.setName("happy");
			
			// 객체 변수는 공유되지 않는다
			
			System.out.println(cat.name);
			System.out.println(dog.name);
			
		}
	
}


	
