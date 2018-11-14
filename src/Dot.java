import java.awt.*;

/**
 * Created by michael_hopps on 10/5/17.
 */
public class Dot {

    private int x, y;

    //Constructor that takes in values for x and y
    // and assigns them to instance fields.
    public Dot(int x, int y){
        this.x = x;
        this.y = y;
    }
//Methods!
    //1.  getX() -> returns x
    public int getX(){
        return x;
    }
    //2.  getY() -> returns y
    public int getY(){
        return y;
    }

    //3.  draw(Graphics2D g2) -> draws this dot (drawOval with w,h = 1,1)
    public void draw(Graphics2D g2){
        g2.fillRect(x,y,3,6);
    }

    //4.  public Dot getMidpoint(Dot other){
    //      returns the Dot that is the midpoint of THIS Dot
    //      and the parameter other Dot.
    //      recall the midpoint formula: ( (x1+x2)/2, (y1+y2)/2 )
    //int midX = (x + other.getX())/2;
    //}
    public Dot getMidpoint(Dot other){
        int midX = (x + other.getX())/2;
        int midY = (y + other.getY())/2;
        Dot mid = new Dot(midX, midY);
        return mid;
    }

}
