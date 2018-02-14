public class Pyramid{
  private float length;
  private float height;
  private float width;

  public Pyramid() {
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
    double mat = (height*length*width);
    return (float) mat*1/3;
  }
  public float getSurfaceArea(){
    double sat = ((this.length * this.width + this.length* Math.sqrt((this.width/2)*(this.width/2)+this.height*this.height+this.width)+(this.width)*Math.sqrt((this.length/2)*(this.length/2)+this.height*this.height)));
    return (float) sat;
  }
}
//2lw+2lh+2wh
