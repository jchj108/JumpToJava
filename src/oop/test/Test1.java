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

// vartest의 a와
// main에서 생성한 a는 서로 다른 변수

//즉 메소드에서 쓰이는 변수는 메소드 밖의 변수이름들과는 전혀 상관 없다. 
//그래서 이렇게 메소드 내에서만 쓰이는 변수를 로컬 변수(local variable)라고도 말한다.

//※ 만약 vartest의 입력값이 int 자료형이 아닌 객체였다면 얘기가 다르다. 객체를 메소드의 입력으로 넘기고 메소드가 객체의 속성값(객체변수 값)을 변경한다면 메소드 수행 이후에도 객체는 변경된 속성값을 유지한다. 이러한 차이가 나는 이유는 메소드에 전달하는 입력 자료형의 형태 때문인데 메소드에 값을 전달하느냐 아니면 객체를 전달하느냐에 따라 차이가 난다.