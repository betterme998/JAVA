public  class OverLoad01 {

  public static void main(String[] args) {

    /*
    方法重载  
    基本介绍
    java中允许同一个类中，多个同名方法的存在，但要求 形参列表不一致!  
    比如:System.out.println; out是PrintStream类型

    案例:类:MyCalculator 方法:calculate
    ·calculate(int n1,int n2)//两个整数的和
    calculate(int n1,double n2)//-个整数,一个double的和
    calculate(double n2, int n1)//-个double,-个Int和
    calculate(int n1, int n2,int n3)//三个int和
    */ 
    System.out.println("Hello World!");
    System.out.println("Hello World!");
    System.out.println(10);
    System.out.println(10.5);

    class MyCalculator {
      // 两个整数的和
      public int calculate(int n1, int n2) {
        return n1 + n2;
      }

      // 一个整数，一个double的和
      public double calculate(int n1, double n2) {
        return n1 + n2;
      }
      public double calculate(double n2, int n1) {
        return n2 + n1;
      }
      public int calculate(int n1, int n2, int n3) {
        return n1 + n2 + n3;
      } 

      // zhengy
      
    }
  }
}