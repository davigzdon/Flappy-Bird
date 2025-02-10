import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception{
        int boarWidth = 360;
        int boarHeight = 640;

        JFrame frame = new JFrame("FlappyBird");
        //frame.setVisible(true);
        frame.setSize(boarWidth, boarHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();//daca nu pui asta ti ar lua si title barul
        flappyBird.requestFocus();
        frame.setVisible(true);

    }
}