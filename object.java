//4.	WAP to show the use of class, object and constructor in java. Create a box class with variables length, width, height and functions set(), get(), volume().
import java.lang.*;
import java.util.Scanner;
 class box {
    public 
    int length;
    int width;
    int height;
    void set(int x,int y,int z)
    {
      length=x;
      width=y;
      height=z;
    }
    void get()
    {
         System.out.println(length);
         System.out.println(width);
         System.out.println(height);
    }
    void volume()
    {
          int vol=length*width*height;
          System.out.println(vol);
    }
    box()
    {
        length=0;
        width=0;
        height=0;
    }
    public static  void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter length\n height\n width\n");
         int x=sc.nextInt();
         int y=sc.nextInt();
         int z=sc.nextInt();
         box obj=new box();
         obj.set(x,y,z);
         obj.get();
         obj.volume();
    }
}
