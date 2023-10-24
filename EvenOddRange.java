public class EvenOddRange {
    public static void printEvenNumbers(int start, int end) {
        System.out.println("Even numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void printOddNumbers(int start, int end) {
        System.out.println("Odd numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int start = 1;
        int end = 100;

        printEvenNumbers(start, end);
        printOddNumbers(start, end);
    }
}
