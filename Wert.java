public class Wert{

  public static int[] add(int wert, int[] arr){
    int l = arr.length;
    int[] neu = new int[l+1];
    for(int i=0;i<l;i++){
      neu[i]=arr[i];
    }
    neu[l]=wert;
    return neu;
  }
  public static boolean inArr(int wert, int[] arr){
    int l = arr.length;
    for(int i=0;i<l;i++){
      if(wert == arr[i]){
        return true;
      }
    }
    return false;
  }
}
