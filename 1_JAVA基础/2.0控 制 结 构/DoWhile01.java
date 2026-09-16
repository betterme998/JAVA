// do..while循环控制
// javac encoding UTF-8 DoWhile01.java
// java DoWhile01
/*
1.do while 是关键字  
1.也有循环四要素，只是位置不一样  
2.先执行，再判断，也就是说，一定会执行一次  
3.最后有一个分号;  
*/ 
public class DoWhile01 {
  public static  void  main(String[] args) {
    // 输出10句，你好
    int i = 0;
    do {
      System.out.println("你好");
      i++;
    }while (i < 10);
    System.out.println("循环结束");

    // 1)打印1一100[学生做]
    // 2)计算1一100的和[学生做]
    int sum = 0;
    int j = 1;
    do {
      sum += j;
      System.out.println(j);
      j++;
    }while (j <=100);
    System.out.println("和为:" + sum);

    // 3)统计1--200之间能被5整除但不能被3整除的个数
    int count = 0;
    int k = 1;
    

    // 如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止[System.out.println("老韩问:还钱吗? y/n")] do...while
  }
}
