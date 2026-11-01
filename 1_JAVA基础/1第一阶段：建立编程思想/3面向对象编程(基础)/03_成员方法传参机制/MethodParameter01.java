
public class MethodParameter01 {
  public static void main(String[] args) { 
    int a = 10;
    int b = 20;
    AA aa = new AA();
    aa.swap(a, b);
    /*
    a和b交换前的值
    a=10    b=20

    a和b交换后的值
    a=20    b=10
    */ 

    // 基本数据类型，传递的是值(值拷贝)，形参的任何改变不影响实参!
    System.out.println("a=" + a + " b=" + b); //a=10 b=20
  }
}

class AA {
  public void swap(int a, int b) {
    System.out.println("\na和b交换前的值\na=" + a + "\tb=" + b);
    int temp = a;
    a = b;
    b = temp;
    System.out.println("\na和b交换后的值\na=" + a + "\tb=" + b);
  }
}
