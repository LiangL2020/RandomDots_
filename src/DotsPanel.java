import javax.swing.*;
import java.awt.*;

/**
 * Created by liang_lu on 10/2/17.
 */
public class DotsPanel extends JPanel{

    private Dot a, b, c, d;

    public DotsPanel(int width, int height){
        setSize(width,height);

        a = new Dot(getWidth()/2, 0);
        b = new Dot(0, getHeight());
        c = new Dot(getWidth(), getHeight());
        d = new Dot(getWidth()/2, getHeight()/2);

        //3.  Initialize Dot a to be the top center of the screen.
//            Initialize Dot b to be the bottom left of the screen.
//            Initialize Dot c to be the bottom right of the screen.

    }

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

//Test://        Dot test1 = new Dot(100, 100);
//        test1.draw(g2);
//        Dot test2 = new Dot(200, 200);
//        test2.draw(g2);
//        Dot mid = test1.getMidpoint(test2);
//        mid.draw(g2);

        //1.  Go finish the Dot class.
        //2.  Make a few Dots and their midpoints and draw them to test your work.
        //      Once satisfied with your results, delete your test code.
            //Dot test1 = new Dot(100, 100);
            //test1.draw(g2);
            //Dot test2...
            //Dot mid = test1.getMidpoint(test2);

        //3.  Go up to the constructor.  Code up there.

        //4.  Create a Dot called currentDot.  Have it represent the center of the screen.
        Dot currentDot = new Dot(getWidth()/2, getHeight()/2);
        currentDot.draw(g2);

        //5.  Pick one of the instance field Dots at random.
        //sierpinski triangle
        for (int i = 0; i < 10000; i++) {
            int rand = (int)(Math.random()*3);
            if(rand == 0){
                currentDot = a.getMidpoint(currentDot);
//                g2.setColor(new Color(85, 0, 189));
                int R = (int)(Math.random()*256);
                int G = (int)(Math.random()*170);
                int B= (int)(Math.random()*85);
                Color col = new Color(R, G, B);
                g2.setColor(col);
            }else if(rand == 1){
                currentDot = b.getMidpoint(currentDot);
//                g2.setColor(Color.BLUE);
                int R = (int)(Math.random()*85);
                int G = (int)(Math.random()*170);
                int B= (int)(Math.random()*256);
                Color col = new Color(R, G, B);
                g2.setColor(col);
            }else if(rand == 2){
                currentDot = c.getMidpoint(currentDot);
//                g2.setColor(Color.RED);
                int R = (int)(Math.random()*256);
                int G = (int)(Math.random()*80);
                int B= (int)(Math.random()*170);
                Color col = new Color(R, G, B);
                g2.setColor(col);
            }
            currentDot.draw(g2);
        }


        //6.  Move currentDot to be the midPoint of the random instance field and currentDot.

        //7.  Draw currentDot.

        //8.  Modify your code so that steps 5-7 are repeated 10,000 times.

        //9.  Bask in the glory of the result.

        //10. Modify colors, shapes, etc as much as you want.  Make it more awesome.
                //You could add a Color instance field to the Dot class...
                //You could base the Color RGB colors on many things...

    }

}
