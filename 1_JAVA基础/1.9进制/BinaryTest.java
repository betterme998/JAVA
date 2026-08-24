// 演示四种进制
// 编码 javac -encoding UTF-8 BinaryTest.java
// 运行 java BinaryTest
/*
进制介绍  
对于整数，有四种表示方式:  
1.二进制:0,1，满2进1.以0b或0B开头  
2.十进制:0-9 ，满10进1。  
3.八进制:0-7，满8进1.以数字0开头表示。  
4.十六进制:0-9及A(10)-F(15)，满16进1.以0x或0X开头表示。此处的A-F不区分大小写。
*/ 
public class BinaryTest {
  public static void main(String[] args) {
    int n1 = 0b1010; // 二进制
    int n2 = 1010;// 十进制
    int n3 = 01010; // 八进制
    int n4 = 0x10101; // 十六进制
    System.out.println("n1="+n1);
    System.out.println("n2="+n2);
    System.out.println("n3="+n3);
    System.out.println("n4="+n4);

  }
}


