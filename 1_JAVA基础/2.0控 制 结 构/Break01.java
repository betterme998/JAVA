// 跳转控制语句-break 
// javac encoding UTF-8 Break01.java
// java Break01
/*
跳转控制语句-break  
基本介绍：braek语句用于终止某个语句的执行，一般用在switch或者[for, while, do..while]中，
*/ 
public class Break01 {
  public static  void  main(String[] args) {
    for (int i = 0; i<10; i++) {
      if (i == 3) {
        break;
      }
      System.out.println("ok" + i);
    }

    abc1://这个给循环取名字
    for(int j = 0; j < 4; j++) {
    abc2:
      for(int i = 0; i < 10; i++) {
        if (i == 3) {
          break abc1;//跳出指定循环
        }
        System.out.println("ok1" + i); //ok10 ok11 ok12

      }

    }
  }
}
