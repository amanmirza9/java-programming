package com.amanymous;

public class mywork {
    int stck[] = new int[10];
    int tos;
    // Initialize top-of-stack
    mywork() {
        tos = -1;
    }
    // Push an item onto the stack
    void push(int item) {
        if(tos==9)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }
    // Pop an item from the stack
    int pop() {
        if(tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}


