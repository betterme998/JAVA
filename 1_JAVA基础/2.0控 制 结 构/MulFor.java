/*
多重循环控制(难点!重点!)  
1.将一个循环放在另一个循环体内，就形成了嵌套循环。其中，for,while，do...while均可以作为外层循环和内层循环。[建议一般使用两层，最多不要超过3层，否则，代码的可读
性很差】

2.实质上，嵌套循环就是把内层循环当成外层循环的循环体。当只有内层循环的循环条件为false时，才会完全跳出内层循环，才可结束外层的当次循环，开始下一次的循环
*/ 
// 编码 javac -encoding UTF-8 MulFor.java
// 运行 java MulFor
public  class MulFor {
  public  static void main(String[] args) {
    for(int i = 0; i < 2; i++){
      for(int j = 0; j < 3; j++) {
        System.out.println("i=" + i + "j =" + j);
      }
    }
  }
}