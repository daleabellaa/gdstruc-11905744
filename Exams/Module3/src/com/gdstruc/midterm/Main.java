package com.gdstruc.midterm;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayStack stack = new ArrayStack(5);

        stack.push(new Player(1, "aceu", 100 ));
        stack.push(new Player(2, "Sinatraa", 100 ));
        stack.push(new Player(3, "Subroza", 95 ));
        stack.push(new Player(4, "ploo", 90 ));

        stack.printStack();
    }
}
