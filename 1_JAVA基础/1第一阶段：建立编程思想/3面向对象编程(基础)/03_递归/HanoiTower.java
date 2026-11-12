
/*


汉诺塔
汉诺塔:汉诺塔(又称河内塔)问题是源于印度一个古老传说的益智玩具。
大梵天创造世界的时候做了三根金刚石柱子，在一根柱子上从下往上按照大小顺序摞着64片圆盘。
大梵天命令婆罗门把圆盘从下面开始按大小顺序重新摆放在另一根柱子上。
并且规定，在小圆盘上不能放大圆盘，在三根柱子之间一次只能移动一个圆盘。
*/ 
public class HanoiTower {
  // 编写一个main方法
  public static void main(String[] args) {
    T tower = new T();
    tower.move(5, 'A', 'B', 'C');
  }
}

class T {
  // num 表示要移动的个数 a,b,c 分别表示A,B,C三柱子
  public void move(int num, char a, char b, char c) {
    // 如果只有一个盘 num = 1
    if(num ==1) {
      System.out.println(a + "-->" + c);
    } else {
      // 如果有多个盘，可以看出两个，最下面的和上面的所以盘
      // 1.先移动上面所有的盘到b,借助c
      move(num -1,a, c, b);
      // 2.移动最下面的盘到c
      System.out.println(a + "-->" + c);
      // (3)再把b塔的所有盘，移动到c，借助a
      move(num - 1, b, a, c);
    }
  }
}


