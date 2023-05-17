package edu.kis.vh.nursery.list;

/**
 * A linked list implementation for storing integer values.
 */
public class IntLinkedList {

    /**
     * Represents the last node in the linked list.
     */
    Node last;

    /**
     * Represents an empty value indicator.
     */
    public static final int EMPTY = -1;

    /**
     * Adds a new value to the top of the linked list.
     *
     * @param i The value to be added.
     */
    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    /**
     * Checks if the linked list is empty.
     *
     * @return {@code true} if the linked list is empty, {@code false} otherwise.
     */
    public boolean isEmpty() {
        return last == null;
    }

    /**
     * Checks if the linked list is full.
     *
     * @return Always returns {@code false} as linked list can't be full.
     */
    public boolean isFull() {
        return false;
    }

    /**
     * Retrieves the value at the top of the linked list.
     *
     * @return The value at the top of the linked list, or {@link #EMPTY} if the linked list is empty.
     */
    public int top() {
        if (isEmpty())
            return EMPTY;
        return last.value;
    }

    /**
     * Removes and retrieves the value from the top of the linked list.
     *
     * @return The value removed from the top of the linked list, or {@link #EMPTY} if the linked list is empty.
     */
    public int pop() {
        if (isEmpty())
            return EMPTY;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}
