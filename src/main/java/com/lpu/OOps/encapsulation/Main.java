package com.lpu.OOps.encapsulation;

public class Main {
    public static void main(String[] args) {

        // -------- Student Example --------
        Student st1 = new Student(3, "John");

        // Access using getters (ENCAPSULATION)
        System.out.println(st1.getName());
        System.out.println(st1.getRoll());

        // ❌ Direct access removed (breaks encapsulation)
        // st1.name = "Donkey";
        // System.out.println(st1.name);
        // System.out.println(st1.getNmae());

        // ✅ Modify using setters
        st1.setName("Donkey");
        st1.setRoll(99);

        System.out.println(st1.info());

        // -------- Employee Example --------
        Employee emp1 = new Employee(
                "Jane",
                1,
                "LPU Infotech",
                true,
                30000,
                78987456623L
        );

        System.out.println(emp1.info());

        // Using default constructor
        Employee emp2 = new Employee();
        emp2.setEmpID(43);
        emp2.setCompanyName("LPU Infotech");
        System.out.println(emp2.getEmpID());
        System.out.println(emp2.info());
    }
}
