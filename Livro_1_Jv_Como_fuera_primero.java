import java.awt.*;
import java.awt.event.*;
import java.util.Iterator;
import java.util.ArrayList;


// cosas ya echas
abstract class Geometria {
    public abstract double perimetro();
    public abstract double area();
}

interface Dibujable {
    public void setPosicion(double x, double y);
    public void dibujar(Graphics dw);
}


class Circulo extends Geometria {
    public static final double PI = 3.14159265358979323846;
    public double x, y, r;

    public Circulo() { this(0.0, 0.0, 1.0); }
    public Circulo(double x, double y, double r) {
        this.x = x; this.y = y; this.r = r;
    }

    public double perimetro() { return 2.0 * PI * r; }
    public double area() { return PI * r * r; }

    public Circulo elMayor(Circulo c) {
        return (this.r >= c.r) ? this : c;
    }

    public static Circulo elMayor(Circulo c, Circulo d) {
        return (c.r >= d.r) ? c : d;
    }
}

class Rectangulo extends Geometria {
    protected double x1, y1, x2, y2;

    public Rectangulo(double p1x, double p1y, double p2x, double p2y) {
        x1 = p1x; x2 = p2x; y1 = p1y; y2 = p2y;
    }

    public double perimetro() { return 2.0 * ((x1 - x2) + (y1 - y2)); }
    public double area() { return (x1 - x2) * (y1 - y2); }
}


class CirculoGrafico extends Circulo implements Dibujable {
    Color color;

    public CirculoGrafico(double x, double y, double r, Color unColor) {
        super(x, y, r);
        this.color = unColor;
    }

    public void dibujar(Graphics dw) {
        dw.setColor(color);
        dw.drawOval((int)(x - r), (int)(y - r), (int)(2 * r), (int)(2 * r));
    }

    public void setPosicion(double x, double y) {}
}

class RectanguloGrafico extends Rectangulo implements Dibujable {
    Color color;

    public RectanguloGrafico(double x1, double y1, double x2, double y2, Color unColor) {
        super(x1, y1, x2, y2);
        this.color = unColor;
    }

    public void dibujar(Graphics dw) {
        dw.setColor(color);
        dw.drawRect((int)x1, (int)y1, (int)(x2 - x1), (int)(y2 - y1));
    }

    public void setPosicion(double x, double y) {}
}

class PanelDibujo extends Panel {
    private ArrayList v;

    public PanelDibujo(ArrayList va) {
        super(new FlowLayout());
        this.v = va;
    }

    public void paint(Graphics g) {
        Dibujable dib;
        Iterator it = v.iterator();
        while (it.hasNext()) {
            dib = (Dibujable)it.next();
            dib.dibujar(g);
        }
    }
}

class VentanaCerrable extends Frame implements WindowListener {
    public VentanaCerrable(String title) {
        super(title);
        setSize(500, 500);
        addWindowListener(this);
    }

    public void windowClosing(WindowEvent e) { System.exit(0); }
    public void windowActivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}
}

public class Livro_1_Jv_Como_fuera_primero {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Comienza");
        Circulo c = new Circulo(2.0, 2.0, 4.0);
        System.out.println("Radio = " + c.r + " unidades.");
        System.out.println("Centro = (" + c.x + "," + c.y + ") unidades.");
        Circulo c1 = new Circulo(1.0, 1.0, 2.0);
        Circulo c2= new Circulo(0.0, 0.0, 3.0);
        
        c = c1.elMayor(c2);
        System.out.println("El mayor Radio es " + c.r + ".");
        c = new Circulo();
        c = Circulo.elMayor(c1,c2);
        System.out.println("El mayor radio es " + c.r + ".");
        VentanaCerrable ventana = new VentanaCerrable("Ventana Abierta Al Mundo");
        ArrayList v = new ArrayList();
        
        CirculoGrafico cg1 = new CirculoGrafico(200,200,100, Color.red);
        CirculoGrafico cg2 = new CirculoGrafico(300,200,100, Color.blue);

        RectanguloGrafico rg = new RectanguloGrafico(50,50,450,3350, Color.green);

        v.add(cg1);
        v.add(cg2);
        v.add(rg);

        PanelDibujo mipanel = new PanelDibujo(v);
        ventana.add(mipanel);
        ventana.setSize(500,400);
        ventana.setVisible(true);
        System.out.println("Termina main()...");
    }
}