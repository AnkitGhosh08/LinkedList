package com.codinclub;

public class LinkedListMain {
        Node head;

        /**
         * Main method for LinkedList
         * We are calling the methods in the main function
         */
        public static void main(String[] args) {

                LinkedListServices list = new LinkedListServices();

                list.add(56);
                list.add(30);
                list.add(40);
                list.add(70);

                list.printList();

                list.deleteNode(40);
                list.printList();
                list.size();
                list.sortList();
                list.printList();
        }
}

