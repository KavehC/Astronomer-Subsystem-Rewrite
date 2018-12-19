public class Elevator()
{
    GamepadWrapper manipControler;
    LinearActuator Left;
    LinearActuator Right;

    public Elevator(GamepadWrapper manipControler, LinearActuator Left, LinearActuator Right)
    {
      this.manipControler = manipControler;
      this.left = left;
      this.right = right;
    }

    public void update()
  {
    while(manipController.getLeftStickY() > 0) 
    {
      left.setVolt(1);
      right.setVolt(1);
    }
    while (manipController.getLeftStickY() < 0)
    {
      left.setVolt(-1);
      right.setVolt(-1);
    }
    if (manipController.getLeftStickY() == 0)
    {
      left.setVolt(0);
      right.setVolt(0);
    }
    }
  }
}