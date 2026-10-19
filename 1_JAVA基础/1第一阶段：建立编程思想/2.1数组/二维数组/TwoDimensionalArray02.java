/*
二维数组的使用  
方式一：动态初始化  
1.语法:类型][]数组名=new 类型[大小][大小]  
比:int a[][]=new int[2][3]
*/ 
public class TwoDimensionalArray02 {
  public static void main(String[] args) {
    // int[][] arr = new int[2][3];
    
    int[][] arr;
    arr = new int[2][3];

    arr[1][1] = 100;
    // 遍历arr数组
    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();// 换行
      /*
      0 0 0 
      0 100 0
      */ 

    }
  }
}
