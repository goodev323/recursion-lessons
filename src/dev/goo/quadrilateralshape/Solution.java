package dev.goo.quadrilateralshape;

public class Solution {
    public static String getShapeType(int ax, int ay, int bx, int by, int cx, int cy, int dx, int dy) {
        Point pa = new Point(ax, ay);
        Point pb = new Point(bx, by);
        Point pc = new Point(cx, cy);
        Point pd = new Point(dx, dy);
        Liner lineAB = new Liner(pa, pb);
        Liner lineBC = new Liner(pb, pc);
        Liner lineCD = new Liner(pc, pd);
        Liner lineDA = new Liner(pd, pa);
        Liner lineAC = new Liner(pa, pc);
        Liner lineBD = new Liner(pb, pd);

        if (!isValidQuadrilateral(lineAB, lineBC, lineCD, lineDA)) {
            return "not a quadrilateral";
        }
        if (lineAB.isParallelLiner(lineCD) || lineBC.isParallelLiner(lineDA)) {
            if(lineAB.isParallelLiner(lineCD) && lineBC.isParallelLiner(lineDA)) {
                if (lineAB.isOrthogonalLiner(lineBC)) {
                    if (lineAB.getLengthSquare() == lineBC.getLengthSquare()) {
                        return "square（正方形）";
                    }
                    return "rectangle（長方形）";
                }
                if (lineAC.isOrthogonalLiner(lineBD)) {
                    return "rhombus（ひし形）";
                }
                return "parallelogram（平行四辺形）";
            }
            return "trapezoid（台形）";
        }
        if(lineAC.isOrthogonalLiner(lineBD)) {
            return "kite（凧）";
        }
        return "other（その他）";
    }

    public static boolean isValidQuadrilateral(Liner la, Liner lb, Liner lc, Liner ld) {
        if (!la.isLiner() || !lb.isLiner() || !lc.isLiner() || !ld.isLiner()) {
            return false;
        }
        if (la.getSlope() == lb.getSlope()
                || lb.getSlope() == lc.getSlope()
                || lc.getSlope() == ld.getSlope()
                || ld.getSlope() == lc.getSlope()
        ) {
            return false;
        }
        return true;
    }
}
