
//编码 javac -encoding UTF-8 StringToBasic.java
//运行 java StringToBasic
/*
# 基本数据类型和String类型的转换

在程序开发中，我们经常需要将基本数据类型转成String 类型。或者将String类型转成基本数据类型。

.基本类型转String类型语法: 将基本类型的值+""即可  
.String类型转基本数据类型语法:通过基本类型的包装类调用parsexX方法即可
*/ 
public class StringToBasic {
  // 编写一个main方法
  public static void main(String[] args) {

    // 基本数据类型->String
    int n1 = 100;
    float f1 = 1.1F;
    double d1 = 4.5;
    boolean b1 = true;
    String s1 = n1 + "";
    String s2 = f1 + "";
    String s3 = d1 + "";
    String s4 = b1 + "";
    System.out.println(s1 + " " + s2 + " " + s3 + " " + s4);

    // String->基本数据类型
    // String类型转基本数据类型语法:通过基本类型的包装类调用parsexX方法即可
    String s5 = "123";
    // /解读 使用 基本数据类型对应的包装类，的相应方法，得到基本数据类型
    int num1 = Integer.parseInt(s5);
    double num2 = Double.parseDouble(s5);
    float num3 = Float.parseFloat(s5);
    Long num4 = Long.parseLong(s5);
    Byte num5 = Byte.parseByte(s5);
    Boolean num6 = Boolean.parseBoolean("true");
    Short num7 = Short.parseShort(s5);
    System.out.println();

    System.out.println(num1);//123
    System.out.println(num2);//123.0
    System.out.println(num3);//123.0
    System.out.println(num4);//123
    System.out.println(num5);//123
    System.out.println(num6);//true
    System.out.println(num7);//123

    // /怎么把字符串转成字符char -> 是指 把字符串的第一个字符得到
    // //解读 s5.charAt(0)得到 s5字符串的第一个字符 1
    System.out.println(s5.charAt(1)); //1

  }
}
