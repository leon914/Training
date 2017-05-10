public class Scope {

  int x = 5; //feild for class

  public static void main(String[] args) {

  }

  public int getLocal(){
  int x = 10;
  return x; //this x will return the x the line above
  }

  public int getClassVar(){
  return this.x; //returns the x from the top of the class
  }

  public int loopClass(int e){
    int x; // this x is used in the for loop below (i put it here just to show as many scope things as i could)
    for (x = 0; x < 4; x++) {
    }
    this.x = x + e; // the x at the top of the class (this.x) now equals x(which now equals 4) plus e (which is whatever people enter in the parameters)
    return this.x;
  }

}
