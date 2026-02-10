package com.lpu.deep.edge.cases;

public class IntegerObject {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);
        //range of integer matters 128 to 127....
        Integer x = 200;
        Integer y = 200;
        System.out.println(x == y);
        System.out.println(x.equals(y));

        Double d1 = 1.0;
        Double d2 = 1.0;
        System.out.println(d1 == d2);//double obj are not possible because cashing is not allowed it dont compare values
        System.out.println(d1.equals(d2));

        System.out.println(Boolean.TRUE == Boolean.FALSE);


    }
}
