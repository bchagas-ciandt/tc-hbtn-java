public class Numeros0a99 {
    public static void main(String[] args) {
        for (int i=0; i<100; i++) {
            if (i == 99) {
                System.out.println(i);
            } else {
                System.out.printf("%d, ", i);
            }
        }
    }
}
