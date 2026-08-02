//编码 javac -encoding UTF-8 ForceConvert.java
//运行 java ForceConvert

/*
二.强制类型转换

介绍：自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。使用时要
加上强制转换符()，但可能造成精度降低或溢出,格外要注意
*/ 
public class ForceConvert {
  // 编写一个main方法
  public static void main(String[] args) {

    // 演示强制类型转换
    int n1 = (int)1.9;
    System.out.println("n1=" + n1);// 1, 造成精度丢失

    int n2 = 2000;
    byte b1 = (byte)n2;
    System.out.println(b1);// -48 造成 数据溢出
  }
}
