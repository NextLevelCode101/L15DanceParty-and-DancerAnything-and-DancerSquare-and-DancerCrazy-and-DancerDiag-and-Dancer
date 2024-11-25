import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class DancerAnything extends Dancer {
	//default constructor
	public DancerAnything() {
		super(1, 1, Display.EAST, 0);
	}
	
	//4-arg constructor
	public DancerAnything(int x, int y, int direction, int beepers) {
		//invokes Athlete's 4-arg constructor
      super(x, y, direction, beepers);
	}
	
	//regular dancers just spin in place
	//how boring
	public void danceStep() {
      move();
      turnRight();
      turnLeft();
      move();
      turnLeft();
      turnLeft();
      turnLeft();     
         
      
	}
	
	// TODO: Add the run method definition here
	//       execute danceStep() at least 10 times

   
	
}