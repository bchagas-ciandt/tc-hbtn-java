public class NumerosPares {
    public static void main(String[] args) {
        for (int i=0; i<100; i++) {
            if (i == 98) {
                System.out.println(i);
            } else {
                if (i%2==0) {
                    System.out.printf("%d, ", i);
                }
            }
        }
    }
}
