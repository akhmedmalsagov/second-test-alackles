package cmsc150.problemset2a.q2;

public class Counter {

    public static void main(String[] args) {

        int x = 20;
        int y = 30;
		
        for (int i = 20; i < 30; i++) {
            if (i != y) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i + ". ");
            }
        }
    }
}
