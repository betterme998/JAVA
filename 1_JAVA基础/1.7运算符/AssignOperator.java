//演示赋值运算符的使用
//编码 javac -encoding UTF-8 AssignOperator.java
//运行 java AssignOperator
/*
赋值运算符就是将某个运算后的值，赋给指定的变量  
赋值运算符的分类1.基本赋值运算符 =  
2.复合赋值运算符  
+=, -=, \*=, /=，%=等，重点讲解一个 +=，其它的使用是一个道理  
a += b;[等价 a = a + b;]  
a -= b;[等价 a = a - b;]

赋值运算符特点  
1.运算顺序从右往左 int num= a+b+c;  
2.赋值运算符的左边 只能是变量,右边 可以是变量、表达式、常量值int num =20; int num2=78\*34 -10; int num3 = a;  
3.复合赋值运算符等价于下面的效果比如:a+=3;等价于a=a+3;  
4.复合赋值运算符会进行类型转换。byte b =2; b+=3; b++;
*/ 
public class AssignOperator {
  // 编写一个main方法
  public static void main(String[] args) {
    int n1 = 10;
    n1 += 4; // 等价 n1 = n1 + 4;
    System.out.println(n1);//14
    n1 /= 3;
    System.out.println(n1);//4

    // 复合赋值运算符会进行类型转换
    byte b = 3;
    b +=2; // 等价 b = (byte)(b + 2);
    b++; // 等价 b = (byte)(b + 1);
  }
}
