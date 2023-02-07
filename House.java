/**
 *<BR> Name:          Kush Patel
 *<BR> Date:          9-25-2021
 *<BR> Period:        2
 *<BR> Assignment:    ICT Curriculim L01
 *<BR> Description:   I programmed a line of code that draws a house and its background setting
 *<BR> Cite Sources:  The websites I used are https://ap.mreliot.com/LessonA01/A1-intro.html, https://ap.mreliot.com/LessonA01/A1-B.html, and https://ap.mreliot.com/LessonA01/Lab-A1-1.html and Mr Elliot taught me how to draw a colored roop by drawing so many lines on top of each other until it makes a good slope and he taught me how to add the background color
 */

import gpdraw.*;
import java.awt.Color;

public class House
{
    //global private values available tp
    //All methods in the class
    private DrawingTool myPencil;
    private SketchPad myPaper;

    //Colors for use in draw() method
    private Color MyRed = new Color(255,0,0);
    private Color MyBlue = new Color(0,0,139);
    private Color MyBlack = new Color(0,0,0);
    private Color MyGreen = new Color(144,238,144); 
    private Color MyBrown = new Color(234,221,202);
    private Color MyLightBlue = new Color(176,224,230);
    private Color MyDarkBrown = new Color(92,64,51);
    private Color MyYellow = new Color(254,254,51);
    private Color MyGrey = new Color(130,130,130);
    
    public House()
    {
        myPaper = new SketchPad(1000, 800);
        myPencil = new DrawingTool(myPaper);
    }

    public void draw()
    {
       background();
       building();
       door();
       roof();
       lawn();
       line();
       window1();
       window2();
       chimney();
       smoke();
       flag();
       satellitedish();
       yardsign();
       tree();
       sidewalk();
       matt();
       sun();
    }
    
    public void background()
    {
        myPencil.move(0,0);
        myPencil.setDirection(0);
        myPencil.setColor(MyLightBlue);
        myPencil.down();
        myPencil.drawRect(1000, 800);
        myPencil.setColor(MyLightBlue);
		myPencil.fillRect(1000, 800);
        myPencil.up();  
    }
    
    public void building()
    {
        myPencil.move(0,0);
        myPencil.setDirection(0);
        myPencil.setColor(MyBlack);
        myPencil.down();
        myPencil.drawRect(500, 300);
        myPencil.setColor(MyBrown);
		myPencil.fillRect(500, 300);
        myPencil.up();
    }

    public void door()
    {
        myPencil.move(0,-75);
        myPencil.setDirection(0);
        myPencil.setColor(MyBrown);
        myPencil.down();
        myPencil.drawRect(70, 150);
        myPencil.setColor(MyBlack);
		myPencil.fillRect(70, 150);
        myPencil.up();
    }

