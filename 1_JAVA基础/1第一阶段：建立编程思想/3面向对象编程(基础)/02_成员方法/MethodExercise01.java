
/*
1.编写类AA，有一个方法:判断一个数是奇数odd还是偶数，返回boolean
2.根据行、列、字符打印对应行数和列数的字符，比如:行:4，列:4,字符
#，则打印相应的效果
*/ 
import java.util.Scanner;
public class MethodExercise01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    AA aa = new AA();
    int num = 0;
    BB bb = new BB();
    System.out.println("请输入行数");
    int row = sc.nextInt();
    System.out.println("请输入列数");
    int cal = sc.nextInt();
    System.out.println("请输入字符");
    String ch = sc.next();
    bb.print(row, cal, ch);
    System.out.println("--------------------------------------------------");
    while (true) {
      System.out.println("请输入一个数，判断是奇数还是偶数");
      num = sc.nextInt();
      
      System.out.println(aa.isOdd(num) ? "奇数" : "偶数");
    }
  } 
}
class AA {
  public boolean isOdd(int a) {
    return a % 2 == 1;
  }
}

class BB {
  public void print(int row, int cal, String ch) {
    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= cal; j++) {
        System.out.print(ch);
      }
      System.out.println();
    }
  }
}