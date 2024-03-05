package java_02.quiz05;

public class Child extends Parent {

    public static String field2;  {
    }


    public static void method3() {
    System.out.println("Child-method3()");
    }

    @Override
    public void method2() {
        System.out.println("Child-method2()");
    }
}
