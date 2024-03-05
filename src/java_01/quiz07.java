package java_01;

public class quiz07 {
    public static void main(String[] args) {
        int[] arrays = {90, 87, 50, 65, 20};
        int min = arrays[0];
        for (int i = 0; i < arrays.length; i++) {
            if (min > arrays[i]) {
                min = arrays[i];
            }
        }
        System.out.println("최소값: " + min);
    }
}

