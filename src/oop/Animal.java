package oop;

public class Animal {

		String name; // ��ü ����, �Ǵ� �ν��Ͻ� ����, ��� ����, �Ӽ��̶� ���
		
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
			
			// ��ü ������ �������� �ʴ´�
			
			System.out.println(cat.name);
			System.out.println(dog.name);
			
		}
	
}


	
