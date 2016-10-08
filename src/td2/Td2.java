

package td2;

/**
 *
 * @author pro
 */
public class Td2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point A = new Point();
        Point B = new Point(5);
        Point C = new Point(3, 8);
        Segment AB = new Segment(B);
        Segment BC = new Segment(B, C);
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("l'image de A:" + A.symetrie());
        System.out.println("l'image de B:" + B.symetrie());
        System.out.println("l'image de C:" + C.symetrie());
        System.out.println("AB: " + AB + " longueur=" + AB.distance());
        System.out.println("BC: " + BC + " longueur=" + BC.distance());
        System.out.println("l'image de AB:" + AB.symetrie());
        System.out.println("l'image de BC:" + BC.symetrie());
        Cercle cer1 = new Cercle(AB);
        System.out.println("cer1= " + cer1);
        System.out.println("l'image de cer1:" + cer1.symetrie());
        Cercle cer2 = new Cercle(C, BC);
        System.out.println("cer2= " + cer2);
        System.out.println("l'image de cer2:" + cer2.symetrie());
    }

}
