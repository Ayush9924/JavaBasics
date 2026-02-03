package com.lpu.OOps.MultiLvlInhertance;

    class A {
        int x = 10;
    }

    class B extends A {
        int x = 100;
    }

    class C extends B {
        int x = 1000;

        void test() {
            System.out.println(x);        // 1000
            System.out.println(super.x);  // 100
            System.out.println(this.x);
        }
    }