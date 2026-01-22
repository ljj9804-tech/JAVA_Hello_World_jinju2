package JAVA_260122;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B01_Gui01 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Hi :)");

        JPanel panel = new JPanel();

        JLabel nameLabel = new JLabel("이름 입력 : ");
        JTextField nameTextField = new JTextField(10);
        JButton exitBtn  = new JButton("나가기");


        frame.add(panel);
        panel.add(nameLabel);
        panel.add(nameTextField);
        panel.add(exitBtn);


        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        exitBtn.addActionListener(new ActionListener() { // 익명클래스 구현
            @Override
            public void actionPerformed(ActionEvent e) {
// 클릭시 동작할 기능 넣기. 창닫기.
                frame.dispose();
            }
        });

    }
}
