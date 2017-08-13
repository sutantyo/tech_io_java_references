public class Point
{
  private int x;
  private int y;
  public String name;

  public static void main(String[] args){
    Point testPoint = new Point();
    System.out.println("testPoint.name is " + testPoint.name);
    System.out.println("testPoint.x is " + testPoint.x);
    System.out.println("testPoint.y is " + testPoint.y);
    System.out.println("testPoint is " + testPoint);
  }
}
