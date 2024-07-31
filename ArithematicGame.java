import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ArithematicGame {
     static int counter=0;
    public static void main(String[] args){
     JFrame frame = new JFrame("Arithematic Game");

     JLabel score = new JLabel("Score");
     JLabel timer = new JLabel("Time Left : ");
     JLabel randomNo1 = new JLabel();
     JLabel randomNo2 = new JLabel();
     JButton next = new JButton("Next");
     JTextField output = new JTextField();

    randomNo1.setBounds(50,50,100,150);
    randomNo2.setBounds(50,90,100,150);
    output.setBounds(100,80,200,200);
    next.setBounds();
    score.setBounds();
    timer.setBounds();


    frame.add(score);
    frame.add(timer);
    frame.add(randomNo1);
    frame.add(randomNo2);
    frame.add(next);
    frame.add(output);


    frame.setLayout("null");
    frame.setSize(500,600);
    frame.setVisible(true);

    Random random = new Random();

    generateQuestion(random,randomNo1,randomNo2){

        Timer timer = new Timer(1000,new ActionListener() {
        public void actionPerformed(ActionEvent e){
          counter--;
          if (counter <= 0) {
                    timer.stop();
                    next.setEnabled(false);
                    JOptionPane.showMessageDialog(frame, "Time's up! Final Score: " + score);
                }

            }   
        });
   
    }timer.start();


    output.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        try{
            if(output.getText().isEmpty())
        }
        }
    })
    }
}
