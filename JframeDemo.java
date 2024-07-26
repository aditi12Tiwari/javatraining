import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JframeDemo {
    public static void main(String[] args){
        System.out.println("Jframe is used to build GUI Java Application");
        JFrame jFrame = new JFrame("BMI Calculator");


        JLabel userWeightLabel = new JLabel("Enter your weight in Kg :");
        userWeightLabel.setBounds(40,40,60,40);
        JTextField userWeighTextField = new JTextField("");
        userWeightLabel.setBounds(250,40,60,40);

        jFrame.add(userWeightLabel);
        jFrame.add(userWeighTextField);

        //to use the default layout
        jFrame.setLayout(null);
        //to add the size in frame
        jFrame.setSize(300,400);
        // to set the visible in frame 
        jFrame.setVisible(true);
    }
}
