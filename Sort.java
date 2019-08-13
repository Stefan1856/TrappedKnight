public class Sort{
  public static int[][] wert(int[][] arr){
    for(int i=0;i<arr.length-1;i++){
      if(arr[i][2]>arr[i+1][2]){
        int[] n = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = n;
        wert(arr);
      }
      else{}
    }
    return arr;
  }
}
