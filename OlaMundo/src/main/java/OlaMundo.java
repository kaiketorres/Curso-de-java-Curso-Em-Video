import javax.swing.*;

public class OlaMundo {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Minha Aplicação Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JLabel label = new JLabel("Olá, Swing!");
        frame.add(label);


        label.setBounds(100, 80, 120, 30);


        frame.setVisible(true);
    }
}
