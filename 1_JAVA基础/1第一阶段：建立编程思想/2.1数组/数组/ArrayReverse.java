public class ArrayReverse {
  public static void main(String[] args) {
    // 把数组的元素内容反转。
    int[] arr = {1,2,3,4,5};
    int temp = 0;
    for(int i = 0; i < arr.length / 2; i++) {
      temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);//5 4 3 2 1
    }

    // //使用逆序赋值方式实现数组反转。
    int[] arr2 = new int[arr.length];
    for(int i = arr.length - 1, j = 0; i >= 0; i--, j++){//逆序遍历
      arr2[j] = arr[i];//逆序赋值
    }
    //4.当for循环结束，arr2就是一个逆序的数组{1,2,3,4,5};
    //5.让 arr 指向 arr2数据空间,arr原来的数据空间就没有变量引用此时会被当做垃圾，销毁
    arr = arr2;
    //6.输出 arr 数组的元素
    for(int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);//1 2 3 4 5
    }
  }
}
