package dev.goo.quadrilateralshape;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {
    @Test
    void getShapeType() {
        assertEquals(Solution.getShapeType(1,1,2,2,3,3,4,4),"not a quadrilateral");
        assertEquals(Solution.getShapeType(1,1,2,2,3,3,-1,-1),"not a quadrilateral");
        assertEquals(Solution.getShapeType(0,0,1,1,0,0,1,1),"not a quadrilateral");
        assertEquals(Solution.getShapeType(0,0,1,0,1,1,4,-5),"other（その他）");
        assertEquals(Solution.getShapeType(0,0,0,1,1,1,0,0),"not a quadrilateral");
        assertEquals(Solution.getShapeType(0,2,2,2,2,4,0,4),"square（正方形）");
        assertEquals(Solution.getShapeType(3,3,3,-3,-3,-3,-3,3),"square（正方形）");
        assertEquals(Solution.getShapeType(0,0,5,5,10,0,5,-5),"square（正方形）");
        assertEquals(Solution.getShapeType(0,0,5,0,8,4,3,4),"rhombus（ひし形）");
        assertEquals(Solution.getShapeType(-1,2,8,5,5,-4,-4,-7),"rhombus（ひし形）");
        assertEquals(Solution.getShapeType(2,7,1,3,-3,2,-2,6),"rhombus（ひし形）");
        assertEquals(Solution.getShapeType(0,0,5,0,5,8,0,8),"rectangle（長方形）");
        assertEquals(Solution.getShapeType(-7,2,5,6,7,0,-5,-4),"rectangle（長方形）");
        assertEquals(Solution.getShapeType(1,6,-5,-2,-1,-5,5,3),"rectangle（長方形）");
        assertEquals(Solution.getShapeType(0,0,5,0,8,8,3,8),"parallelogram（平行四辺形）");
        assertEquals(Solution.getShapeType(-1,5,3,3,6,-4,2,-2),"parallelogram（平行四辺形）");
        assertEquals(Solution.getShapeType(-4,3,5,6,2,-2,-7,-5),"parallelogram（平行四辺形）");
        assertEquals(Solution.getShapeType(-2,0,5,0,8,8,-1,8),"trapezoid（台形）");
        assertEquals(Solution.getShapeType(-1,5,-3,1,3,-2,3,3),"trapezoid（台形）");
        assertEquals(Solution.getShapeType(-3,3,1,5,4,-1,1,-5),"trapezoid（台形）");
        assertEquals(Solution.getShapeType(0,0,5,3,0,8,-5,3),"kite（凧）");
        assertEquals(Solution.getShapeType(-5,7,2,6,5,-3,-4,0),"kite（凧）");
        assertEquals(Solution.getShapeType(-1,5,3,1,-1,-1,-5,1),"kite（凧）");
        assertEquals(Solution.getShapeType(0,1,2,3,3,4,2,1),"not a quadrilateral");
        assertEquals(Solution.getShapeType(-2,1,2,6,3,4,4,2),"not a quadrilateral");
        assertEquals(Solution.getShapeType(-3,0,-2,6,-1,2,-2,1),"not a quadrilateral");
        assertEquals(Solution.getShapeType(0,0,8,0,10,12,2,6),"other（その他）");
        assertEquals(Solution.getShapeType(-2,5,4,2,4,-4,-4,-4),"other（その他）");
        assertEquals(Solution.getShapeType(0,0,1,2,3,2,1,1),"other（その他）");
    }
}