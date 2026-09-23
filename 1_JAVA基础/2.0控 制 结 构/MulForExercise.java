// 多重循环控制练习
import java.util.Arrays;
import java.util.Scanner;

public class MulForExercise {
  public  static  void main(String[] args){
    // 1.统计3个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
    Scanner scanner = new Scanner(System.in);
    // int[][] scores = new int[3][5];
    // int A = 0, B = 0, C = 0, D = 0;
    // for(int i = 0; i < 3; i++){
    //   for(int j = 0; j < 5; j++){
    //     System.out.println("请输入第" + (i + 1) + "个班第" + (j + 1) + "个同学的成绩:");
    //     scores[i][j] = scanner.nextInt();
    //   }
    // }
    // A = (scores[0][0] + scores[0][1] + scores[0][2] + scores[0][3] + scores[0][4]) / 5;
    // B = (scores[1][0] + scores[1][1] + scores[1][2] + scores[1][3] + scores[1][4]) / 5;
    // C = (scores[2][0] + scores[2][1] + scores[2][2] + scores[2][3] + scores[2][4]) / 5;
    // D = (A + B + C) / 3;
    // System.out.println("三个班的平均分为：" + D);
    // System.out.println("每个班的平均分为：" + A + " " + B + " " + C);
    // // 3.统计三个班及格人数，每个班有5名同学。
    // int passCount = 0;
    // for(int i = 0; i < scores.length; i++) {
    //   for(int j = 0; j < scores[i].length; j++) {
    //     if(scores[i][j] >= 60) {
    //       passCount++;
    //     }
    //   }
    // }
    // System.out.println("三个班的及格人数为：" + passCount);

    // 2.打印出九九乘法表[课后题]
    for(int i = 1; i <=9; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print(j + "*" + i + "=" + i * j + "\t" + " ");
      }
      System.out.println();
    }

    /*
    经典的打印金字塔
    使用for 循环完成下面的案例
    请编写一个程序，可以接收一个整数,表示层数(totalLevel)，打印出金字塔。
    */ 
   int totalLevel = 0; 
   System.out.println("请输入层数(totalLevel):");
   totalLevel = scanner.nextInt();
   int[][] totalLevels = new int[totalLevel][totalLevel*2-1];
   for(int i = 1; i <= totalLevel; i++) {
    for(int j = 1; j <= totalLevel*2-1; j++){
      if ((j == totalLevel - i + 1 || j == totalLevel + i - 1) || i == totalLevel) {
        totalLevels[i-1][j-1] = 1;
      }
      System.out.print(totalLevels[i-1][j-1] == 1 ? "*" : " ");

    }
    System.out.println();
   }

  //  使用while循环完成下面的案例
   int i = 1;
   while(i <= totalLevel) {
    int j = 1;
    while (j <= totalLevel*2-1) {
      if ((j == totalLevel - i + 1 || j == totalLevel + i - 1) || i == totalLevel) {
        totalLevels[i-1][j-1] = 1;
      }
      System.out.print(totalLevels[i-1][j-1] == 1 ? "*" : " ");
      j++;
    }
    i++;
    System.out.println();
   }

   int center = totalLevel / 2; // 中心行
   for(int k = 0; k < totalLevel; k++) {
     int d = Math.abs(k - center);

     for(int j = 0; j < d; j++){
      System.out.print(" ");
     }
     if (d == center) {
      System.out.print("*");
     }else {
      System.out.print("*");
      for(int j = 0; j < totalLevel - 2*d -2; j++) {
        System.out.print(" ");
      }
      System.out.print("*");
     }
     System.out.println();
   }

   System.out.println(Arrays.deepToString(totalLevels));

  }
}
