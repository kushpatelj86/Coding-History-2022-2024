/**
 * @student.info
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, describe goals
 *<BR> Cite Sources:  People who helped, and/or websites used
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;

public class DefaultGridWorld
{
    public static void main(String[] args)
    {
        ActorWorld World = new ActorWorld();
        World.add(new Bug());
        World.add(new Rock());
        World.show();
    }
}

/*
RUN OUTPUT:

*/