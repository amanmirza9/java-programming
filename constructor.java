package com.amanymous;

public class constructor {
    double width;
    double height;
    double depth;
    // This is the constructor .
    constructor(double w, double h, double d) {//isko constructor kehty hain
        width = w;//yahan constructor keyword
        height = h;
        depth = d;
    }
    // compute and return volume
    double volume() {
       return width * height * depth;
    }
}
