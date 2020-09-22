package MVC;

import javax.swing.*;

public class BeatBar extends JProgressBar implements Runnable {
    Thread thread;

    public BeatBar() {
        thread = new Thread(this);
        setMaximum(100);
        thread.start();
    }

    public void run() {
        while (true) {
            int value = getValue();
            value = (int)(value*0.75);
            setValue(value);
            repaint();
            try {
                Thread.sleep(100);
            } catch (Exception e) { }
        }
    }
}
