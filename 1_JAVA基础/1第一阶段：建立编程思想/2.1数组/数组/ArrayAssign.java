// 数组赋值机制
public class ArrayAssign {
  public  static void main(String[] args) {
    //基本数据类型赋值，赋值方式为值拷贝
    int n1 = 10;
    int n2 = n1;
    n2 = 80;
    System.out.println(n1); // 输出：10
    System.out.println(n2); // 输出：80

    //数组在默认情况下是引用传递，赋的值是地址，赋值方式为引用传达
    // //是一个地址,arr2变化会影响到arr1
    int[] arr1 = {1,2,3};
    int[] arr2 = arr1;//arr2和arr1指向同一个数组
    arr2[0] = 100;

    // 输出arr1
    System.out.println("arr1元素");
    for(int i =0; i < arr1.length; i++) {
      System.out.println(arr1[i]); // 输出：100 2 3

    }
  }
}
