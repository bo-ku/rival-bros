/**
 * Name : Bo Ku
 * PennKey : boku
 * Recitation : 220
 * 
 * Execution: java Rivalry
 *
 * Simple animation
 * Description: Tom and Jerry racing to finish line.
 */
public class Rivalry {    
  public static void main(String[] args) {
    boolean tomWins = false;       
    boolean jerryWins = false;  
    
    /* the width of 1 pixel in window coordinate
     * use this variable when you get to the movement portion of the program 
     */
    double ONE_PIXEL = 1.0 / 512;  
    
    //define variables
    double Tom = 0.15;
    double Jerry = 0.15;
    
    // initial image positions before the starting line
    PennDraw.clear(PennDraw.ORANGE);
    PennDraw.setPenRadius(0.03);
    PennDraw.line(0.2, 0, 0.2, 1);
    PennDraw.line(0.8, 0, 0.8, 1);
    PennDraw.picture(Tom, 0.7, "tom.png");
    PennDraw.picture(Jerry, 0.3, "jerry.png");
    PennDraw.text(0.13, 0.95, "START");
    PennDraw.text (0.87, 0.95, "FINISH");
    
    // enable animation to 10 frames/second
    // frame speed rate 
    PennDraw.enableAnimation(100);
    
    //the loop in which the race takes place
    while (!tomWins && !jerryWins) {
      PennDraw.clear();
      PennDraw.clear(PennDraw.ORANGE);
      PennDraw.setPenRadius(0.03);
      PennDraw.line(0.2, 0, 0.2, 1);
      PennDraw.line(0.8, 0, 0.8, 1);
      PennDraw.picture(Tom, 0.7, "tom.png");
      PennDraw.picture(Jerry, 0.3, "jerry.png");
      PennDraw.text(0.13, 0.95, "START");
      PennDraw.text (0.87, 0.95, "FINISH");
      PennDraw.picture(Tom, 0.7, "tom.png");
      PennDraw.picture(Jerry, 0.3, "jerry.png");
      //position changes and verdict
      if (Math.random() <= 0.60) {
        Tom += ONE_PIXEL;
      }
      if (Math.random() <= 0.62) {
        Jerry += ONE_PIXEL;
      }
      if (Tom >= 0.77) {
        tomWins = true;
      } else if (Jerry >= 0.77) {
        jerryWins = true;
      } 
        // show this frame and go on to the next one
        PennDraw.advance(); 
      }
      
      // the race is over so turn off animation
      PennDraw.disableAnimation(); 
      // text containing a victory message
      if (tomWins) {
        PennDraw.text(0.5, 0.5, "TOM WON!!");
      } else if (jerryWins) 
        PennDraw.text(0.5, 0.5, "JERRY WON!!");
    }
  }
