import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

 

public class numberguessinggame {
    public static void main(String[] args) {
         JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setSize(new Dimension(300, 150));
        panel.setLayout(null);
         JLabel label = new JLabel("Guess a Number between [1- 100]");
        label.setForeground(new Color(255, 255, 0));
        label.setHorizontalAlignment(SwingConstants.LEFT);
        label.setFont(new Font("Arial", Font.BOLD, 11));
        label.setBounds(0, 0, 270, 30);
        panel.add(label);
         UIManager.put("OptionPane.minimumSize",new Dimension(250, 130));

 

        int comp = (int) (Math.random()*100 + 1);
        int ans = 0;
        int count = 1;
        while (ans != comp)
        {
            String response = JOptionPane.showInputDialog(null,panel,
                "Guess ", 3);
            ans = Integer.parseInt(response);
            if(count>10){
                JOptionPane.showMessageDialog(null,""+"Sorry, Your chances are Completed\n Better luck next time");
                break;
            }
            else{
            JOptionPane.showMessageDialog(null, ""+ Guess(ans, comp, count));
            }
            count++;

 

        }  
    }

 

    public static String Guess(int ans, int computerNumber, int count){
        if (ans<=0 || ans>100) {
            return "Your guess is invalid";
        }
        else if (ans == computerNumber ){
            if(count<5){
                return "Great!!\nyour Total guesses: "+ count;
            }
            return "Correct!\nTotal Guesses: " + count;
        }
        else if (ans > computerNumber) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }
        else if (ans < computerNumber) {
            return "Your guess is too low, try again.\nTry Number: " + count;
        }
        else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}
