package java_01;

public class quiz06 {
    public static void main(String[] args) {
        int[] scores = {83, 90, 87};

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double aver = sum / scores.length;
        System.out.println("합 " + sum + ", 평균: " + aver);
    }
}
