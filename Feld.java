public class Feld{
  public static int wert(int x, int y){
    int Y = Math.abs(y);
    int X = Math.abs(x);
    int n = 0;
    n = (2*Math.max(X,Y))+1;
    n = (int)(Math.pow(n,2));

    if(X>=Y){
      if(x>0){
        n = n - (5*X) + y ;
      }
      else{
        n = n - X - y;
      }
    }
    else{
      if(y>=0){
        n = n - (3*Y) - x ;
      }
      else{
        n = n - (7*Y) + x ;
      }
    }
    return n;
  }

  /*public static int [] pos(int w){
    int x = 0:
    int y = 0;
    int n = 0;
    int N =Math.pow((2*n+1),2);
    while(N >= w){
      n++;
      N =Math.pow((2*n+1),2);
    }
    n--;
    N =Math.pow((2*n+1),2);

  }*/
}
