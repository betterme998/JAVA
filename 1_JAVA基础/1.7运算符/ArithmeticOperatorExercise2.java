


//编码 javac -encoding UTF-8 ArithmeticOperatorExercise2.java
//运行 java ArithmeticOperatorExercise2
/**
 * 算术运算符
 * 1.假如还有59天放假，问:合xx个星期零xx天
 * 2.定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为:5/9*(华氏温度-100),请求出华氏温度对应的摄氏温度。[234.5]
 * **/ 

public class ArithmeticOperatorExercise2 {
  // 编写一个main方法
  public static void main(String[] args) {
    // 1.假如还有59天放假，问:合xx个星期零xx天
    int days = 59;
    int weeks = days / 7;
    int day = days % 7;
    System.out.println("合"+weeks+"个星期零"+day+"天");

    // 2.定义一个变量保存华氏温度，华氏温度转换摄氏温度的公式为:5/9*(华氏温度-100),请求出华氏温度对应的摄氏温度。[234.5]
    double f = 234.5;
    double c = 5.0/9*(f-100);
    System.out.println(f+"华氏温度对应的摄氏温度为"+c);
  } 
}
