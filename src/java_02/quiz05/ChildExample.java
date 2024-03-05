package java_02.quiz05;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
 /*
 parent.field2 = "data2"; //(불가능)
 parent.method3(); //(불가능)


상위 클래스인 Parent에서 method1,method2를 선언하였고
자식 클래스에서 method2만 오버라이드를 함

부모 불러와서 선언하여도 자식 클래스에서 오버라이드된 부분이 출력이 이루어지게 됨

반대로 자식클래스에서 선언된 field2와 method3가 출력되지 않은 이유는 부모 클래스에서
선언되지 않았고, 그로인해 오버라이드가 불가능했기 때문

  */
    }
}