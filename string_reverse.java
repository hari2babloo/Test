    private void string_reverse(String revtxt) {


//Get String from the Edittext


      String  str = text2.getText().toString();

        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--)
        {
            sb.append(str.charAt(i));
        }


//binding reversed Text to a Textview


        revtxt2.setText(sb.toString());

    }
