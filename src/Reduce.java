public class Reduce {
    public static void main(String[] args) {
        System.out.println(doReduce(5));
    }

    private static int doReduce(int n) {
        int count = 0;
        while (n != 0) {
            n = n % 2 == 0? n / 2 : n - 1;
            count++;
        }
        return count;
    }
}
