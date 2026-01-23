package JAVA_260123;

import javax.swing.*;
import java.awt.*;

public class A_FlowTest {
    public static void main(String[] args) {
        // 컨테이너 생성
        JFrame frame = new JFrame("FlowLayout Test");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));

        panel.add(new JLabel("이름:"));

        JTextField textField = new JTextField(8);
        panel.add(textField);

        JButton btn = new JButton("검색");
        panel.add(btn);

        btn.addActionListener(e -> {
            String inputText = textField.getText();
            System.out.println(textField.getText());
        });

        frame.add(panel);
        frame.setSize(300,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
