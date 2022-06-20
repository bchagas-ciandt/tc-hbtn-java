public class Caractere {
    public static boolean EhMaiusculo(char c) {
        char[] caracteres = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'Y', 'Z'};
        for (int i=0; i< caracteres.length; i++) {
            if (caracteres[i] == c) {
                return true;
            }
        }
        return false;
    }
}
