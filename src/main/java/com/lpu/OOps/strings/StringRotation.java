package com.lpu.OOps.strings;

public class StringRotation {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "pplea";
//        String check = "";
//        for(int i = 0 ; i < s1.length(); i++){
//            char c = s1.charAt(i);

        String rotated = s1;
        boolean isRotation = false;

        for (int i = 0; i < s1.length(); i++) {
            rotated = rotated.substring(1) + rotated.charAt(0);
            if (rotated.equals(s2)) {
                isRotation = true;
                break;
            }
        }
        System.out.println(isRotation);
    }}

//
//        String s3 = s2 + s2;
//        System.out.println(s3);
//        System.out.println(s3.contains(s1));
//        //constins is a function
//
//        String sql2 = """
//                SELECT = FROM users
//                WHERE id  = 10
//                AND status = 'ACTIVE
//                """;
//    }
//}


