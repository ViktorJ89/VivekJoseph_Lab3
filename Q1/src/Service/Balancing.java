package Service;

import java.util.ArrayDeque;
import java.util.Deque;

public class Balancing {
    public static boolean balancebracket(String brack) {
        Deque<Character> stack = new ArrayDeque<Character>();
        for (int i = 0; i < brack.length(); i++) {
            char ch = brack.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
                continue;
            }
            if (stack.isEmpty())
                return false;

            switch (ch) {
                case ')':
                    stack.pop();
                    break;
                case ']':
                    stack.pop();
                    break;
                case '}':
                    stack.pop();
                    break;
            }
        }
        return (stack.isEmpty());
    }
}

