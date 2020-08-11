public class Starpattern2 {
    public static void main(String[] args) {
        int NumberOfVerticalLines = 5;
        int NumberOfHorizontalLines = 5;
        for (int i = 1; i <= NumberOfHorizontalLines; i++) {
            for (int j = 1; j<=i * 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}