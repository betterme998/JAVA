// 练习
import java.util.Scanner;
public class Exercise {
  public static void main(String[] args) {
    /*
    某人有100,000元,每经过一次路口，需要交费,规则如下:
    1)当现金>50000时,每次交5%2)当现金<=50000时,每次交1000
    编程计算该人可以经过多少次路口，要求:使用 while break方式完成
    */ 
    int money = 100000;
    int count = 0;
    while(true) {
      if (money > 50000) {
        money -= money * 0.05;
        count++;
      }else if(money >= 1000){
        money -= 1000;
        count++;
      }else {
        break;

      }
    }
    System.out.println("经过路口" + count + "次");

    // 2.实现判断一个整数，属于哪个范围:大于0;小于0;等于0
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("请输入一个整数,0退出:");
      int number = scanner.nextInt();
      if (number > 0) {
        System.out.println("大于0");
      }else if(number < 0){
        System.out.println("小于0");
      }else {
        System.out.println("等于0");
        break;
      }
    }

    // 3.判断一个年份是否为闰年
    while (true) {
      System.out.println("请输入一个年份,0退出:");
      int year = scanner.nextInt();
      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        System.out.println("闰年");
        break;
      }else {
        System.out.println("平年");
      }
    }
    // 4.判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。例如:153=1*1*1+ 3*3*3+5*5*5
    while (true) {
      System.out.println("请输入一个整数");
      int number = scanner.nextInt();
      int ge = number % 10;
      int shi = number / 10 % 10;
      int bai = number / 100;
      if (ge * ge * ge + shi * shi * shi + bai * bai * bai == number) {
        System.out.println("水仙花数");
        break;
      }else {
        System.out.println("非水仙花数");
      }
    }

    // 输出1-100之间的不能被5整除的数，每5个一行
    int count2 = 0;
    for(int i = 1; i <=100; i++) {
      if (i % 5 != 0) {
        count2++;
        System.out.print(i+"\t");
        if (count2 % 5 == 0) {
          System.out.println();
        }
      }
    }

    // 输出小写的a-z以及大写的Z-A
    for(int i = 'a'; i <= 'z'; i++) {
      System.out.print((char)i);
    }
    for(int i = 'Z'; i >= 'A'; i--) {
      System.out.print((char)i);
    }
    System.out.println();

    // 求出1-1/2+1/3-1/4.....1/100的和
    double sum = 0;
    for(int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        sum -= 1.0 / i;
      }else {
        sum += 1.0 / i;
      }
    }
    System.out.println("结果是" + sum);

    // 求1+ (1+2) + (1+2+3) + (1+2+3+4) +...+(1+2+3+..+100)的结果
    int sum2 = 0;
    for(int i = 1; i <= 100; i++) {
      for(int j = 1; j <=i; j++) {
        sum2 += j;
      }
    }
    System.out.println("结果是" + sum2);
  }
}
