//1.	WAP to show use of Command Line Arguments

import java.util.Scanner;
import java.lang.*;
class command{
public static void main(String args[])
{
     int x=Integer.parseInt(args[0]);
     int y=Integer.parseInt(args[1]);
     System.out.println(x+y);
}
}