import java.applet.Applet;
import java.awt.Graphics;


 //applet code=SimpleApplet.class width=300 height=150
 //applet


public class SimpleAppletLifecycle extends Applet {

     //This method is called when the applet is first loaded
    public void init() {
        System.out.println("Made by Aarav Goyal ERP 0251BCA116");
        System.out.println("Applet initialized");
    }

     //This method is called when the applet is started
    public void start() {
        System.out.println("Applet started");
    }

     //This method is called to paint the applet window
    public void paint(Graphics g) {
        g.drawString("Hello, this is a simple Java Applet!", 20, 50);
    }

     //This method is called when the applet is stopped
    public void stop() {
        System.out.println("Applet stopped");
    }

     //This method is called when the applet is destroyed
    public void destroy() {
        System.out.println("Applet destroyed");
    }
}
