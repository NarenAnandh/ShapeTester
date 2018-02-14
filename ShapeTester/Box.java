public class Box{
  private float length;
  private float height;
  private float width;

  public Box() {
    this.setHeight(0);
    this.setLength(0);
    this.setWidth(0);
  }
  public float getLength(){
    return length;
  }
  public void setLength (float length){
    this.length = length;
  }
  public float getHeight(){
    return height;
  }
  public void setHeight(float height){
    this.height = height;
  }
  public float getWidth(){
    return width;
  }
  public void setWidth(float width){
    this.width = width;
  }
  public float getVolume() {
    return (height*length*width);
  }
  public float getSurfaceArea(){
    return (2*length*width+2*length*height+2*width*height);
  }
}
//2lw+2lh+2wh
