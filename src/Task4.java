import java.util.Stack;

public class Task4 {
    public static void main(String[] args) {
        String s = "{{()}";
        System.out.println(isValid(s));
    }
        public static boolean isValid (String s) {
        Stack<Character> ans = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
                ans.push(s.charAt(i));
            } else if(!ans.isEmpty() && s.charAt(i)==']' && ans.peek()=='['){

                ans.pop();

            }
            else if(!ans.isEmpty() && s.charAt(i)=='}' && ans.peek()=='{'){

                ans.pop();

            } else if(!ans.isEmpty() && s.charAt(i)==')' && ans.peek()=='('){

                ans.pop();

            }
            else {
                ans.push(s.charAt(i));
            }
        }
        if(ans.isEmpty()){
            return true;
        }
        return false;
    }
}

