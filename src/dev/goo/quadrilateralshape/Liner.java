package dev.goo.quadrilateralshape;

public class Liner {
    private Point start;
    private Point end;
    private double lengthSquare;
    private double slope;

    public Liner(Point start, Point end) {
        this.start = start;
        this.end = end;
        this.lengthSquare = Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2);
        this.slope = end.getX() - start.getX() == 0 ? Double.POSITIVE_INFINITY :
                (end.getY() - start.getY()) / (end.getX() - start.getX());
    }

    public double getSlope() {
        return slope;
    }

    public boolean isLiner() {
        return !start.equals(end);
    }

    public double getLengthSquare() {
        return this.lengthSquare;
    }

    public boolean isOrthogonalLiner(Liner l) {
        if(this.slope == 0) {
            return l.getSlope() == Double.POSITIVE_INFINITY;
        }
        if(this.slope == Double.POSITIVE_INFINITY) {
            return l.getSlope() == 0;
        }
        return this.slope * l.getSlope() == -1;
    }

    public boolean isParallelLiner(Liner l) {
        return this.slope == l.getSlope();
    }
}
