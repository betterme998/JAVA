// . java 常用的转义字符

// 编码：javac -encoding UTF-8 ChangeChar.java
// 运行：java ChangeChar

public class ChangeChar {
  public static void main(String[] args) {
    // 1. \t : 一个制表位，实现对齐功能
    System.out.println("北京\t天津\t上海");//北京    天津    上海

    // 2. \n : 换行符
    System.out.println("jack\nsmith\nmary");
    /*
    jack
    smith 
    mary
    */ 

    // 3. \\ : 一个\
    System.out.println("C:\\inetpub");//C:\inetpub

    // 4. \" : 一个"
    System.out.println("老师说：\"好好学习，天天向上\"");//老师说："好好学习，天天向上"

    // 5. \' : 一个'
    System.out.println("老师说：\'好好学习，天天向上\'");//老师说：'好好学习，天天向上'


    // 6. \r : 一个回车 System.out.println("abc\r 你好")
    System.out.println("孙悟空\r你好"); //你好空
  }
}