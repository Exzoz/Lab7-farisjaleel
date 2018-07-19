package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class LinkedStack<E> implements IStack<E> {

  private int size; // For size of the stack

  /**
   * The topmost node of this stack. The stack gets pushed down from here.
   */

  private Node<E> top;


  @Override
  public E push(final E obj) {
    Node<E> node = new Node<E>(obj);
    node.next = top;
    top = node;
    size++;
    return obj;
  }

  @Override
  public E peek() {
    if (top == null) {
      throw new NoSuchElementException();
    }
    return top.data;

  }

  @Override
  public E pop() {
    if (top == null) {
      throw new NoSuchElementException();
    }
    E obj = top.data;
    top = top.next;
    size--;
    return obj;

  }

  @Override
  public boolean isEmpty() {

    return top == null;
  }

  @Override
  public List<E> asList() {

    final ArrayList<E> result = new ArrayList<>(size);
    populateList(top, result);

    return result;

  }

  private void populateList(final Node<E> curr, final List<E> result) {
    if (size == 0) {
      return;
    }
    result.add(curr.data);
    if (curr.next != null) {
      populateList(curr.next, result);
    }
  }

  @Override
  public List<E> asFifoList() {
    final ArrayList<E> result = new ArrayList<>(size);
    populateFifoList(top, result);
    return result;
  }

  private void populateFifoList(final Node<E> curr, final List<E> result) {
    if (size == 0) {
      return;
    }
    if (curr.next != null) {
      populateFifoList(curr.next, result);
    }
    result.add(curr.data);
  }

}
