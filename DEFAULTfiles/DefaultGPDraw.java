/**
 * @student.info
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, describe goals
 *<BR> Cite Sources:  People who helped, and/or websites used
 */

import gpdraw.*;

public class DefaultGPDraw
{
	public static void main(String[] args)
	{
		DrawingTool MyPencil;
		MyPencil = new DrawingTool(new SketchPad(500,500));
		
		MyPencil.forward(75);
		MyPencil.turnLeft(82);
		MyPencil.forward(43);
		MyPencil.turnLeft(112);
		MyPencil.forward(50);
		MyPencil.turnRight(75);
		MyPencil.forward(88);
	}
}

/*
RUN OUTPUT:

*/