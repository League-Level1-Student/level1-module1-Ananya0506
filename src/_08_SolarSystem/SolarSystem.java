package _08_SolarSystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import game_tools.Game;
import game_tools.GameControlScene;
/*
 * Background:
 * Our solar system has 8 planets that orbit around the sun:
 * Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, and Neptune
 * While each planet is spherical, they are different sizes, colors,
 * and distances from the sun.
 * 
 * Objective:
 * Create a planet object for each of the planets in our solar system and
 *   - make them distinct colors
 *   - place them in the correct relative distance from the sun.
 *   - make them the correct relative size.
 *   - make them orbit around the sun at the correct relative speed.
 * 
 * 1. In the Planet class:
 *    a. Add member variables for:
 *       - planet color
 *       - distance from sun
 *       - orbital period (how many days it takes the planet to circle the sun)
 *    b. Assign the member variables in the constructor
 * 
 * 2. In this class:
 *    a. Create Planet objects as member variables for each planet using the
 *       information for each planet below.
 *    b. Call each planet object's draw method inside this class' draw method.
 *
 * EXTRA: Add moons for each planet that has them!
 *
 *        |              | Average distance  | Days to orbit | Number of
 * Body   | Diameter (km)| from the sun (km) | around sun    | moons
 * -------+--------------+-------------------+---------------+-----------+
 * Sun    | 1,391,000    | 0                 | N/A           | N/A
 * Mercury| 4,879        | 57,900,000        | 88            | 0
 * Venus  | 12,104       | 108,200,000       | 224.7         | 0
 * Earth  | 12,756       | 149,600,000       | 365.2         | 1
 * Mars   | 6,792        | 227,900,000       | 687           | 2
 * Jupiter| 142,984      | 778,600,000       | 4,331         | 79
 * Saturn | 120,536      | 1,433,500,000     | 10,747        | 82
 * Uranus | 51,118       | 2,872,500,000     | 30,589        | 27
 * Neptune| 49,528       | 4,495,100,000     | 59,800        | 14
 * https://nssdc.gsfc.nasa.gov/planetary/factsheet/
 */

public class SolarSystem implements GameControlScene {
    static final int DISPLAY_WIDTH = 1000;
    static final int DISPLAY_HEIGHT = DISPLAY_WIDTH;
    static final int CENTER_X = DISPLAY_WIDTH / 2;
    static final int CENTER_Y = DISPLAY_HEIGHT / 2;
    static final int SUN_RADIUS_PIXELS = (1391 / 2) / 20;
    static final int SUN_DIAMETER_PIXELS = 2 * SUN_RADIUS_PIXELS;
    static final int MS_PER_DAY = 10;

    /*
     * Member variables
     */
    int sunX, sunY;
    Long startTimeMs = null;
    Game gameFrame = new Game("Solar System");
    
   Planet Earth = new Planet(8, 14, 365, Color.GREEN);
   Planet Mercury = new Planet(12, 5, 88 , Color.DARK_GRAY);
   Planet Venus = new Planet(12, 10, 224 , Color.WHITE);
   Planet Mars = new Planet(9, 22, 687 , Color.RED);
   Planet Jupiter = new Planet(35, 77, 12*365 , Color.ORANGE);
   Planet Saturn = new Planet(30, 143,29*365 , Color.LIGHT_GRAY);
   Planet Uranus = new Planet(8, 287, 84*365 , Color.CYAN);
   Planet Neptune = new Planet(8, 449, 164*365 , Color.BLUE);
   
   public SolarSystem() {
        gameFrame.setScene(this);
        gameFrame.start();
        gameFrame.setSize(DISPLAY_WIDTH, DISPLAY_HEIGHT);
        
        /*
         * Add Earth's moon
         */
       
        
        sunX = CENTER_X - SUN_RADIUS_PIXELS;
        sunY = CENTER_Y - SUN_RADIUS_PIXELS;
        startTimeMs = System.currentTimeMillis();
    }

    int getDays() {
        if(startTimeMs != null) {
            return (int)((System.currentTimeMillis() - startTimeMs) / MS_PER_DAY);
        }
        
        return 0;
    }

    @Override
    public void draw(Graphics g) {
        /*
         * Space
         */
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, DISPLAY_WIDTH, DISPLAY_HEIGHT);
        
        /*
         * Days
         */
        g.setColor(Color.WHITE);
        g.setFont(new Font("Times New Roman", Font.PLAIN, 32));
        g.drawString("Days: " + getDays(), 0, 50);
        
        /*
         * Sun
         */
        g.setColor(Color.YELLOW);
        g.fillOval(sunX, sunY, SUN_DIAMETER_PIXELS, SUN_DIAMETER_PIXELS);
        
        int numDays = getDays();
        
        /*
         * Add planets here
         */
        
        Mercury.draw(g, numDays);
       Venus.draw(g, numDays);
        Earth.draw(g, numDays);
       Mars.draw(g, numDays);
        Jupiter.draw(g, numDays);
        Saturn.draw(g, numDays);
       Uranus.draw(g, numDays);
      Neptune.draw(g, numDays);
      
        
        

    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        
    }
}




