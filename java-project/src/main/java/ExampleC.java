// { autofold
public class ExampleC
{
// }

  public static void main(String[] args){
    int x = 1;
    changeMe(x);
    System.out.println("in main, x is still " + x);

  }

  public static void changeMe(int x){
    System.out.println("in changeMe, x is originally " + x);
    x = 100;
    System.out.println("             then modified to " + x);
  }

//{ autofold
}
//}
