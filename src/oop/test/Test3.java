package oop.test;

public class Test3 {

    int a;  // 객체변수 a

    public void vartest(Test3 test) {
        test.a++;
    }

    public static void main(String[] args) {
        Test3 myTest = new Test3();
        myTest.a = 1;
        myTest.vartest(myTest);
        System.out.println(myTest.a);
    }
}

// test 1 과 달리 값이 증가한다. 