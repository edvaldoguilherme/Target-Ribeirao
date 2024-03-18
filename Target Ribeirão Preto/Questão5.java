public class Questão5 {
    public static void main(String[] args) {
        String original = "target";
        String reversa = reverseString(original);
        System.out.println(reversa);
    }

    public static String reverseString(String str) {
        char[] letra = str.toCharArray();
        int comeco = 0;
        int fim = letra.length - 1;

        while (comeco < fim) {
            char temp = letra[comeco];
            letra[comeco] = letra[fim];
            letra[fim] = temp;
            comeco++;
            fim--;
        }

        return new String(letra);
    }

}
