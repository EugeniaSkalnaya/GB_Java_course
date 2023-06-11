package Homework02;

public class polindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abccba"));
    }

        private static boolean isPalindrome (String word){
            int length = word.length();
            for (int i = 0; i < (length / 2); i++) {
                if (word.charAt(i) != word.charAt(length - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }
