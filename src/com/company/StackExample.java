package com.company;

import java.util.*;
public class StackExample{
    public static void main(String[] args){
        Stack<String>stack = new Stack<String>();
        stack.push("Marvin");
        stack.push("");
        stack.push("Sandra");

        System.out.println("Members of stack" + stack);
        boolean checkstackempty=stack.empty();
        System.out.println("Check stack if empty" + checkstackempty);

        int position = stack.search("Marvin");
        System.out.println("Marvin's position in the stack is:" + position);

        String popelement = stack.pop();
        System.out.println(popelement + "Removed from stack");

        String peekstack = stack.peek();
        System.out.println(peekstack + "is at the top of the stack");

    }
}
















