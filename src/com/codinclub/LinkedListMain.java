package com.codinclub;

public class LinkedListMain{
        Node head;

        /**
         * Main method for LinkedList
         * We are calling the methods in the main function
         */
        public static void main(String[] args) {

                LinkedListServices list = new LinkedListServices();
                /**
                 * Here we are calling the append method.
                 *  Node with data 70 is First Created
                 *  Next 30 is appended to 70
                 *  Finally 56 is appended to 30
                 *  LinkedList Sequence: 56->30->70
                 */
                list.append(56);
                list.append(30);
                list.append(70);
                list.printList();

        }
}


