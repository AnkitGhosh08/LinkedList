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
                 * Here we are calling the add method to add node
                 * We used addFirst method
                 *  Node with data 70 is First Created
                 *  Next 30 is added to 70
                 *  Finally 56 is added to 30
                 *  LinkedList Sequence: 56->30->70
                 */
                list.push(70);
                list.push(30);
                list.push(56);
                list.printList();

        }
}


