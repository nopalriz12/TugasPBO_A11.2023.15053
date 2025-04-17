//Naufal Rizky Saputra
package week6;

import java.util.ArrayList;

public class TextGame {
    protected ArrayList<Character> characters = new ArrayList<>();

    public void inputText(String text) {
        characters.clear();
        for (char c : text.toCharArray()) {
            characters.add(Character.toUpperCase(c));
        }
    }

    // Overload 1 - String
    public boolean isPalindrome(String text) {
        inputText(text);
        return isPalindrome();
    }

    // Overload 2 - ArrayList
    public boolean isPalindrome(ArrayList<Character> list) {
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }
        }
        return true;
    }

    // Implementasi default
    public boolean isPalindrome() {
        return isPalindrome(characters);
    }

    // Untuk menampilkan hasil
    public void displayResult(String text) {
        System.out.println("Cek palindrome untuk: " + text);
        boolean result = isPalindrome(text);
        System.out.println(result ? "Ini palindrome." : "Bukan palindrome.");
    }
}

