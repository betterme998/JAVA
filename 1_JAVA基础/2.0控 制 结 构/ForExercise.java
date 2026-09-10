// 编码 javac -encoding UTF-8 ForExercise.java
// 运行 java ForExercise
public class ForExercise {
  public static void main(String[] args) {
    // 1.打印1~100之间所有是9的倍数的数，统计个数及总和
    int count = 0;//统计个数
    int sum = 0;//统计总和
    int start = 1;
    int end = 100;
    int t = 9;
    for (int i = start; i <= end; i++) {
      if (i % t == 0) {
        sum += i;
        count++;
      }
    }
    System.out.println("1~100之间所有是9的倍数的数，统计个数及总和为：" + count + " " + sum);

    // 2.完成下面的表达式输出
    // 0+5 = 5
    // 1+4 = 5
    // 2+3 = 5
    // 3+2 = 5
    // 4+1 = 5
    // 5+0 = 5
    int n = 5;
    for (int i = 0; i < n; i++) {
      System.out.println(i + "+" + (n - i) + " = " + n);
    }
    for (int i = 0, j = 5; i < 5; i++, j--) {
      System.out.println(i + "+" + j + " = " + 5);
    }
  }
}
