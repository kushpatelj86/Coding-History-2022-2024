/**
 *<BR> Name:          First Last
 *<BR> Date:          0-00-0000
 *<BR> Period:        0
 *<BR> Assignment:    Lesson00
 *<BR> Description:   In a sentence, what does this code do?
 *<BR> Cite Sources:  Everyone who helped, and/or websites used
 */

import gpdraw.*;
import java.awt.Color;

public class DefaultGPDraw
{
    private static Color MyColor = (new Color(64,224,208));
    public static void main(String[] args)
    {
        DrawingTool MyPencil;
        MyPencil = new DrawingTool(new SketchPad(500,250));
        MyPencil.setColor(MyColor);
        
        MyPencil.forward(75);
        MyPencil.turnLeft(90);
        MyPencil.forward(43);
        MyPencil.turnLeft(45);
        MyPencil.forward(45);
        MyPencil.turnRight(80);
        MyPencil.forward(88);
    }
}

/*
RUN OUTPUT:

*/