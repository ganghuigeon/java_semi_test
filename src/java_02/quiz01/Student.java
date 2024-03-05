package java_02.quiz01;

public class Student {
    String name = "김철수r"; //학생 이름
    int ban = 1; //반
    int no = 10; //번호
    int kor = 90; //국어점수
    int eng = 70; //영어점수
    int math = 85; //수학점

    void getTotal(int sum) {
        sum = kor + eng + math;
    }

    void getAverage(double aver) {
        aver = (double) (kor + eng + math) / 3;
    }

}
