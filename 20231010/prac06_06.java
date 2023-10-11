package _20231010;

public class prac06_06 {
    
    // 두 점 사이의 거리 공식

    static double getDistance(int x, int y, int x1, int y1) {
        return Math.sqrt((x - x1) * (x - x1) + (y - y1) * (y - y1));
    }

    public static void main(String args[]) {
        System.out.println(getDistance(1, 1, 2, 2));
    }
}
