package com.amanymous;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // declare, allocate, and initialize constructor objects
        constructor mybox1 = new constructor(10, 20, 15);//yahn hum ny constructor word ka object create kiya ha mybox1,mybox2
        constructor mybox2 = new constructor(3, 6, 9);
        double vol;
        // get volume of first constructor
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        // get volume of second constructor
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
