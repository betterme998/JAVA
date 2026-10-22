public class Homework02 {
  public static void main(String[] args) {
    /*
    5.随机生成10个整数(1 100的范围)保存到数组，并倒序打印以及求平均值、求最大值和最大值的下标、并查找里面是否有8
    */ 
    int[] arr = new int[10];
    int[] index = {0,1,2,3,4,5,6,7,8,9};

    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int)(Math.random() * 100 + 1);
    }
    System.out.println("排序前");
    for (int value : arr) {
      System.out.print(value + " ");
    }
    System.out.println();
    int[][] newArr = insertSorted(arr,index);
    int avg = average(arr);


    System.out.println("排序后");
    for (int value : newArr[0]) {
      System.out.print(value + " ");
    }
    System.out.print("最大值下标："+newArr[1][0]);
    System.out.println("平均值为："+avg);
    System.out.println();

    // 倒序打印
  }

  private static int[][] insertSorted(int[] arr,int[] index) {
      for (int i = 0; i < arr.length -1; i++) {// 外层循环，控制轮数
        for (int j = 0; j < arr.length-1 - i; j++) { //内层循环，控制比较次数
          if(arr[j] < arr[j+1]) {//比较相邻元素，如果前者小于于后者，则交换位置
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;//交换位置

            int tempIndex = index[j];
            index[j] = index[j+1];
            index[j+1] = tempIndex;
          }
        }
      }
      return  new int[][]{arr,index};
  }
  private static int average(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {// 外层循环，控制轮数
      sum += arr[i];
    }
    return  sum/arr.length;
  }
}
