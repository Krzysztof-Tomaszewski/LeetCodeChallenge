package implementQueueUsingStacks;
// Link to the problem: https://leetcode.com/problems/implement-queue-using-stacks/description/
// Problem description:
// Implement a first in first out (FIFO) queue using only two stacks.
// The implemented queue should support all the functions of a normal queue (push, pop, peek, and empty).

// Implement the MyQueue class:
//
// MyQueue() Initializes the queue object.
// void push(int x) Pushes element x to the back of the queue.
// int pop() Removes the element from the front of the queue and returns it.
// int peek() Returns the element at the front of the queue.
// boolean empty() Returns true if the queue is empty, false otherwise.
//
// Notes:
// - You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
// - Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque (double-ended queue) as long as you use only a stack's standard operations.

import java.util.Stack;

class MyQueue {

    private final Stack<Integer> inputs;
    private final Stack<Integer> outputs;

    MyQueue() {
        inputs = new Stack<>();
        outputs = new Stack<>();
    }

    void push(int x) {
        inputs.push(x);
    }

    int pop() {
        if (!outputs.empty()) {
            return outputs.pop();
        }
        moveInputsToOutputs();
        return outputs.pop();
    }

    int peek() {
        if (!outputs.empty()) {
            return outputs.peek();
        }
        moveInputsToOutputs();
        return outputs.peek();
    }

    boolean empty() {
        return inputs.empty() && outputs.empty();
    }

    private void moveInputsToOutputs() {
        while (!inputs.empty()) {
            outputs.push(inputs.pop());
        }
    }
}

