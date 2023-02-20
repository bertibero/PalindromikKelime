import java.util.Scanner;

public class Main {
    static boolean isPalindrom(String str){
        int m = 0;
        int n = str.length() - 1;
        while (m < n){
            if(str.charAt(m) != str.charAt(n)){
                return false;
            }
            m++;
            n--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen palindromik olup olmadığını öğrenmek istediğiniz kelimeyi yazınız :");
        String str = scan.next();

        if(isPalindrom(str)) {
            System.out.println(str + " " + "palindromik bir kelimedir.");
        }else {
            System.out.println(str + " " + "palindromik bir kelime değildir.");
        }
    }
}