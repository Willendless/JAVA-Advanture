/**
 * @Author: Willendless
 * @Date: 2020-06-27
 * @Description: Do not edit
 * @LastEditTime: 2020-06-27
 * @FilePath: \ds\code\ch1\Queue.java
 */
package ds.code.ch1;

import java.util.Iterator;
import java.util.Scanner;

public class Queue<Item> implements Iterable<Item> {

    Node head, tail;
    int N;

    public Queue(){
        tail = new Node(null, null);
        head = new Node(null, tail);
    }

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

    public void enqueue(Item item) {
        tail.item = item;
        tail.next = new Node(item, null);
        tail = tail.next;
        N++;
    }

    public Item dequeue() {
        if (N == 0)
            return null;
        Item ret = head.next.item;
        head.next = head.next.next;
        N--;
        return ret;
    }

    public class QueueIterator implements Iterator<Item> {
        private Node cur = head.next;

        @Override
        public boolean hasNext() {
            return cur != tail;
        }

        @Override
        public Item next() {
            Item ret = cur.item;
            cur = cur.next;
            return ret;
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return new QueueIterator();
    }

    public static void main(String[] args) {
        // 1: enqueue 2: dequeue 3: iterate
        Queue<String> q = new Queue<>(); 
        Scanner s = new Scanner(System.in);
        System.out.print("> ");
        while (s.hasNextLine()) {
            Scanner sc = new Scanner(s.nextLine());
            while (sc.hasNext()) {
                switch (sc.nextInt()) {
                    case 1: q.enqueue(sc.next()); break;
                    case 2: q.dequeue(); break;
                    default: {
                        for (String k : q) {
                            System.out.print(k + " ");
                        }
                        System.out.println();
                    }
                }
            }
            sc.close();
            System.out.print("> ");
        }
        s.close();
    }
    
}
