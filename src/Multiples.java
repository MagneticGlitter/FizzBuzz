public class Multiples {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i < 1001; i++) {
            n = i%3 == 0 || i%5 == 0 ? n + 1 : n;
        }
        System.out.println(n);
    }
}
