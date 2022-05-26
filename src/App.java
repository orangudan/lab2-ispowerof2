public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("is power of 2? : " + isPowerOf2(63));
    }

    public static boolean isPowerOf2(double n) {
        if (n == 1) {
            return true;
        }
        if (n < 2) {
            return false;
        }

        return isPowerOf2(n / 2);
    }
}
