import java.util.*;

public class Brackets {
    public static void main(String[] args) {
        System.out.println("enter brackets:");
        Scanner scanner = new Scanner(System.in);
        String input;// = scanner.nextLine();

//        input = "(()";
//        input = "()(())";
        input = ")()())";
        input = ")(";
        input = "())(()())(()";
        String result = checkBrackets(input);
        System.out.println(result);
    }

    public static String checkBrackets(String input) {
//        String part = input.substring(input.indexOf('('), input.indexOf(')'));

        char[] chars = input.toCharArray();
        int counter = 0;
        int add = 1;
        StringBuilder output = new StringBuilder();
        StringBuilder part = new StringBuilder();
        for (int i = 1; i < chars.length; i = i + add) {
//            if (chars[i - 1] == ')') {
//                continue;
//            }

            if (pair(chars[i - 1], chars[i])) {
                counter++;
                add = 1;
                output.append("()");
            } else {
                int j = i;
                while (chars[j] != ')') {
                    part.append(chars[j]);
                    j++;
                }
                int k = j;
                while (j > i) {
                    part.append(chars[k]);
                    k++;
                    j--;
                }
                add = k - i;
                if(add == 0) add = 1;
                if (isValid(part.toString())) {
                    output.append(part);
                }
            }
        }
        return output.toString();
    }

    public static boolean pair(char left, char right) {
        if (left == '(' && right == ')') {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isValid(String input) {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        Deque<Character> stack = new LinkedList<>();
        for (Character ch : input.toCharArray()) {
            if (brackets.containsValue(ch)) {
                stack.push(ch);
            } else if (brackets.containsKey(ch)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
