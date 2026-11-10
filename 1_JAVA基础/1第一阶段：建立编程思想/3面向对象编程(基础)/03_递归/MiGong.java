// 迷宫问题
public class MiGong {
  public static void main(String[] args) {
    // 思路
    // 1.先创建迷宫，用二维数组表示 int[][] map = new int[8][7]
    // 2.//2.先规定 map数组的元秦值:0表示可以走1表示障碍物
    int[][] map = new int[8][7];
    map = DrawMap.drawMap(map);  
    showMap(map);
  }

  public static void showMap(int[][] map) {
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map[i].length; j++) {
        System.out.print(map[i][j] + " ");
      }
      System.out.println();
    }
  }
}

// 绘制迷宫地图
class DrawMap {
  public static int[][] drawMap(int[][] map) {
    
    // 3. 将最上面一行和最下面一行，全部设置为1
    for(int i = 0; i < map[0].length; i++) {
      map[0][i] = 1;
      map[map.length - 1][i] = 1;
    }
    // 4. 将最左面一行和最右面一行，全部设置为1
    for(int i = 0; i < map.length; i++) {
      map[i][0] = 1;
      map[i][map[i].length - 1] = 1;
    }
    // 5.设置随机障碍物，1表示障碍物
    map[3][1] = 1;
    map[3][2] = 1;

    return map;
  }
}

class T {
  // 使用递归回溯的思想来解决老鼠迷宫

  // 1.findWay方法就是专门来找出迷宫的路径
  // 2.如果找到，返回true，，否则返回false
  // 3.map就是二维数组，即表示迷宫
  // 4.i,j表示老鼠当前的位置
  // 5.因为我们是递归的找路,所以我先规定 map数组的各个值的含义
  // 0 表示可以走1 表示障碍物2 表示可以走31表示走过，但是走不通是死路
  // 6.当map[6][5]=2就说明找到通路，就可以结束，否则就继续找.
  // 7.先确定老鼠找路策略下->右->上->左
  public boolean findWay(int[][] map, int i, int j) {
    if(map[6][5] == 2) {
      return true;
    } else {
      if (map[i][j] == 0) { //当前这个位置0，说明表示可以走
        // 我们假定可以走通
        map[i][j] = 2;
        // //使用找路策略，来确定该位置是否真的可以走通
        //下->右->上->左
        if(findWay(map, i + 1, j)) {//先走下
          return true;
        } else if(findWay(map, i, j + 1)) {//右
          return true;

        }
      } else { //map[i][j] = 1,2,3 .0 表示可以走,1 表示障碍物,2 表示可以走 ,3表示走过但是走不通是死路
        return false;
      }
    }
  }
}

