
package td2;

/**
 *
 * @author pro
 */
public class Segment {

    private Point ext1, ext2;

    public void setExt1(Point ext1) {
        this.ext1 = ext1;
    }

    public void setExt2(Point ext2) {
        this.ext2 = ext2;
    }

    public Point getExt1() {
        return ext1;
    }

    public Point getExt2() {
        return ext2;
    }

    public Segment(Point ext1, Point ext2) {
        this.ext1 = ext1;
        this.ext2 = ext2;
    }

    public Segment(Point ext2) {
        this.ext1 = new Point();
        this.ext2 = ext2;
    }

    public Segment symetrie() {
        return new Segment(ext1.symetrie(), ext2.symetrie());
    }

    @Override
    public String toString() {
        return "Segment{" + "ext1=" + ext1 + ", ext2=" + ext2 + '}';
    }

   
    public double distance() {
        return Math.sqrt(Math.pow((ext2.getX() - ext1.getX()), 2) + 
                Math.pow((ext2.getY() - ext1.getY()), 2));
    }
}
