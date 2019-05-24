package Varya;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        Scanner scanner;
        Scanner sc = new Scanner(System.in);
        System.out.println("input begin symbols");
        String begin = sc.nextLine();
        System.out.println("input end symbols");
        String end = sc.nextLine();
        try {
            scanner = new Scanner(new File("text.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            return;
        }
        while (scanner.hasNextLine()) {
            String[] words = scanner.nextLine().split(" ");
            int max = 0;
            int index = -1;
            for (int i = 0; i < words.length; i++) {
                if (words[i].startsWith(begin) && words[i].endsWith(end) && words[i].length() > max) {
                    max = words[i].length();
                    index = i;
                }
            }
            if (index != -1) {
                StringBuilder line = new StringBuilder();
                for (int i = 0; i < words.length; i++) {
                    if (i != index)
                        line.append(words[i]);
                    line.append(" ");
                }
                System.out.println(line);
            }
        }
    }
}

