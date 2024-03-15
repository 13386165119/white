import java.util.Stack;

public class BalacedParentheses {

    Stack<Character> stack = new Stack<>();
    
    public void balancedParentheses(String expression){
        for(char bracket: expression.toCharArray()){
            if (bracket == '{' || bracket == '(' || bracket == '[') {
                stack.push(bracket);
            }else if (bracket == '}' || bracket == ')' || bracket == ']'){
                if(stack.isEmpty() || isItBalanced(stack.pop(),bracket)){
                System.out.println("The expression is not balanced");
                return;
                }
            }
        }
        System.out.println("The expression is balanced");
    }

    public Boolean isItBalanced(char open, char close){
        //Boolean isBalanced = false;
        if(open == '{' && close == '}'){
            return  true;
        }else if (open == '(' && close == ')') {
            return true;
        }else if(open == '[' && close == ']'){
            return true;
        }
        return false;
    }
}
