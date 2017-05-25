public class Game implements ControllerInputHandler, KeyboardInputHandler,
 GameLogicHandler, Renderable, PhysicsHandler {

  //  class ClickListenerImpl implements ClickListener {
  //
  //    @Override
  //    public void onCLick() {
  //      System.out.println("Clicked!");
  //    }
  //  }

  public static void main(String[] args) {

    Game game1 = new Game();

    // ClickListenerImpl clickListener = new ClickListenerImpl();
    // game1.setClickListener(clickListener);

    // game1.setClickListener(new ClickListener(){
    //   @Override
    //   public void onClick() {
    //     System.out.println("Clicked!");
    //   }
    // })

    game1.setClickListener(()->System.out.println("Clicked!"));
    clickListener.onClick();

  }
  public void setClickListener(ClickListener clickListener) {
    this.clickListener = clickListener;
  }
  @Override
  public void handleControllerInput() {

  }
  @Override
  public void render() {

  }
  @Override
  public void handleGameRules() {

  }
  @Override
  public void handleKeyboardInput() {

  }
  @Override
  public void physicalCollisionsCalculator() {

  }
  private void printRenderable(Renderable renderable) {
    System.out.println(Renderable);
  }
}
