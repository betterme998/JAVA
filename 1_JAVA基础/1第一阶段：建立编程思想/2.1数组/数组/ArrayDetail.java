public class ArrayDetail {
  // 数组使用注意事项和细节 

   public static  void main(String[] args) {
    // 1.数组是多个相同类型数据的组合，实现对这些数据的统一管理  
    int[] a = {1,2,3,4,5};

    // 2.数组中的元素可以是任何数据类型，包括基本类型和引用类型，但是不能混用。  
    String[] arr3 = {"Hello", "World"};

    // 3.数组创建后如果没有赋值，有默认值。int 0,short 0,long 0L,byte 0,float 0.0f,double 0.0,char \u0000(空字符),boolean false,String为null  
    int[] arr4 = new int[5];
    System.out.println(arr4[0]); // 输出：0  

    // 6.数组下标必须在指定范围内使用，否则报:下标越界异常，比如int [] arr=new int[5];则有效下标为 0-4 
    int[] arr5 = new int[5];
    System.out.println(arr5[4]); // 报错：下标越界异常  

    // 7.数组一旦初始化，长度不可改变  
    int[] arr6 = new int[5];
    arr6 = new int[10]; // 这样是不允许的，因为已经创建了新的数组对象，原来的引用丢失。如果要增加容量，可以考虑使用ArrayList等集合类。

   }
}