public class ArrayExercise {
  public static void main(String[] args) {
    /*
    数组应用案例
    */ 
    //1.创建一个char类型的26个元素的数组，分别放置'A'-'Z‘。使用for循环访问所有元素并打印出来。提示:cha类型数据运算'A'+1->'B'
    char[] ch = new char[26];
    for (int i = 0; i < ch.length; i++) {
      ch[i] = (char)('A'+i);
      System.out.println(ch[i]);
    }

    // 2.请求出一个数组int[]的最大值{4，-1,9，10,23}，并得到对应的下标。
    int[] arr = {4, -1, 9, 10, 23};
    int max = arr[0];
    int maxIndex = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
        maxIndex = i;
      }
    }
    System.out.println("最大值为：" + max + "，下标为：" + maxIndex);

    // 3.请求出一个数组的和和平均值。(养鸡场)
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println("数组的和为：" + sum);
    System.out.println("数组的平均值为：" + (double)sum/arr.length);

  }
}
