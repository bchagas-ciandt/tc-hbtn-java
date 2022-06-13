public class PrintStringVariable {
   public static void main(String[] args) {
   String texto = "Holberton School";
   System.out.printf("%1$s\n%1$s\n%2$s\n", texto, texto.substring(0, 9));
   }
 }
