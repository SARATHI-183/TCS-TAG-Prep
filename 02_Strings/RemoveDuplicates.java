import java.util.*;

// Given a string, remove the duplicate characters and return the new string.

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Set<Character> set = new LinkedHashSet<>();

        for(char ch : str.toCharArray()) {
            set.add(ch);
        }

        StringBuilder result = new StringBuilder();
        for(char ch : set) {
            result.append(ch);
        }

        System.out.println(result.toString());
    }
}