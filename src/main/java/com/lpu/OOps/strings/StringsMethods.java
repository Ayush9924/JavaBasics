package com.lpu.OOps.strings;

public class StringsMethods {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "Applee";

        //strings are objects
//        there are 2 ways to create String objects
        //Strings are immutable
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("similar");
        }else{
            System.out.println("not similar");
        }

        String s0 = "";
        String s3 = " Hello Kitty  ";
        System.out.println(s3.length());
        //if we write system.out.print() empty it will give error but if we write it as ln println it will not give error

        String s4 = s3.trim();
        System.out.println(s4);
        //if we use s3.trim() it is in the same object address thats why it is showing the same value of string
        System.out.println(s4.length());

        s3 = "Apple";
        s3.toLowerCase();
        System.out.println(s3);

        s3 = s3.toUpperCase();
        System.out.println(s3);

        s3 = "hello kitty";
        char ch = s3.charAt(4);
        char atLast = s3.charAt(s3.length()-1);
        System.out.println(ch);
        System.out.println(atLast);

        s3 = "apple";
        s3 = s3.concat(" oranges");
        System.out.println(s3);

        s3 += " mango";
        System.out.println(s3);

        int x = 99;
        String s5 = " " + x;
        System.out.println(s5);

        String str = 432 + 44 - 56 + "" + 55 + 10; // half of them is integer and after "" this it will work as integer concat and print it
        System.out.println(str);

        str = "apple is good";
        System.out.println(str.startsWith("ap".toLowerCase()));
        System.out.println(str.toLowerCase().endsWith("od".toLowerCase()));

        str = "applepleppp";
        int index = str.indexOf("Apl");
        System.out.println(index);//it is giving -1 as fasle not found

        int lastIndex = str.lastIndexOf("pp");
        System.out.println(lastIndex);

        str = "apple";
        str = str.substring(2,5);
        System.out.println(str);

        //find palandrome of a string radar
        // find palindrome of a string "radar" with spaces
        String str1 = "raxy";
        String rev = "";
        String clean = "";

// reverse string while skipping spaces
        for (int i = 0; i < str1.length(); i++) {

            if (str1.charAt(i) == ' ') {
                continue;
            }

            clean = clean + str1.charAt(i);
            rev = str1.charAt(i) + rev;
            System.out.println(rev);
        }

        if (clean.equals(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }


    }
}
