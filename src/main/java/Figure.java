public class Figure {
    public double squereArea(double n) {
        return Math.pow(n, 2);
    }
    public double circleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }
    public double triangleArea(double bottom,double hight){
        return bottom*hight/2;
    }
}
