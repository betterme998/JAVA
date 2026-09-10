
// for循环
// 编码 javac -encoding UTF-8 For01.java
// 运行 java For01
/*
注意事项和细节说明  
1.循环条件是返回一个布尔值的表达式  
2.for(;循环判断条件;)中的初始化和变量选代可以写到其它地方，但是两边的分
号不能省略。

3.环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开
循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开。

*/ 
public class For01 {
  public static void main(String[] args) {
    // 打印10句hello world
    for (int i = 0; i < 10; i++) {
      System.out.println("hello world");
    }

    // 2.for(;循环判断条件;)中的初始化和变量选代可以写到其它地方，但是两边的分号不能省略。
    int i = 1; //循环变量初始化
    for( ; i <= 10 ;) {
      System.out.println("hello world");
      // 为什么写到这里，而不是for循环里面？
      //因为写for循环里只能在for循环里面使用i，不能在for循环外面使用i，所以i要写到这里，而不是for循环里面。
      i++; //循环变量迭代
    }
    System.out.println("i=" + i);//11

    // 补充·
    // for(;;) {//表示一个无限循环，死循环
    //   System.out.println("hello world");
    // }

    // 3.环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开
    // 循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开。
    int count = 3;
    for(int a = 0,j = 0; a < count; a++ ,j += 2) {
      System.out.println("a=" + a + ",j=" + j);
    }
  }
}
