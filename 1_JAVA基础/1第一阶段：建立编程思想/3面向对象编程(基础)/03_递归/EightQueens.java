/*
八皇后问题说明  
八皇后问题，是一个古老而著名的问题，是回溯算法的典型案例。  
该问题是国际西洋棋棋手马克斯·贝瑟尔于1848年提出:在8x8格的国际象棋上摆放八个皇后，使其不能互相攻击，  
即:任意两个皇后都不能处于同一行、同一列或同一斜线上，问有多少种摆法。

1.第一个皇后先放第一行第一列  
2.第二个皇后放在第二行第一列、然后判断是否OK，如果不OK，继续放在第二列、第三列、依次把所有列都放完，找到一个合适  
3.继续第三个皇后，还是第一列、第二列......直到第8个皇后也能放在一个不冲突的位置，算是找到了一个正确解  
4.当得到一个正确解时，在栈回退到上一个栈时，就会开始回溯，即将第一个皇后，放到第一列的所有正确解，全部得到.  
5.然后回头继续第一个皇后放第二列，后面继续循环执行1,2,3,4的步骤【示意图】

说明:理论上应该创建一个二维数组来表示棋盘，但是实际上可以通
过算法，用一个一维数组即可解决问题.arr[8]={0，4,7,5,2,6,1,
3)//对应arr 下标表示第几行，即第几个皇后，arr[i]=val，val表
示第i+1个皇后，放在第i+1行的第val+1列
*/ 
public class EightQueens {
  public static void main(String[] args) {
    int[] n = new  int[8];
    T t = new T();
    t.arrange(n);

    System.out.println("八皇后共有 " + t.getCount() + " 种摆法");
  }
}

class T {
  private int[] arr;//arr[i]表示第i行皇后所在的列
  private int count = 0;

  public void arrange(int[] n) {
    this.arr = n;
    this.count = 0;
    place(0); //从第0行开始放皇后
  } 

  // 放置第row行的皇后
  private void place(int row) {
    // 8个皇后都已经放好，说明找到一个解
    if (row == arr.length) {
      count++;
      // 如果需要打印每一种解，取消下面这行注释
      printSolution();
      return;
    }

    // 尝试当前行的每一列
    for (int col = 0; col < arr.length; col++) {
      arr[row] = col;

      // 如果当前位置不冲突，就继续放下一行
      if (check(row)) {
        place(row + 1);
      }
    }
  }
  //  判断第 row 行的皇后是否与前面已经放好的皇后冲突
  private boolean check(int row) {
    for (int i = 0; i < row; i++) {
      if (arr[i] == arr[row]) {
        return false; // 同列
      }

      // 斜线
      if (Math.abs(row - i) == Math.abs(arr[row] - arr[i])) {
        return false;
      }
    }
    return true;
  }
  public int getCount() {
    return count;
  }

  /**
     * 打印一种解
     */
    private void printSolution() {
        System.out.println("第 " + count + " 种解：");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
