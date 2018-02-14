public class Sphere{
    private float radius;

    public Sphere() {
      this.setRadius(0);
    }
    public float getRadius(){
      return radius;
    }
    public void setRadius(float radius){
      this.radius = radius;
    }
    public float getVolume() {
      double stat = Math.PI*radius*radius*radius*4;
      return (float) stat*1/3;
    }
    public float getSurfaceArea(){
      double sat = Math.PI*radius*radius*4;
      return (float) sat;
    }
  }
