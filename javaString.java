import java.util.*;
public class javaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringUtility s = new StringUtility();

        String inputString;
        char continueChoice;

        do {
            System.out.print("Enter a string: ");
            inputString = sc.nextLine();

            System.out.println("**** STRING MENU ****");
            System.out.println("1. Count Vowels");
            System.out.println("2. Count Consonants");
            System.out.println("3. Check Palindrome");
            System.out.println("4. Reverse String");
            System.out.println("5. Convert to Uppercase");
            System.out.println("6. Convert to Lowercase");
            System.out.println("7. Replace a Word");
            System.out.println("8. Exit");
            System.out.println("*");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Number of vowels: " +s.countVowels(inputString));
                    break;
                case 2:
                    System.out.println("Number of consonants: " + s.countConsonants(inputString));
                    break;
                case 3:
                    if (s.isPalindrome(inputString)) {
                        System.out.println("The string is a palindrome.");
                    } else {
                        System.out.println("The string is not a palindrome.");
                    }
                    break;
                case 4:
                    System.out.println("Reversed string: " + s.reverseString(inputString));
                    break;
                case 5:
                    System.out.println("Uppercase: " + s.toUpperCase(inputString));
                    break;
                case 6:
                    System.out.println("Lowercase: " + s.toLowerCase(inputString));
                    break;
                case 7:
                    System.out.print("Enter the word to replace: ");
                    String oldWord = sc.nextLine();
                    System.out.print("Enter the new word: ");
                    String newWord = sc.nextLine();
                    String replaced = s.replaceWord(inputString, oldWord, newWord);
                    System.out.println("Updated string: " + replaced);
                    break;
                case 8:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.print("Do you want to continue? (Y/N): ");
            continueChoice = sc.next().charAt(0);
            sc.nextLine();

        } while (continueChoice == 'Y' || continueChoice == 'y');

        System.out.println("Program terminated.");
        sc.close();
    }
}
class StringUtility {

    public int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch=='A'||ch=='E'|| ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'|| ch=='i'||ch=='o'||ch=='u') {
                count++;
            }
        }
        return count;
    }

    public int countConsonants(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch!='A'||ch!='E'|| ch!='I'||ch!='O'||ch!='U'||ch!='a'||ch!='e'|| ch!='i'||ch!='o'||ch!='u') {
                count++;
            }
        }
        return count;
    }

    public boolean isPalindrome(String str) {
            str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
             return true;
        }
        else
        return false;
    }


    public String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

    public String replaceWord(String str, String oldWord, String newWord) {
        return str.replace(oldWord, newWord);
    }
}