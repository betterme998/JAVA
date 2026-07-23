// java 转义字符案例

//编码 javac -encoding UTF-8 Test.java
//运行 java Test
public class Test {
  public static void main(String[] args) {
    System.out.println("C:\\inetpub");//C:\inetpub
    System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");

    //示意
    //下面代码完成 两个数相加
    //定义变量
    int n1 = 10;
    int n2 = 30;
    //求和
    int sum = n1 + n2;
    System.out.println("结果=" + sum);
  }
}
