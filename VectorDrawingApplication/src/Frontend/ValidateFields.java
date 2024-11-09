
package Frontend;


public class ValidateFields {
    public static boolean validateCoordinates(int x,int y)
    {
        if(x>400 || y>350)
            return false;
        else if(x<0 || y<0)
            return false;
        else
            return true;
    }
}
