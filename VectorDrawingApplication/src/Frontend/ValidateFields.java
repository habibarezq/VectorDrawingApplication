
package Frontend;


public class ValidateFields {
    public static boolean validateCoordinates(int x,int y)
    {
        if(x<0 || x>400 || y>350 || y<0 )
            return false;
        else
            return true;
    }
    public static boolean validateCoordinates(int x,int y,double length)
    {
        if(x<0 || x>400 || y>350 || y<0 || length <0)
            return false;
        else
            return true;
    }
    public static boolean validateCoordinates(int x,int y,double width,double length)
    {
        if(x<0 || x>400 || y>350 || y<0 || width <0 || length <0 )
            return false;
        else
            return true;
    }
}
