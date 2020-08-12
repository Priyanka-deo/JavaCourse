public class NumericPattern2 {
    public static void main(String[] args) {
        int numOfVerticalLines = 9;
        int numOfHorizontalLines = 5;
        for (int i = 1; i <= numOfHorizontalLines; i++) {
            for (int j = numOfVerticalLines / 2; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k > 1; k--) {
                System.out.print(k);
            }
            System.out.print(1);
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
