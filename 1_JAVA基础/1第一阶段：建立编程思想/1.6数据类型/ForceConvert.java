//编码 javac -encoding UTF-8 ForceConvert.java
//运行 java ForceConvert

/*
二.强制类型转换

介绍：自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。使用时要
加上强制转换符()，但可能造成精度降低或溢出,格外要注意

强制类型转换细节说明  
1.当进行数据的大小从 大--->小，就需要使用到强制转换  
2.强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级  
3.char类型可以保存 int的常量值，但不能保存int的变量值，需要强转  
4.byte和short类型在进行运算时，当做int类型处理，
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

    // 强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级 
    // int x = (int)10*3.5 + 6*1.5; //错误，会先将10转换成int类型在计算，最终double -> int 报错
    int x = (int)(10*3.5+6*1.5);
    System.out.println(x);//44

    // char类型可以保存 int的常量值，但不能保存int的变量值，需要强转  
    char c1 = 100; //ok
    int m = 100; //ok
    // char c2 = m;错误
    char c3 = (char)m; //ok
    System.out.println(c3); //100对应的字符 d

    // 练习题
    // 1
    short s = 12;
    // s = s-9; //错误，因为s-9结果是int类型，不能赋值给short

    // 2
    byte b = 10;
    // b = b + 11;错误，因为b+11结果是int类型，不能赋值给byte
    b = (byte)(b + 11);//ok

    // 3
    char c = 'a';
    int i = 16;
    float d = .314f;
    double result = c + i + d;//ok

    // 4.
    byte b2 = 16;
    short s2 = 14;
    // short t = s + b;//错误，因为s+b结果是int类型，不能赋值给short
    // byte，short，char 他们三者可以计算，在计算时首先转换为int类型。
  }
}
