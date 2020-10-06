package ru.sapteh;

public class Program {
    public static void main(String[] args) {
        String[] arr ={"Dar","Kirill","Hello","Avtomobill"};
        System.out.println(strSort(arr));
        System.out.println(" ");
        String str = "radar";
        System.out.println(isPalindrome(str));
    }
    public static String strSort(String[] arrStr) {
        int maxLengthString = 0;
        String s = "";
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].length() > maxLengthString) {
                maxLengthString = arrStr[i].length();
            }
        }
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].length() == maxLengthString) {
                s = arrStr[i];
            }
        }
        return s;
    }
    public static String reverseString(String b) {
        String a = "";
        for (int i = b.length() - 1; i >= 0; --i)
            a += b.charAt(i);
        return a;
    }

    public static Boolean isPalindrome(String b) {
        if (b.equals(reverseString(b))) {
            System.out.println("Полиндром");
        } else {
            System.out.println("Не полиндром");
        }
        return b.equals(reverseString(b));
    }
}
