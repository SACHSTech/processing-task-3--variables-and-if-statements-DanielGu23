import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
  * A program Sketch.java that draws a circle at a random location, before drawing the ears, eyes, nose and mouth to form a cat's face. The color of the background changes based on the location of the cat.
  * @author: D. Gu
  */

// Create the time and location variables
float catHeadX;
float catHeadY;
int intHours;
int intMinutes;
int intSeconds;
	
  public void settings() {
	  // Size of sketchpad and randomly generating values for the cat head position
    size(400, 400);
    catHeadX = random(0, width);
    catHeadY = random(0, height);
    intHours = hour();
    intMinutes = minute();
    intSeconds = second();
    
    // Prints out current time
    System.out.print ("The current time is "+intHours + " hours and ");
    System.out.print (+intMinutes + " minutes and ");
     System.out.print (+intSeconds + " seconds");
  }

  public void draw() {
    float headSize = width/2;  
    
    // Change the background color based on the location of the cat head
    // Turquoise background
    if(catHeadX > headSize && catHeadY > headSize){ 
      background(0, 140, 128);
      
      // Green background
      }else if (!(catHeadX > headSize || catHeadY > headSize)){
        background(0, 200, 0);
      
      // Pink background
      }else if (catHeadX < headSize && catHeadY > headSize){
        background(200, 0, 120);
      
      // Gray background
      }else if (catHeadX > headSize && catHeadY < headSize){
        background(123, 123, 123);
      }
    
    // Draw the head
    stroke(0);
    ellipse(catHeadX, catHeadY, headSize, headSize);    
    
    // Draw the ears
    stroke(0);
    line((float)(catHeadX - headSize/1.5), (float)(catHeadY - headSize/1.5), (catHeadX - headSize/4), (float)(catHeadY - headSize/2.4));
    line((float)(catHeadX - headSize/1.5), (float)(catHeadY - headSize/1.5), (float)(catHeadX - headSize/2), (float)(catHeadY - headSize/10));
     line((float)(catHeadX + headSize/1.5), (float)(catHeadY - headSize/1.5), (catHeadX + headSize/4), (float)(catHeadY - headSize/2.4));
    line((float)(catHeadX + headSize/1.5), (float)(catHeadY - headSize/1.5), (float)(catHeadX + headSize/2), (float)(catHeadY - headSize/10));    
    
    // Draw the eyes
    stroke(0);
    rect((float)(catHeadX - headSize/3), (float)(catHeadY - headSize/4.5), (headSize/5), (float)(headSize/6.67));
    ellipse((float)(catHeadX - headSize/3 + headSize/10), (float)(catHeadY - headSize/4.5 + headSize/13.33), (headSize/20), (headSize/20));
    rect((float)(catHeadX + headSize/3 - headSize/5), (float)(catHeadY - headSize/4.5), (headSize/5), (float)(headSize/6.67));  
    ellipse((float)(catHeadX + headSize/3 - headSize/10), (float)(catHeadY - headSize/4.5 + headSize/13.33), (headSize/20), (headSize/20));

    // Draw the nose and mouth
    triangle((catHeadX), (catHeadY - headSize/8), (catHeadX - headSize/7), (catHeadY + headSize/8), (catHeadX + headSize/7), (catHeadY + headSize/8));
    noFill();
    arc((catHeadX + headSize/4), (catHeadY + headSize/8), (headSize/2), (headSize/2), HALF_PI, PI);
    arc((catHeadX - headSize/4), (catHeadY + headSize/8), (headSize/2), (headSize/2), 0, HALF_PI);
    
    }
  
}
