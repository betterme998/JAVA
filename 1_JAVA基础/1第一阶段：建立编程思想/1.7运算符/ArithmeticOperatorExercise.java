/**
 * 算术运算符
 * **/ 
public class ArithmeticOperatorExercise {
  // 编写一个main方法
  public static void main(String[] args) {
    // 1.
    int i = 1;
    // i = i++; //规则使用临时变量 (1)temp=i (2)i=i+1; (3)i = temp; 1
    i = ++i; //规则使用临时变量(1)i+1; (2)temp = i; (3)i = temp; 2
    System.out.println(i);//

    // 自增，自减课堂练习，看看输出什么
    int i1 = 10;
    int i2 = 20;
    int i3 = i1++;
    System.out.println("i3="+i3);//10
    System.out.println("i2="+i2);//20
    i3 = --i2;
    System.out.println("i3="+i3);//19
    System.out.println("i2="+i2);//19

  }
}
