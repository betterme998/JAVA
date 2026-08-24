//编码 javac -encoding UTF-8 input.java
//运行 java input
import java.util.Scanner;//表示把java.uti1下的Scanner类导入
public class input {
  // 编写一个main方法
  public static void main(String[] args) {
    // 演示接受用户的输入
    // 步骤  
    // 5canner类 表示 简单文本扫描器，在java.util 包
    // 1.导入该类的所在包，java.util.\*  
    // 2.创建该类对象(声明变量)  
    // 3.调用里面的功能

    
    Scanner scanner = new Scanner(System.in);
    // 4.接受用户输入,使用 相关的方法
    System.out.println("请输入名字");
    String name = scanner.next();//接收用户输入
    System.out.println("请输入年龄");
    int age = scanner.nextInt();//接收用户输入
    System.out.println("请输入薪水");
    double sal = scanner.nextDouble();//接收用户输入

    System.out.println("姓名=" + name + "\t年龄=" + age + "\t薪水=" + sal);
    scanner.close();
  }
}