    public void roof()
    {
        myPencil.move(-250,151);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down(); 
        myPencil.forward(500);
        myPencil.up();
        myPencil.move(-247,152);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(495);
        myPencil.up();
        myPencil.move(-245,153);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(490);
        myPencil.up();
        myPencil.move(-243,154);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(485);
        myPencil.up(); 
        myPencil.move(-241,155);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(480);
        myPencil.up();
        myPencil.move(-241,155);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(478);
        myPencil.up();
        myPencil.move(-239,156);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(476);
        myPencil.up();  
        myPencil.move(-237,157);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(472);
        myPencil.up(); 
        myPencil.move(-235,158);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(468);
        myPencil.up();  
        myPencil.move(-233,159);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(464);
        myPencil.up(); 
        myPencil.move(-231,160);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(460);
        myPencil.up(); 
        myPencil.move(-229,161);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(456);
        myPencil.up();
        myPencil.move(-227,162);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(452);
        myPencil.up();
        myPencil.move(-225,163);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(448);
        myPencil.up();
        myPencil.move(-223,164);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(444);
        myPencil.up();
        myPencil.move(-221,165);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(440);
        myPencil.up();
        myPencil.move(-219,166);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(436);
        myPencil.up();
        myPencil.move(-217,167);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(432);
        myPencil.up();
        myPencil.move(-215,168);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(428);
        myPencil.up();
        myPencil.move(-213,169);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(424);
        myPencil.up();
        myPencil.move(-211,170);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(420);
        myPencil.up();
        myPencil.move(-209,171);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(416);
        myPencil.up();
        myPencil.move(-207,172);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(412);
        myPencil.up();
        myPencil.move(-205,173);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(408);
        myPencil.up();
        myPencil.move(-203,174);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(404);
        myPencil.up();
        myPencil.move(-201,175);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(400);
        myPencil.up();
        myPencil.move(-199,176);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(396);
        myPencil.up();
        myPencil.move(-197,177);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(392);
        myPencil.up();
        myPencil.move(-195,178);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(388);
        myPencil.up();
        myPencil.move(-193,179);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(384);
        myPencil.up();
        myPencil.move(-191,180);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(380);
        myPencil.up();
        myPencil.move(-189,181);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(376);
        myPencil.up();
        myPencil.move(-187,182);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(372);
        myPencil.up();
        myPencil.move(-185,183);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(368);
        myPencil.up();
        myPencil.move(-183,184);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(364);
        myPencil.up();
        myPencil.move(-181,185);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(360);
        myPencil.up();
        myPencil.move(-179,186);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(356);
        myPencil.up();
        myPencil.move(-177,187);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(352);
        myPencil.up();
        myPencil.move(-175,188);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(348);
        myPencil.up();
        myPencil.move(-173,189);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(344);
        myPencil.up();
        myPencil.move(-171,190);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(340);
        myPencil.up();
        myPencil.move(-169,191);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(340);
        myPencil.up();
        myPencil.move(-167,192);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(336);
        myPencil.up();
        myPencil.move(-165,193);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(332);
        myPencil.up();
        myPencil.move(-163,194);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(328);
        myPencil.up();
        myPencil.move(-161,195);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(322);
        myPencil.up();
        myPencil.move(-159,196);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(318);
        myPencil.up();
        myPencil.move(-157,197);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(310);
        myPencil.up();
        myPencil.move(-155,198);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(314);
        myPencil.up();
        myPencil.move(-153,199);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(310);
        myPencil.up();
        myPencil.move(-151,200);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(306);
        myPencil.up();
        myPencil.move(-149,201);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(302);
        myPencil.up();
        myPencil.move(-147,202);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(298);
        myPencil.up();
        myPencil.move(-145,203);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(294);
        myPencil.up();
        myPencil.move(-143,204);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(290);
        myPencil.up();
        myPencil.move(-141,205);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(286);
        myPencil.up();
        myPencil.move(-139,206);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(282);
        myPencil.up();
        myPencil.move(-137,207);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(278);
        myPencil.up();
        myPencil.move(-135,208);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(274);
        myPencil.up();
        myPencil.move(-133,209);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(270);
        myPencil.up();
        myPencil.move(-131,210);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(266);
        myPencil.up();
        myPencil.move(-129,211);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(262);
        myPencil.up();
        myPencil.move(-127,212);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(258);
        myPencil.up();
        myPencil.move(-125,213);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(254);
        myPencil.up();
        myPencil.move(-123,214);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(250);
        myPencil.up();
        myPencil.move(-121,215);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(246);
        myPencil.up();
        myPencil.move(-119,216);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(242);
        myPencil.up();
        myPencil.move(-117,217);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(238);
        myPencil.up();
        myPencil.move(-115,218);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(234);
        myPencil.up();
        myPencil.move(-113,219);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(230);
        myPencil.up();
        myPencil.move(-111,220);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(226);
        myPencil.up();
        myPencil.move(-109,221);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(222);
        myPencil.up();
        myPencil.move(-107,222);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(218);
        myPencil.up();
        myPencil.move(-105,223);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(214);
        myPencil.up();
        myPencil.move(-103,224);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(212);
        myPencil.up();
        myPencil.move(-101,225);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(208);
        myPencil.up();
        myPencil.move(-99,226);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(204);
        myPencil.up();
        myPencil.move(-97,227);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(200);
        myPencil.up();
        myPencil.move(-95,228);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(196);
        myPencil.up();
        myPencil.move(-93,229);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(192);
        myPencil.up();
        myPencil.move(-91,230);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(188);
        myPencil.up();
        myPencil.move(-89,231);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(188);
        myPencil.up();
        myPencil.move(-87,232);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(184);
        myPencil.up();
        myPencil.move(-85,233);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(180);
        myPencil.up();
        myPencil.move(-83,234);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(176);
        myPencil.up();
        myPencil.move(-81,235);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(172);
        myPencil.up();
        myPencil.move(-79,236);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(168);
        myPencil.up();
        myPencil.move(-77,237);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(162);
        myPencil.up();
        myPencil.move(-75,238);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(158);
        myPencil.up();
        myPencil.move(-73,239);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(154);
        myPencil.up();
        myPencil.move(-71,240);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(150);
        myPencil.up();
        myPencil.move(-69,241);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(146);
        myPencil.up();
        myPencil.move(-67,242);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(142);
        myPencil.up();
        myPencil.move(-65,243);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(138);
        myPencil.up();
        myPencil.move(-63,244);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(134);
        myPencil.up();
        myPencil.move(-61,245);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(130);
        myPencil.up();
        myPencil.move(-59,246);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(126);
        myPencil.up();
        myPencil.move(-57,247);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(122);
        myPencil.up();
        myPencil.move(-55,248);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(118);
        myPencil.up();
        myPencil.move(-53,249);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(114);
        myPencil.up();
        myPencil.move(-51,250);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(110);
        myPencil.up();
        myPencil.move(-49,251);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(106);
        myPencil.up();
        myPencil.move(-47,252);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(102);
        myPencil.up();
        myPencil.move(-45,253);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(98);
        myPencil.up();
        myPencil.move(-43,254);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(94);
        myPencil.up();
        myPencil.move(-41,255);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(90);
        myPencil.up();
        myPencil.move(-39,256);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(86);
        myPencil.up();
        myPencil.move(-37,257);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(82);
        myPencil.up();
        myPencil.move(-35,258);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(78);
        myPencil.up();
        myPencil.move(-33,259);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(74);
        myPencil.up();
        myPencil.move(-31,260);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(70);
        myPencil.up();
        myPencil.move(-29,261);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(66);
        myPencil.up();
        myPencil.move(-27,262);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(62);
        myPencil.up();
        myPencil.move(-25,263);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(58);
        myPencil.up();
        myPencil.move(-23,264);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(54);
        myPencil.up();
        myPencil.move(-21,265);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(50);
        myPencil.up();
        myPencil.move(-19,266);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(46);
        myPencil.up();
        myPencil.move(-17,267);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(42);
        myPencil.up();
        myPencil.move(-15,268);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(38);
        myPencil.up();
        myPencil.move(-13,269);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(34);
        myPencil.up();
        myPencil.move(-11,270);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(30);
        myPencil.up();
        myPencil.move(-9,271);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(26);
        myPencil.up();
        myPencil.move(-7,272);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(22);
        myPencil.up();
        myPencil.move(-5,273);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(18);
        myPencil.up();
        myPencil.move(-3,274);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(14);
        myPencil.up();
        myPencil.move(-1,275);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(10);
        myPencil.up();
        myPencil.move(1,276);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(6);
        myPencil.up();
        myPencil.move(3,277);
        myPencil.setDirection(0);
        myPencil.setColor(MyDarkBrown);
        myPencil.down();
        myPencil.forward(2);
        myPencil.up();
    }
    
