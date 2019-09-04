package com.androidhari.test;



import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Stack;

public class Test extends AppCompatActivity {



    EditText txt,text2;
    TextView revtxt2;

    int arr[] = new int[] { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
    int n = arr.length;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = (EditText)findViewById(R.id.txt);
        text2 = (EditText)findViewById(R.id.txt2);
        revtxt2 = (TextView)findViewById(R.id.revtxt);
        getOddOccurrence(arr, n);

    }

    private int getOddOccurrence(int[] arr, int arr_size) {


        int i;
        int res = 0;
        for (i = 0; i < arr_size; i++) {
            res = res ^ arr[i];
        }

        Log.e("Result", String.valueOf(res));
        return res;


    }





    public void submit(View view){

        isParenthesisMatch(txt.getText().toString());
    }

    public void chnt(View view){

        
        string_reverse(text2.getText().toString());



    }

    private void string_reverse(String revtxt) {




      String  str = text2.getText().toString();

        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--)
        {
            sb.append(str.charAt(i));
        }

        revtxt2.setText(sb.toString());

    }

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


}
