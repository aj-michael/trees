import java.util.AbstractSet;

public class TwoThreeTree<T> {

  Node<T> root = null;

  public TwoThreeTree() { }

  public TwoThreeTree(Collection<T> elems) {
    this.addAll(elems);
  }

  public void add(T elem) {
    if (root == null) {
      root = new TwoNode<T>()
    } else {
      root.add(elem);
    }
  }

  public void addAll(Collection<T> elems) {
    
  }

  public boolean contains(T elem) {
    return root.contains(elem);
  }

  public boolean remove(T elem) {
    return false;
  }

  public int size() {
    return 0;
  }

}

interface Node {
  
  void add(T elem);

  boolean contains(T elem);

  boolean remove(T elem);

}

class TwoNode<T> implements Node<T> {

  T elem = null;
  Node<T> left = null;
  Node<T> right = null;

  TwoNode<T>(T elem) {
    this.elem = elem;
  }

  void add(T elem) {

  }

  boolean contains(T elem) {
    return false;
  }

  boolean remove(T elem) {
    return false

  }

}

class ThreeNode<T> implements Node<T> {

  T elem1 = null;
  T elem2 = null;
  Node<T> left = null;
  Node<T> middle = null;
  Node<T> right = null;

  void add(T elem) {

  }

  boolean contains(T elem) {
    return false;
  }

  boolean remove(T elem) {
    return false;
  }

}