    public void window1() 
    { 
        myPencil.move(155,55); 
        myPencil.setDirection(0); 
        myPencil.setColor(MyRed); 
        myPencil.down(); 
        myPencil.drawRect(80, 80); 
        myPencil.setColor(MyYellow); 
        myPencil.fillRect(80, 80); 
        myPencil.up(); 
    } 
    
    public void window2() 
    { 
        myPencil.move(-155,55);
        myPencil.setDirection(0); 
        myPencil.setColor(MyBlue); 
        myPencil.down(); 
        myPencil.drawRect(80, 80); 
        myPencil.setColor(MyYellow); 
        myPencil.fillRect(80, 80); 
        myPencil.up(); 
    }

    public void chimney()
    {
        myPencil.move(105,245);
        myPencil.setDirection(0);
        myPencil.setColor(MyBlack);
        myPencil.down(); 
        myPencil.drawRect(60, 90);
        myPencil.setColor(MyBlack); 
        myPencil.fillRect(60, 90); 
        myPencil.up();
        myPencil.move(105,305);
        myPencil.setDirection(0);
        myPencil.down(); 
        myPencil.drawRect(90, 30);
        myPencil.setColor(MyBlack); 
        myPencil.fillRect(90, 30); 
        myPencil.up();
    }

    public void smoke()
    {
        myPencil.move(75,330);
        myPencil.setDirection(0);
        myPencil.setColor(MyGrey);
        myPencil.down();
        myPencil.drawCircle(9);
        myPencil.setColor(MyGrey);
        myPencil.fillCircle(9);
        myPencil.up();
        myPencil.move(95,330);
        myPencil.setDirection(0);
        myPencil.setColor(MyGrey);
        myPencil.down();
        myPencil.drawCircle(9);
        myPencil.setColor(MyGrey);
        myPencil.fillCircle(9);
        myPencil.up();
        myPencil.move(115,330);
        myPencil.setDirection(0);
        myPencil.setColor(MyGrey);
        myPencil.down();
        myPencil.drawCircle(9);
        myPencil.setColor(MyGrey);
        myPencil.fillCircle(9);
        myPencil.up();
        myPencil.move(135,330);
        myPencil.setDirection(0);
        myPencil.setColor(MyGrey);
        myPencil.down();
        myPencil.drawCircle(9);
        myPencil.setColor(MyGrey);
        myPencil.fillCircle(9);
        myPencil.up();
        myPencil.move(75,360);
        myPencil.setDirection(0);
        myPencil.setColor(MyGrey);
        myPencil.down();
        myPencil.drawCircle(9);
        myPencil.setColor(MyGrey);
        myPencil.fillCircle(9);
        myPencil.up();
        myPencil.move(95,360);
        myPencil.setDirection(0);
        myPencil.setColor(MyGrey);
        myPencil.down();
        myPencil.drawCircle(9);
        myPencil.setColor(MyGrey);
        myPencil.fillCircle(9);
        myPencil.up();
        myPencil.move(115,360);
        myPencil.setDirection(0);
        myPencil.setColor(MyGrey);
        myPencil.down();
        myPencil.drawCircle(9);
        myPencil.setColor(MyGrey);
        myPencil.fillCircle(9);
        myPencil.up();
        myPencil.move(135,360);
        myPencil.setDirection(0);
        myPencil.setColor(MyGrey);
        myPencil.down();
        myPencil.drawCircle(9);
        myPencil.setColor(MyGrey);
        myPencil.fillCircle(9);
        myPencil.up();
    }

