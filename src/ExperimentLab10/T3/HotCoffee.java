package ExperimentLab10.T3;

import javafx.collections.ListChangeListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class HotCoffee extends JFrame {
    private JFrame jFrame;
    private JPanel panel;
    private JSlider jSlider;
    private JButton jButton;
    private JScrollPane jScrollPane;

    public static void main(String[] args){
        HotCoffee hot = new HotCoffee();
    }
    public HotCoffee(){

        jFrame = new JFrame();

        panel = new JPanel();
        jScrollPane = new JScrollPane();
        jButton = new JButton("Check");

        jSlider = new JSlider(JSlider.HORIZONTAL,150,250,190);
        jSlider.setMajorTickSpacing(10);
        jSlider.setMinorTickSpacing(1);
        jSlider.setPaintTicks(true);
        jSlider.setPaintLabels(true);
        jSlider.setBounds(10,10,260,50);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setTitle("Hot Coffee");
        jFrame.setSize(700,600);
            panel.add(jButton);
        jFrame.setLocation(100,300);
        jFrame.add(jSlider);
        jFrame.add(panel, BorderLayout.SOUTH);
        jFrame.setVisible(true);
        jButton.addActionListener(x -> stateChanged());
    }

    public void stateChanged(){
        try{
            check();
            JOptionPane.showMessageDialog(null,"温度适合","提示",JOptionPane.WARNING_MESSAGE);
        }catch (TooHotException hot){
            hot.printStackTrace();
            JOptionPane.showMessageDialog(null,"过烫","提示",JOptionPane.WARNING_MESSAGE);
        }catch (TooColdException cold){
            JOptionPane.showMessageDialog(null,"过冷","提示",JOptionPane.WARNING_MESSAGE);
        }
    }


    public void check() throws TooColdException,TooHotException{

        if (jSlider.getValue()<190){
            throw new TooColdException("It too Cold!");
        }else if(jSlider.getValue()>200){
            throw new TooHotException("It too Hot!");
        }
    }

    class TooColdException extends Exception{
        public TooColdException(){
            super();
        }
        public TooColdException(String message){
            super(message);
        }
        public TooColdException(Throwable cause){
            super(cause);
        }
    }

    class TooHotException extends Exception{
        public TooHotException(){
            super();
        }
        public TooHotException(String message){
            super(message);
        }
        public TooHotException(Throwable cause){
            super(cause);
        }
    }

}
