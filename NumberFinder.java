import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.*;

public class NumberFinder extends JFrame implements MouseListener {
    FlowLayout fl = new FlowLayout();
    Font font = new Font("Calibri",Font.BOLD,80);
    Font font1 = new Font("Calibri",Font.BOLD,40);
    JLabel lbl1 = new JLabel("1");
    JLabel lbl2 = new JLabel("2");
    JLabel lbl3 = new JLabel("3");
    JLabel lbl4 = new JLabel("4");
    JLabel lbl5 = new JLabel("5");
    JLabel lbl6 = new JLabel("6");
    JLabel lbl7 = new JLabel("7");
    JLabel lbl8 = new JLabel("8");
    JLabel lbl9 = new JLabel("9");
    JLabel lblDisplay = new JLabel();
    Random rnd = new Random();
    int num, ctr;


    public NumberFinder(){
        super("Number Finder");
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(fl);
        num = rnd.nextInt(2) + 1;
        //add
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(lbl4);
        add(lbl5);
        add(lbl6);
        add(lbl7);
        add(lbl8);
        add(lbl9);
        add(lblDisplay);
        //SetFont
        lbl1.setFont(font);
        lbl2.setFont(font);
        lbl3.setFont(font);
        lbl4.setFont(font);
        lbl5.setFont(font);
        lbl6.setFont(font);
        lbl7.setFont(font);
        lbl8.setFont(font);
        lbl9.setFont(font);
        lblDisplay.setFont(font1);
        //addMouseListener
        lbl1.addMouseListener(this);
        lbl2.addMouseListener(this);
        lbl3.addMouseListener(this);
        lbl4.addMouseListener(this);
        lbl5.addMouseListener(this);
        lbl6.addMouseListener(this);
        lbl7.addMouseListener(this);
        lbl8.addMouseListener(this);
        lbl9.addMouseListener(this);
        lblDisplay.addMouseListener(this);



    }
    public static void main(String [] args){
        new NumberFinder().setVisible(true) ;
    }
    public void mouseClicked(MouseEvent e){
        if(e.getSource()== lbl1){
            if(Integer.parseInt(lbl1.getText())== num){
                lblDisplay.setText("Correct" + ++ctr + "attemp (s)" );
            }else{
                lbl1.setEnabled(false);
                lblDisplay.setText("Try Again :)");

            }

        }else if (e.getSource() == lbl2){
            System.out.println("wow");
        }else{
            lbl2.setEnabled(false);
            ++ctr;
            lblDisplay.setText("Try Again! :)");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}
    public void mouseExited(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}

}
