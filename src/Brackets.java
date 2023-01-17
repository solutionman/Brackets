import java.util.*;

public class Brackets {
    public static void main(String[] args) {
        System.out.println("enter brackets:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String result = getBracketsWithDescription(input);
        System.out.println(result);
    }

    static String getBracketsWithDescription(String input) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        Stack<Character> stack = new Stack<>();
        List<Character> result = new ArrayList<>();
        List<Character> buffer = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!brackets.containsKey(c)) {
                stack.push(c);
            } else {
                char top = stack.isEmpty() ? '?' : stack.pop();
                if (top == brackets.get(c)) {
                    counter++;
                    if (stack.isEmpty()) {
                        result.add(top);
                        result.addAll(buffer);
                        result.add(c);
                        buffer = new ArrayList<>();
                    } else {
                        buffer.add(top);
                        buffer.add(c);
                        if (input.length() == i + 1) {
                            result.addAll(buffer);
                        }
                    }

                }
            }
        }
        if (counter == 0) {
            return "0";
        }
        StringBuilder finalString = new StringBuilder(counter * 2 + " - ");
        for (Character c : result) {
            finalString.append(c);
        }
        return finalString.toString();
    }

}
