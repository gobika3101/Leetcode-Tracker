// Last updated: 7/9/2026, 3:10:41 PM
class Solution {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> set = new Stack<>();
        for(char c : ch){
            if(c == '(' || c=='[' || c=='{'){
                set.push(c);
            }else{
                if(set.empty()) return false;
            else if(c==')' && set.peek() == '(') set.pop();
            else if(c==']' && set.peek() == '[') set.pop();
            else if(c=='}' && set.peek() == '{') set.pop();
                else return false;
            }
        }
        return set.empty();
    }
}