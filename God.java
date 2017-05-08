public class God {

  private int souls = 1;

  private static God instance = null;
  private God() {

  }

  public static God getInstance() {
    if(instance == null) {
      instance = new God();
    }
    return instance;
  }

  public void uhhSomeCrazyNextLevelStuff() {
    boolean buddhistTwoSoul = true;
    this.souls = 2;
  }

}
