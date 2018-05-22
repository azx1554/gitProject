package Xi.LeetCode.OneToFifty;

import java.util.Stack;

/*
20. Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class Problem20 {
    public static boolean isValid(String s) {
        if (s.length() == 0 || s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (judgeParentheses(stack, s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean judgeParentheses(Stack stack, Character c) {
        if (stack.empty()) {
            return false;
        }
        if ((c == ')' && stack.peek().equals('(')) ||
            (c == '}' && stack.peek().equals('{')) ||
            (c == ']' && stack.peek().equals('['))
            ) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "([{}])";
        System.out.println(isValid(s));
    }
}
