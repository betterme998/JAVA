public class ArrayCopy {
  public static void main(String[] args) {
    // 实现数组拷贝
    //将 int[] arr1 = {10,20,30};拷贝到arr2数组，要求数据空间是独立的.
    int[] arr1 = {10,20,30};

    // 创建一个新的数组arr2，开辟新的数据空间
    // 大小 arr1.length;
    int[] arr2 = new int[arr1.length];

    // /遍历arr1把每个元素拷贝到对应的位置
    for(int i = 0; i < arr1.length; i++) {
      arr2[i] = arr1[i];
    }

    // 修改arr2的第一个元素
    arr2[0] = 100;
    // 输出arr1
    System.out.println("arr1元素");
    for(int i =0; i < arr1.length; i++) {
      System.out.println(arr1[i]); // 输出：10 20 30
    }
    // 输出arr2
    System.out.println("arr2元素");
    for(int i =0; i < arr2.length; i++) {
      System.out.println(arr2[i]); // 输出：100 20 30
    }
  }
}
