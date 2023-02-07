/**
 * @student.info
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, describe goals
 *<BR> Cite Sources:  People who helped, and/or websites used
 */

import edu.cmu.ri.createlab.terk.robot.finch.Finch;

public class DefaultFinch
{
	public static void main(String[] args)
	{
		Finch MyFinch = new Finch();

		MyFinch.setLED(255, 0, 0);
		MyFinch.sleep(5000);
		MyFinch.quit();
	}
}

/*
RUN OUTPUT:

*/