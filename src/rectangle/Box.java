package rectangle;

/******************************************************************************
 * Box.java 
 * Programmer: @author jcboyd
 * 
 * This class is associated with Rectangle.java
 *****************************************************************************/

public class Box 
{
    private int length, width, height;
        
    public Box(int len, int wid, int hgt)
    {
        length = len;
        width = wid;
        height = hgt;
    } //end Box constructor

    public int perimeter()
    {
        int perim = (2 * length) + (2 * width);
        return perim;
    } //end perimeter

    public int area()
    {
        int area = length * width;
        return area;
    } //end area

    public int volume()
    {
        int volume = length * width * height;
        return volume;
    } //end volume
    
} //end class Box