    public void satellitedish()
    {
        myPencil.move(165,205);
        myPencil.setDirection(0);
        myPencil.setColor(MyGrey);
        myPencil.down(); 
        myPencil.drawRect(30, 70);
        myPencil.setColor(MyGrey); 
        myPencil.fillRect(30, 70); 
        myPencil.up();
        myPencil.move(195,245);
        myPencil.setDirection(0);
        myPencil.setColor(MyGrey);
        myPencil.down(); 
        myPencil.drawRect(80, 30);
        myPencil.setColor(MyGrey); 
        myPencil.fillRect(80, 30);
        myPencil.up();
        myPencil.move(198,245);
        myPencil.setDirection(0);
        myPencil.setColor(MyGrey);
        myPencil.down(); 
        myPencil.drawCircle(49);
        myPencil.setColor(MyGrey); 
        myPencil.fillCircle(49); 
        myPencil.up();
        myPencil.move(198,245);
        myPencil.setDirection(0);
        myPencil.setColor(MyBlack);
        myPencil.down(); 
        myPencil.drawCircle(4);
        myPencil.setColor(MyBlack); 
        myPencil.fillCircle(4);
        myPencil.up();
    }
    
    public void yardsign()
    {
        myPencil.move(385,-175);
        myPencil.setDirection(0);
        myPencil.down(); 
        myPencil.drawRect(20, 80);
        myPencil.setColor(MyBrown); 
        myPencil.fillRect(20, 80);
        myPencil.up();
        myPencil.move(385,-90);
        myPencil.setDirection(0);
        myPencil.down(); 
        myPencil.drawRect(100, 90);
        myPencil.setColor(MyGrey); 
        myPencil.fillRect(100, 90);
        myPencil.up();
    }

