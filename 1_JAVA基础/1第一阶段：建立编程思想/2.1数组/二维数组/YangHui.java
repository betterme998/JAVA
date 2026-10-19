public class YangHui {
  public static void main(String[] args) {
    // 使用二维数组打印一个10行杨辉三角YangHui.java
    /*
    1
    1 1
    1 2 1
    1 3 3 1
    1 4 6 4 1
    1 5 10 10 5 1
    ....

    [提示】
    1.第一行有1个元素，第n行有n个元素
    2.每一行的第一个元素和最后一个元素都是1
    3.从第三行开始，对于非第一个元素和最后一个元素的元素的值.arr[i][j]= arr[i-1][j]+arr[i-1][j-1];//必须找到这个规律
    比如第三行下标为1的元素2  = 第二行下标为1的元素1 + 第二行下标为0的元素1
    比如第四行下标为2的元素6  = 第三行下标为2的元素1 + 第三行下标为1的元素1
    以此类推

    */
    int[][] arr = new int[10][]; // 声明一个二维数组，大小为10行
    for(int i = 0; i < arr.length; i++){
      // 初始化每一行的大小
      arr[i] = new int[i+1]; // 每行的元素个数为i+1
      // 初始化每一行的第一个元素和最后一个元素为1
      arr[i][0] = 1;
      arr[i][i] = 1;
      for(int j = 0; j < arr[i].length-2; j++) {
        // 初始化非第一行的第一个元素和最后一个元素的元素的值
        if(i > 1 && j > 0) {
          arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
        }
        System.out.print(arr[i][j] + " ");// 打印当前元素的值
      }
      System.out.println();

      
    }
  }
}
