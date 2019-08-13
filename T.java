public class T{

  public static void Arra(int [] arr){
    System.out.print("{");
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+",");
    }
    System.out.print("}");
  }

  public static void Arra(int [][] arr){
    System.out.print("{");
    for(int i=0;i<arr.length;i++){
      Arra(arr[i]);
      System.out.print(",");
    }
    System.out.print("}");
  }
  public static void L(){
    System.out.println();
  }

  public static void T(String S,int n,int m,int x,int y){
    String N = String.valueOf(n);
    String M = String.valueOf(m);
    String Q = ": (" + N + "," + M + ")";
    StdDraw.textLeft(x,y,S);
    StdDraw.textLeft(x+5,y,Q);
  }

  public static void Koordinatensystem(){
    for(int i=-30;i<31;i++){
      StdDraw.setPenColor(StdDraw.GRAY);
      StdDraw.line(i,-30,i,30);
      StdDraw.line(-30,i,30,i);
    }
  }

}
