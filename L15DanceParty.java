//Torbert, e-mail: smtorbert@fcps.edu
//version 4.16.2003
import edu.fcps.karel2.Display;
import edu.fcps.karel2.WorldFrame; 

public class L15DanceParty
{
   public static void main(String[] args)
   {
   
   //default, empty display
      Display.openWorld("");
      Display.setSize(30,30);
      Display.setSpeed(8);
      WorldFrame.getCurrent().setLocation(0, 0);
   
   //instantiates 4 Swimmers at their respective starting x-positions
      Dancer emma = new Dancer(10,10,0,0);
      Dancer abby = new Dancer(11,10,1,0);
      Dancer mer = new Dancer(12,10,2,0);
      Dancer marina = new Dancer(13,10,3,0);
      
      DancerSquare judy = new DancerSquare(20,15,0,0);
      DancerSquare talia = new DancerSquare(21,15,1,0);
      DancerSquare eden = new DancerSquare(22,15,2,0);
      DancerSquare julie = new DancerSquare(23,15,3,0);
      
      DancerCrazy carolyn = new DancerCrazy(2,30,1,0);
      DancerCrazy karolyn = new DancerCrazy(2,29,1,0);
      DancerCrazy caralynn = new DancerCrazy(2,28,1,0);
      DancerCrazy caraline = new DancerCrazy(2,27,1,0);
      
      DancerDiag solo = new DancerDiag(30, 30, 3, 0);
      
      DancerAnything hola = new DancerAnything (27, 3, 3, 0);
   
   //Creates a threat object for each swimmer   
      Thread t1 = new Thread( emma );
      Thread t2 = new Thread( abby );
      Thread t3 = new Thread( mer );
      Thread t4 = new Thread( marina );
      Thread t5 = new Thread( judy );
      Thread t6 = new Thread( talia );
      Thread t7 = new Thread( eden );
      Thread t8 = new Thread( julie );
      Thread t9 = new Thread( carolyn );
      Thread t10 = new Thread( karolyn );
      Thread t11 = new Thread( caralynn );
      Thread t12 = new Thread( caraline );
      Thread t13 = new Thread( solo );
      Thread t14 = new Thread( hola );


      
   /*Invokes the start method for each thread, which in turn,
   invokes the run method of the Swimmer class*/   
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      t5.start();
      t6.start();
      t7.start();
      t8.start();
      t9.start();
      t10.start();
      t11.start();
      t12.start();
      t13.start();
      t14.start();

   }
}   