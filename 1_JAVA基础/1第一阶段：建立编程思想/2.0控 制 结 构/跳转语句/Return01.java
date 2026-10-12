package 跳转语句;
// 跳转控制语句-return  
// return使用在方法，表示跳出所在的方法，在讲解方法的时候，会详细的介绍，这里我们简单的提一下。注意:如果return写在main方法，退出程序..
// javac encoding UTF-8 Return01.java
// java Return01
public class Return01 {
  public static void main(String[] args) {
    for(int i = 1; i <= 5; i++) {
      if (i == 3) {
        System.out.println("i = " + i);
        return;// 跳出方法
      }
      System.out.println("Hello World!");
    }
    System.out.println("程序结束");
  }
}