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

