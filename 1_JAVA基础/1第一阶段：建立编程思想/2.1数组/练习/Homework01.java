import  java.util.Scanner;;
public class Homework01 {
  public static void main(String[] args) {
    // 1.下面数组定义正确的有 B D 
    /*
    A.String strs[]={'a','b','c'}; //声明的是 String[]，元素必须是 String。
    B.String[] strs = {"a","b","c"};
    C.String[] strs = new String{"a""b""c"};//错误，没有逗号
    D.String strs[] = new String[]{"a","b","c"};
    E.String[] strs = new String[3]{"a","b","c"};//Java 不允许数组创建时同时指定长度和初始化列表
    */ 

    // 2.写出结果
    /*
    String foo="blue";
    boolean[] bar=new boolean[2];
    if(bar[0]){
      foo="green";
    }
    System.out.println(foo); //blue
    */ 

    // 3.以下Java代码的输出结果为()
    /*
    int num=1;
    while(num < 10){
      System.out.println(num); //1 3 5 7
      if(num>5){
        break;
      }
      num+=2;
    }
    */ 

    /*
    4.已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，比如:
    [10,12,45,90],添加23后,数组为[10,12,23,45,90]
    */ 
   Scanner sc = new Scanner(System.in);
   int[] arr = {10,12,45,90};
   boolean condition = true;
   boolean flag = false;
   while (condition) {
    flag = false;
    System.out.println("请输入要插入的数字：");
    int num = sc.nextInt();
    sc.nextLine(); // 消耗换行符
    int[] newArr = new int[arr.length+1];
    for(int i = 0; i < newArr.length; i++) {
      if (i < arr.length && num < arr[i]) {
        newArr[i] = flag ? arr[i-1] : num;
        flag = true;
        continue;
      }
      if(i == newArr.length-1) flag = true;
      
      newArr[i] = flag ? (i == newArr.length-1 && num > arr[i-1] ? num : arr[i-1]) : arr[i];
      // newArr[i] =  arr[i];
    }
    arr = newArr;
    System.out.println("插入后的数组为：");
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
   }
  }
  /*
  6.试写出以下代码的打印结果
  char[] arr1=('a','z','b','c');
  char[] arr2=arr1;
  arr1[2]='韩';

  for(int i = 0; i<arr2.length;i++) {
    System.out.println(arr1[i]+","+arr2[i])
  }
  //aa,zz,韩韩,cc,
  */ 
}
