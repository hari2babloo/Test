  public boolean isParenthesisMatch(String str) {
        if (str.charAt(0) == '{') {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();

        char c;
        for(int i=0; i < str.length(); i++) {
            c = str.charAt(i);

            if(c == '(')
                stack.push(c);
            else if(c == '{')
                stack.push(c);
            else if(c == ')')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            else if(c == '}')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '{')
                    stack.pop();
                else
                    return false;
        }

        Log.e("stack", String.valueOf(stack));
        if (stack.empty()){

            Toast.makeText(Test.this, "True", Toast.LENGTH_SHORT).show();
            Log.e("stack", "true");

        }
        else {


            Toast.makeText(Test.this, "False", Toast.LENGTH_SHORT).show();

            Log.e("stack", "false");
        }
        return stack.empty();
    }


