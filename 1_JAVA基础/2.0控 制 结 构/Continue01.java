// 跳转控制语句-continue
// javac encoding UTF-8 Continue01.java
// java Continue01
/*
continue语句用于结束本次循环，继续执行下一次循环。  
continue语句出现在多层嵌套的循环语句体中时，可以通过标签指明要跳过的是哪一层循环，这个和前面的标签的使用的规则一样.
*/ 
public class Continue01 {
  public static void  main(String[] args) {
    int i = 1;
    while (i <= 4) {
      i++;
      if (i == 2) {
        continue; // 跳过本次循环，继续下一次循环
      }
        System.out.println("i = " + i);

    }

    label1:
    for(int j = 0; j < 4; j++) {
      label2:
      for(int f = 0; f < 10; f++) {
        if (f == 2) {
          continue label1; // 跳过整个外层循环，继续下一次外层循环
        }
        System.out.println("j = " + j);
      }
    }
  }
}
