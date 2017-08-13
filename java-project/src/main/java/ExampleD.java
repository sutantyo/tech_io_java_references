// { autofold
public class ExampleD
{
// }

  public static void main(String[] args){
    Point pt = new Point();
    pt.name = "First point";
    System.out.println("in main, pt.name is now " + pt.name);
    changeMe(pt);

  }

  public static void changeMe(Point pt){
    System.out.println("in changeMe, pt.name is originally " + pt.name);
    pt.name = "Second point";
    System.out.println("             then modified to " + pt.name);
  }

//{ autofold
}
//}
