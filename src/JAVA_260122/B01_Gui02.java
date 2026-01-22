package JAVA_260122;

import javax.swing.*;

public class B01_Gui02 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Note");
        JPanel panel = new JPanel();

        JTextArea textArea = new JTextArea(10,30);
        JButton textBtn = new JButton("저장");

        panel.add(new JScrollPane(textArea));
        frame.add(panel);
        panel.add(textBtn);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        //----------------------------------------------------------

        textBtn.addActionListener(e -> {
            String content = textArea.getText();

            System.out.println("< 저장 내용 >");
            System.out.println(content);
        });

        //----------------------------------------------------------



    }
}
