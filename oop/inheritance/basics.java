
public class basics {
    double l;
    double b;
    double h;

    basics(){
        this.l=-1;
        this.b=-1;
        this.h=3;
    }
    // for cube
    basics(double side){
        this.l=side;
        this.b=side;
        this.h=side;

    }
    // taking two argumnent;
    basics(double length,double breadth){
        this.l=length;
        this.b=breadth;
    }
    basics(double l,double b, double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    basics(basics old){
        this.l=old.l;
        this.b=old.b;
        this.h=old.h;
    }
    public void informaton(){
        System.out.println("runnig the box");
    }


    public static void main(String[] args) {
        basics obj=new basics();
        System.out.println(obj.l+" "+obj.b+" "+obj.h);
        basics obj1=new basics(10.2);
        System.out.println(obj1.l+" "+obj1.b+" "+obj1.h);

        basics obj2=new basics(10.2,8.3);
        System.out.println(obj2.l+" "+obj2.b);

        basics obj3=new basics(10.2,8.3,9.6);
        System.out.println(obj3.l+" "+obj3.b+" "+obj3.h);

        basics obj4=new basics(obj3);
        System.out.println(obj4.l+" "+obj4.b+" "+obj4.h);
        // obj.informaton();
        boxweight b=new boxweight();
        System.out.println(b.weight+"  "+b.l);

    }
    
}
