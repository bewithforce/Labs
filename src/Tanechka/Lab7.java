package Tanechka;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        String vowels = "аяоёэеуюиы";
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        List<String> words = new LinkedList<>();
        for (String word : array) {
            CharSequence first_char = Character.toString(word.toLowerCase().charAt(0));
            if (vowels.contains(first_char)) {
                words.add(word);
            }
        }
        words.sort((word1, word2) -> {
            char a1 = 'а';
            for (char c1 : word1.toLowerCase().toCharArray()) {
                CharSequence first_char = Character.toString(c1);
                if (!vowels.contains(first_char)) {
                    a1 = c1;
                    break;
                }
            }
            char a2 = 'а';
            for (char c2 : word2.toLowerCase().toCharArray()) {
                CharSequence first_char = Character.toString(c2);
                if (!vowels.contains(first_char)) {
                    a2 = c2;
                    break;
                }
            }
            if(a1 > a2){
                return 1;
            } else if (a1 == a2){
                return 0;
            }
            return -1;
        });
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}

