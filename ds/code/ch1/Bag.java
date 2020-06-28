/**
 * @Author: Willendless
 * @Date: 2020-06-27
 * @Description: Do not edit
 * @LastEditTime: 2020-06-27
 * @FilePath: \ds\code\ch1\Bag.java
 */
package ds.code.ch1;

import java.util.Iterator;
import java.util.Scanner;

public class Bag<Item> implements Iterable<Item> {

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

    public void add(Item item) {
        head = new Node(item, head);
        N++;
    }

    @Override
    public Iterator<Item> iterator() {
        return new BagIterator();
    }

    private class BagIterator implements Iterator<Item> {

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
        Bag<String> b = new Bag<>(); 
        Scanner s = new Scanner(System.in);
        System.out.print("> ");
        while (s.hasNextLine()) {
            Scanner sc = new Scanner(s.nextLine());
            while (sc.hasNext()) {
                switch (sc.nextInt()) {
                    case 1: b.add(sc.next()); break;
                    default: {
                        for (String k : b) {
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
