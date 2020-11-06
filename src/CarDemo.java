import javax.swing.*;

public class CarDemo extends Thread{
    private JFrame jFrame;
    private JButton jButton;

    public CarDemo() {
        jFrame = new JFrame("赛车");
        jFrame.setBounds(200,200,1500,800);
        jFrame.setLayout(null);
        jButton = new JButton("波哥");
        jButton.setBounds(20,20,80,30);
        jFrame.add(jButton);
        jFrame.setVisible(true);
    }
    public void run(){
      int x = 20;
      for (;;){

           if (x==1420){
              x = -80;
          }
          jButton.setBounds(x++,20,80,30);
      }
    }

    public static void main(String[] args) {
        CarDemo carDemo = new CarDemo();
        carDemo.start();
    }
}
