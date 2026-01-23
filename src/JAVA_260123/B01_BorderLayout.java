package JAVA_260123;

import javax.swing.*;
import java.awt.*;

public class B01_BorderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setLayout(new BorderLayout());

        frame.add(new JLabel("헤더",SwingConstants.CENTER), BorderLayout.NORTH);
        frame.add(new JButton("확인"), BorderLayout.SOUTH);
        frame.add(new JTextField("입력",10), BorderLayout.EAST);
        frame.add(new JCheckBox("선택"), BorderLayout.WEST);
        frame.add(new JTextArea(4,12), BorderLayout.CENTER);

        // 기본 옵션, (반복, 창 크기, 창 닫기, 창 보이기 기능)
        frame.setSize(350, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
