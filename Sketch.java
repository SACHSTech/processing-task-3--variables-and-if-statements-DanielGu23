import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
  * A program Sketch.java that draws a circle at a random location, before drawing the ears, eyes, nose and mouth to form a cat's face. The color of the background changes based on the location of the cat.
  * @author: D. Gu
  */

// Create the time and location variables
float fltCatHeadX;
float fltCatHeadY;
int intHours;
int intMinutes;
int intSeconds;
	
  public void settings() {
    // Size of sketchpad and randomly generating values for the cat head position
    size(400, 400);
    fltCatHeadX = random(0, width);
    fltCatHeadY = random(0, height);
    intHours = hour();
    intMinutes = minute();
    intSeconds = second();
    
    // Print out current time
    System.out.print ("The current time is "+intHours + " hours and ");
    System.out.print (+intMinutes + " minutes and ");
    System.out.print (+intSeconds + " seconds");
  }

  public void draw() {
    float fltHeadSize = width/2;  
    
    // Change the background color based on the location of the cat head
    // Turquoise background
    if(fltCatHeadX > fltHeadSize && fltCatHeadY > fltHeadSize){ 
      background(0, 140, 128);
      
      // Green background
      }else if (!(fltCatHeadX > fltHeadSize || fltCatHeadY > fltHeadSize)){
        background(0, 200, 0);
      
      // Pink background
      }else if (fltCatHeadX < fltHeadSize && fltCatHeadY > fltHeadSize){
        background(200, 0, 120);
      
      // Gray background
      }else if (fltCatHeadX > fltHeadSize && fltCatHeadY < fltHeadSize){
        background(123, 123, 123);
      }
    
    // Draw the head
    stroke(0);
    ellipse(fltCatHeadX, fltCatHeadY, fltHeadSize, fltHeadSize);    
    
    // Draw the ears
    stroke(0);
    line((float)(fltCatHeadX - fltHeadSize/1.5), (float)(fltCatHeadY - fltHeadSize/1.5), (fltCatHeadX - fltHeadSize/4), (float)(fltCatHeadY - fltHeadSize/2.4));
    line((float)(fltCatHeadX - fltHeadSize/1.5), (float)(fltCatHeadY - fltHeadSize/1.5), (float)(fltCatHeadX - fltHeadSize/2), (float)(fltCatHeadY - fltHeadSize/10));
     line((float)(fltCatHeadX + fltHeadSize/1.5), (float)(fltCatHeadY - fltHeadSize/1.5), (fltCatHeadX + fltHeadSize/4), (float)(fltCatHeadY - fltHeadSize/2.4));
    line((float)(fltCatHeadX + fltHeadSize/1.5), (float)(fltCatHeadY - fltHeadSize/1.5), (float)(fltCatHeadX + fltHeadSize/2), (float)(fltCatHeadY - fltHeadSize/10));    
    
    // Draw the eyes
    stroke(0);
    rect((float)(fltCatHeadX - fltHeadSize/3), (float)(fltCatHeadY - fltHeadSize/4.5), (fltHeadSize/5), (float)(fltHeadSize/6.67));
    ellipse((float)(fltCatHeadX - fltHeadSize/3 + fltHeadSize/10), (float)(fltCatHeadY - fltHeadSize/4.5 + fltHeadSize/13.33), (fltHeadSize/20), (fltHeadSize/20));
    rect((float)(fltCatHeadX + fltHeadSize/3 - fltHeadSize/5), (float)(fltCatHeadY - fltHeadSize/4.5), (fltHeadSize/5), (float)(fltHeadSize/6.67));  
    ellipse((float)(fltCatHeadX + fltHeadSize/3 - fltHeadSize/10), (float)(fltCatHeadY - fltHeadSize/4.5 + fltHeadSize/13.33), (fltHeadSize/20), (fltHeadSize/20));

    // Draw the nose and mouth
    triangle((fltCatHeadX), (fltCatHeadY - fltHeadSize/8), (fltCatHeadX - fltHeadSize/7), (fltCatHeadY + fltHeadSize/8), (fltCatHeadX + fltHeadSize/7), (fltCatHeadY + fltHeadSize/8));
    noFill();
    arc((fltCatHeadX + fltHeadSize/4), (fltCatHeadY + fltHeadSize/8), (fltHeadSize/2), (fltHeadSize/2), HALF_PI, PI);
    arc((fltCatHeadX - fltHeadSize/4), (fltCatHeadY + fltHeadSize/8), (fltHeadSize/2), (fltHeadSize/2), 0, HALF_PI);
    
    }
  
}
