package DataStructure;

public class ArrList<E> {
  //인스턴스변수
  private E a[];
  private int size;
  //생성자
  public ArrList() {
    a =  (E[])new Object[1];
    this.size = 0;
  }
  //연산


  public int size() {
    return size;
  }
  public E get(int k) {
    if(size == 0 || k < 0 || k > size) {
      throw new IndexOutOfBoundsException();
    }
    return a[k];
  }

  public boolean add(E e) {
    if(a.length == size) {
      resize();
    }
    a[size] = e;
    size++;
    return true;
  }

  public boolean add(E e, int idx) {
    if(idx > size && idx < 0) {
      throw new IndexOutOfBoundsException();
    }
    if(a.length == size) {
      resize();
    }
    for(int i = size+1; i > idx; --i) {
      a[i] = a[i-1];
    }
    a[idx] = e;
    size++;
    return true;
  }

  public boolean removeLast() {
    if(size <= 0) {
      throw new IndexOutOfBoundsException();
    } else {
      a[size-1] = null;
      size--;
      if(a.length/2 >= size) {
        resize();
      }
      return true;
    }
  }

  public boolean remove(int idx) {
    if(idx > size && idx < 0) {
      throw new IndexOutOfBoundsException();
    } else {
      a[idx] = null;
      for(int i = idx; i < size; ++i) {
        if(i == size-1) {
          a[i] = null;
        }else {
          a[i] = a[i+1];
        }
      }
      size--;
      if(a.length/2 >= size) {
        resize();
      }
      return true;
    }
  }

  private void resize() {
    E[] newArr;
    if(a.length == size) {
      newArr = (E[])new Object[size*2];

      System.out.println("2배 리사이징");
    } else if (a.length/2 >= size) {
      newArr = (E[])new Object[size];

      System.out.println("2/1 리사이징");

    } else {
      newArr = (E[])new Object[size];
    }
    for(int i = 0; i < size; ++i) {
      newArr[i] = a[i];
    }
    a = newArr;
  }
}
