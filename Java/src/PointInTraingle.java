package src;

public class PointInTraingle {

    static Double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        return Math.abs((x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))/2.0);
    }

    static boolean isInside(int x1, int y1, int x2, int y2, int x3, int y3, int x, int y) {

        Double A = area(x1,y1,x2,y2,x3,y3);

        Double A1 = area(x,y,x2,y2,x3,y3);

        Double A2 = area(x1,y1,x,y,x3,y3);

        Double A3 = area(x1,y1,x2,y2,x,y);

        if(A == A1+A2+A3){
            return true;
        }
        return false;
    }
    public static void main(String s[]){
        if (isInside(0, 0, 20, 0, 10, 30, 10, 15))
            System.out.println("Inside");
        else
            System.out.println("Not Inside");
    }
}
