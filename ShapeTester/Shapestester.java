import java.util.*;
import java.text.*;

public class Shapestester{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("What shape do you want to calculate the surface area and volume of? \n Enter Box(1), Sphere(2) or Pyramid(3)");
     int shape = input.nextInt();
     if (shape == 1){
       Box box = new Box();
       System.out.println("What is the width of the box?");
       int wide = input.nextInt();
       box.setWidth(wide);
       System.out.println("What is the length of the box?");
       int leng = input.nextInt();
       box.setLength(leng);
       System.out.println("What is the height of the box?");
       int heig = input.nextInt();
       box.setHeight(heig);
       System.out.println("Surface Area is: " + box.getSurfaceArea());
       System.out.println("Volume is: " + box.getVolume());
     }else if (shape == 2) {
       Sphere sph = new Sphere();
       System.out.println("What is your radius?");
       int radi = input.nextInt();
       sph.setRadius(radi);
       System.out.println("Volume is: " + sph.getVolume());
       System.out.println("Surface Area is: " + sph.getSurfaceArea());
     } else if (shape == 3){
         Pyramid p = new Pyramid();
         System.out.println("What is the width of the pyramid?");
         int w = input.nextInt();
         p.setWidth(w);
         System.out.println("What is the length of the pyramid?");
         int l = input.nextInt();
         p.setLength(l);
         System.out.println("What is the height of the pyramid?");
         int h = input.nextInt();
         p.setHeight(h);
         System.out.println("Surface Area is: " + p.getSurfaceArea());
         System.out.println("Volume is: " + p.getVolume());
     }
}
}
