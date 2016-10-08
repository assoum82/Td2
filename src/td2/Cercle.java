
package td2;

/**
 *
 * @author pro
 */
public class Cercle {
   private Segment rayon; 
   private Point c;

    public Cercle(Point c,Segment rayon ) {
        this.rayon = rayon;
        this.c = c;
    }

    public Cercle(Segment rayon)  {
        this.rayon = rayon;
        this.c=new Point();
    }

    public Segment getRayon() {
        return rayon;
    }

    public Point getC() {
        return c;
    }

    public void setRayon(Segment rayon) {
        this.rayon = rayon;
    }

    public void setC(Point c, Segment rayon) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Cercle{" + "rayon=" + rayon + ", c=" + c + '}';
    }
   public Cercle symetrie(){
       return new Cercle(c.symetrie(),rayon);
   }
}
