package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;


public class LinkedStack<E> implements IStack<E> {

  /**
   * The topmost node of this stack. The stack gets pushed down from here.
   */

  private Node<E> top;


  @Override
  public E push(final E obj) {
    Node<E> node = new Node<E>(obj);
    node.next = top;
    top = node;
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
    return obj;

  }

  @Override
  public boolean isEmpty() {

    return top == null;
  }

  @Override
  public List<E> asList() {

    List<E> list = new ArrayList<E>();
    Node<E> current = top;
    while (current != null) {
      list.add(current.data);
      current = current.next;
    }
    return list;
  }
}
