package dev.goo.stack;

public class Solution {
    public static int expressionParser(String expression) {
        Stack<Character> operandStack = new Stack<>(null);
        Stack<Integer> integerStack = new Stack<>(null);

        Integer numItem = null;
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (48 <= c && c <= 57) {
                int num = c - 48;
                numItem = numItem == null ? num : numItem * 10 + num;
                continue;
            } else {
                integerStack.push(numItem);
                numItem = null;
            }

            if (operandStack.peek() != null && compareOperand(operandStack.peek(), c) >= 0) {
                int temp = calculateStack(integerStack, operandStack);
                integerStack.push(temp);
            }
            operandStack.push(c);
        }
        integerStack.push(numItem);
        return calculateStack(integerStack, operandStack);
    }

    public static int compareOperand(char operand, char comparedOperand) {
        if (operand == '+' || operand == '-') {
            return comparedOperand == '+' || comparedOperand == '-' ? 0 : -1;
        } else {
            return comparedOperand == '+' || comparedOperand == '-' ? 1 : 0;
        }
    }

    public static Integer calculateStack(Stack<Integer> integerStack, Stack<Character> operandStack) {
        int calcResult = integerStack.pop();
        while (integerStack.peek() != null && operandStack.peek() != null) {
            calcResult = calculate(integerStack.pop(), calcResult, operandStack.pop());
        }
        return calcResult;
    }

    public static Integer calculate(int num1, int num2, char operand) {
        switch (operand) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            default:
                return null;
        }
    }
}

class Stack<T> {
    public Node<T> head;

    public Stack(Node<T> head) {
        this.head = head;
    }

    public void push(T data) {
        Node<T> newHead = new Node(data);
        newHead.next = this.head;
        this.head = newHead;
    }

    public T pop() {
        if(this.head == null) {
            return null;
        }
        Node<T> temp = this.head;
        this.head = this.head.next;
        return temp.data;
    }

    public T peek() {
        if(this.head == null) {
            return null;
        }
        return this.head.data;
    }
}

class Node<T> {
    public T data;
    public Node next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public void printNode() {
        Node iterator = this;
        while(iterator != null) {
            System.out.println(iterator.data + ",");
            iterator = iterator.next;
        }
    }
}