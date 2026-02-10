package com.lpu.OOps.Abstraction;

public interface InterfaceFirst {
    void call();
}

interface InterfaceSecond {
    void Hang();
}

interface InterfaceFusion extends InterfaceFirst, InterfaceSecond {
    void ring();
}

class ClassA implements InterfaceFusion {


    @Override
    public void ring() {

    }

    @Override
    public void call() {

    }

    @Override
    public void Hang() {

    }
}

abstract class ClassB implements InterfaceFusion{
    void text(){

    }
}
class ClassC extends ClassB{
    public void ring(){

    }

    @Override
    public void call() {

    }

    @Override
    public void Hang() {

    }
}
//class extends class
//class can implement multiple interfaces,interfaces2
//class extends classes implements inter1,int2

//functional interface
