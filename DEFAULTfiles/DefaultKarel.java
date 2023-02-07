/**
 * @student.info
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, describe goals
 *<BR> Cite Sources:  People who helped, and/or websites used
 */

import kareltherobot.*;

public class DefaultKarel implements Directions
{
    public static void main(String[] args)
    {
        //load world window
        World.reset();
        World.readWorld("Default.kwld");	//load world map
        World.setVisible(true);				//show map
        World.setDelay(50);					//hundredths of seconds

        UrRobot Karel = new UrRobot(1, 1, East, 0);

        //move Karel forward, face north, turn off
        Karel.move();
        Karel.move();
        Karel.move();
        Karel.move();
        Karel.turnLeft();
        Karel.move();
        Karel.move();
        Karel.move();
        Karel.move();

        //turn off Karel
        Karel.turnOff();
    }
}

/*
RUN OUTPUT:

*/