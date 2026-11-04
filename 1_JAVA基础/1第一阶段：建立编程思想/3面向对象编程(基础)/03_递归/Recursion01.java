
public class Recursion01 {
  public static void main(String[] args) {
    T t = new T();
    t.test(10);
    t.factorial(3);
    System.out.println(t.factorial(3));
  }
}

class T {
  // 分析打印问题
  public  void  test(int n) {
    if(n > 2) {
      test(n - 1);
    }
    System.out.println("n = " + n);
    /*
    因为n > 2，所以会进入if语句，一直调用test方法，直到n等于2，然后开始执行后面的语句。所以条件不满足才执行到后面的语句，再逐个往上回溯，打印出所有的n值。
    n = 2
    n = 3
    n = 4
    n = 5
    n = 6
    n = 7
    n = 8
    n = 9
    n = 10
    */ 
  }

  // 阶乘问题
  public int factorial(int n) {
    if (n == 1) {
      return 1;
    } else {
      return factorial(n-1) * n;
    }
    // 6  
    // 每一次执行到factorial(n-1)时都会在栈中创建一个对象，从n到1，最后从1向上返回到n的阶乘（一层一层的返回）factorial(n-1)的值。返回给上一层
  }
}