    public void line()
    {
        myPencil.move(-500,-190);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.forward(1000); 
        myPencil.up();
    }

    public void tree()
    {
        myPencil.move(-385,-145);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.drawRect(20, 140);
        myPencil.setColor(MyDarkBrown); 
        myPencil.fillRect(20, 140);
        myPencil.up();
        myPencil.move(-385,-45);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.drawRect(100, 60);
        myPencil.setColor(MyGreen); 
        myPencil.fillRect(100, 60);
        myPencil.up();
        myPencil.move(-385,15);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.drawRect(80, 60);
        myPencil.setColor(MyGreen); 
        myPencil.fillRect(80, 60);
        myPencil.up();
        myPencil.move(-385,75);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.drawRect(60, 60);
        myPencil.setColor(MyGreen); 
        myPencil.fillRect(60, 60);
        myPencil.up();
    }

    public void flag()
    {
        myPencil.move(-85,245);
        myPencil.setDirection(0);
        myPencil.setColor(MyBlack);
        myPencil.down(); 
        myPencil.drawRect(10, 90);
        myPencil.setColor(MyBlack); 
        myPencil.fillRect(10, 90); 
        myPencil.up();
        myPencil.move(-130,285);
        myPencil.setDirection(0);
        myPencil.setColor(MyBlack);
        myPencil.down(); 
        myPencil.drawRect(100, 80);
        myPencil.setColor(MyRed); 
        myPencil.fillRect(100, 80); 
        myPencil.up();
    }

    public void sidewalk()
    {
        myPencil.move(-485,-510);
        myPencil.setDirection(0);
        myPencil.setColor(MyBlack);
        myPencil.down();
        myPencil.drawRect(5000, 500);
        myPencil.setColor(MyGrey); 
        myPencil.fillRect(5000, 500);
        myPencil.up();

    }

    public void matt()
    {
        myPencil.move(0,-185);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.drawRect(60, 20);
        myPencil.setColor(MyGrey); 
        myPencil.fillRect(60, 20);
        myPencil.up();
        myPencil.move(0,-215);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.drawRect(60, 20);
        myPencil.setColor(MyGrey); 
        myPencil.fillRect(60, 20);
        myPencil.up();
        myPencil.move(0,-245);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.drawRect(60, 20);
        myPencil.setColor(MyGrey); 
        myPencil.fillRect(60, 20);
        myPencil.up();
        myPencil.move(0,-155);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.drawRect(60, 20);
        myPencil.setColor(MyGrey); 
        myPencil.fillRect(60, 20);
        myPencil.up();
    }

    public void sun()
    {
        myPencil.move(375,275);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.drawCircle(49);
        myPencil.setColor(MyYellow); 
        myPencil.fillCircle(49);
        myPencil.up();
    }

    public void lawn()
    {
        myPencil.move(-555,-200);
        myPencil.setDirection(0);
        myPencil.down();
        myPencil.drawRect(5000, 115);
        myPencil.setColor(MyGreen); 
        myPencil.fillRect(5000, 115);
        myPencil.up();
    }




}

/*
RUN OUTPUT:

*/