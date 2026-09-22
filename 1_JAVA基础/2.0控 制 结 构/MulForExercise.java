// 多重循环控制练习
import java.util.Scanner;

public class MulForExercise {
  public  static  void main(String[] args){
    // 1.统计3个班成绩情况，每个班有5名同学，求出各个班的平均分和所有班级的平均分[学生的成绩从键盘输入]。
    Scanner scanner = new Scanner(System.in);
    int[][] scores = new int[3][5];
    int A = 0, B = 0, C = 0, D = 0;
    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 5; j++){
        System.out.println("请输入第" + (i + 1) + "个班第" + (j + 1) + "个同学的成绩:");
        scores[i][j] = scanner.nextInt();
      }
    }
    A = (scores[0][0] + scores[0][1] + scores[0][2] + scores[0][3] + scores[0][4]) / 5;
    B = (scores[1][0] + scores[1][1] + scores[1][2] + scores[1][3] + scores[1][4]) / 5;
    C = (scores[2][0] + scores[2][1] + scores[2][2] + scores[2][3] + scores[2][4]) / 5;
    D = (A + B + C) / 3;
    System.out.println("三个班的平均分为：" + D);
    System.out.println("每个班的平均分为：" + A + " " + B + " " + C);
    // 3.统计三个班及格人数，每个班有5名同学。
    int passCount = 0;
    for(int i = 0; i < scores.length; i++) {
      for(int j = 0; j < scores[i].length; j++) {
        if(scores[i][j] >= 60) {
          passCount++;
        }
      }
    }
    System.out.println("三个班的及格人数为：" + passCount);

    // 2.打印出九九乘法表[课后题]
    for(int i = 1; i <=9; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print(j + "*" + i + "=" + i * j + "\t" + " ");
      }
      System.out.println();
    }
  }
}
