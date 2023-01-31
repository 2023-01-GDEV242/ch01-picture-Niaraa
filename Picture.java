/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Niara Afriyie
 * @version 2016.02.29
 */
public class Picture
{
    private Circle sun;
    private Square window;
    private Square house;
    private Triangle roof;
    private Triangle pyramid;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        house = new Circle();
        window = new Triangle();
        roof = new Rectangle();  
        sun = new Square();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            house.moveHorizontal(200);
            house.moveVertical(20);
            house.changeSize(250);
            house.makeVisible();
            
            window.changeColor("blue");
            window.moveHorizontal(50);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(150,200);
            roof.moveHorizontal(100);
            roof.moveVertical(100);
            roof.makeVisible();
    
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        house.changeColor("magenta");
        window.changeColor("blue");
        roof.changeColor("blue");
        sun.changeColor("yellow");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        house.changeColor("magenta");
        window.changeColor("blue");
        roof.changeColor("blue");
        sun.changeColor("yellow");
    }
}
