public class ReverseHello{

  public static void main(String[] args) {

    MyThread mt;
      mt = new MyThread (1, 50);
      mt.start ();
  }
}

class MyThread extends Thread {

MyThread mine;
int myNumber;
boolean limit;

  MyThread(int first, int second){
    this.myNumber = first;
    if (first < second){
    this.mine = new MyThread(++first, second);
    try {
      this.mine.start();
      this.mine.join();
    } catch(Exception e) {
      System.out.println("This doesnt work lol ");
    }
  } else  {
    limit = true;
  }
  }

  public void run(){
    System.out.println("Thread number: " + myNumber);
    return;
    }
}
