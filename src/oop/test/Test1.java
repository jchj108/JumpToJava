package oop.test;

public class Test1 {

	static class Test {
	    public void vartest(int a) {
	        a++;
	    }

	    public static void main(String[] args) {
	        int a = 1;
	        Test myTest = new Test();
	        myTest.vartest(a);
	        System.out.println(a);
	    }
	}
}

// vartest�� a��
// main���� ������ a�� ���� �ٸ� ����

//�� �޼ҵ忡�� ���̴� ������ �޼ҵ� ���� �����̸������ ���� ��� ����. 
//�׷��� �̷��� �޼ҵ� �������� ���̴� ������ ���� ����(local variable)��� ���Ѵ�.

//�� ���� vartest�� �Է°��� int �ڷ����� �ƴ� ��ü���ٸ� ��Ⱑ �ٸ���. ��ü�� �޼ҵ��� �Է����� �ѱ�� �޼ҵ尡 ��ü�� �Ӽ���(��ü���� ��)�� �����Ѵٸ� �޼ҵ� ���� ���Ŀ��� ��ü�� ����� �Ӽ����� �����Ѵ�. �̷��� ���̰� ���� ������ �޼ҵ忡 �����ϴ� �Է� �ڷ����� ���� �����ε� �޼ҵ忡 ���� �����ϴ��� �ƴϸ� ��ü�� �����ϴ��Ŀ� ���� ���̰� ����.