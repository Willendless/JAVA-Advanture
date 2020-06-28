/**
 * @Author: Willendless
 * @Date: 2020-06-27
 * @Description: Do not edit
 * @LastEditTime: 2020-06-27
 * @FilePath: \ds\code\ch1\Stack.java
 */
package ds.code.ch1;

import java.util.Iterator;
import java.util.Scanner;

public class Stack<Item> implements Iterable<Item> {

    Node head;
    int N;

    private class Node {
        Item item;
        Node next;

        Node(Item item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
    
    public boolean isEmpty() {
        return N == 0;
    }

    public void push(Item item) {
        head = new Node(item, head);
        N++;
    }

    public Item pop() {
        if (head == null)
            return null;
        Item ret = head.item;
        head = head.next;
        N--;
        return ret;
    }

    @Override
    public Iterator<Item> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<Item> {

        Node cur = head;

        @Override
        public boolean hasNext() {
            return cur != null;
        }

        @Override
        public Item next() {
            Item ret = cur.item;
            cur = cur.next;
            return ret;
        }

    }

    public static void main(String[] args) {
        Stack<Double> vals = new Stack<>();
        Stack<String> ops = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("> input expression: ");
        while (sc.hasNextLine()) {
            Scanner s = new Scanner(sc.nextLine());
            String i;
            while(s.hasNext()) {
                switch (i = s.next()) {
                    case "+": ops.push("+"); break;
                    case "-": ops.push("-"); break;
                    case "*": ops.push("*"); break;
                    case "/": ops.push("/"); break;
                    case "(": break;
                    case ")": {
                        String op = ops.pop();
                        switch(op) {
                            case "+": vals.push(vals.pop() + vals.pop()); break;
                            case "-": {
                                Double a = vals.pop();
                                vals.push(vals.pop() - a); break;
                            }
                            case "*": vals.push(vals.pop() * vals.pop()); break;
                            case "/": {
                                Double a = vals.pop();
                                vals.push(vals.pop() / a); break;
                            }
                        }
                        break;
                    }
                    default: vals.push(Double.parseDouble(i));
                }
            }
            s.close();
            System.out.println("> result: " + vals.pop());
            System.out.print("> input expression: ");
        }
        sc.close();
    }
    
}
