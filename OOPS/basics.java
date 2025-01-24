package OOPS;
// import java.util.*;
import java.awt.Point;
class circle{
    Point center;
    double radius;


    circle(Point initialvalue,double initialradius){
        center = initialvalue;
        radius=initialradius;
    }
    
}

public class basics {
    public static void main(String[] args) {
        circle obj=new circle(new Point (1,2), 5);
        System.out.println(obj.center);
        System.out.println(obj.radius);
    }
    
}
