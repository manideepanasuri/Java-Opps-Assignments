import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q1 implements ActionListener{
  JFrame F;
  JTextField t=new JTextField("hi");
  JButton[] Buttons1_9;
  JButton add=new JButton("+");
  JButton mul=new JButton("x");
  JButton sub=new JButton("-");
  JButton div=new JButton("/");
  JButton equal=new JButton("=");
  JButton clear=new JButton("AC");
  int num1=0;
  int num2=0;
  String s="";
  String actualnum="";
  String sign="";
  boolean which=false;

  Q1(){
    F=new JFrame();
    F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    F.setTitle("Calculator");
    F.setBounds(0,0,300,300);
    JPanel Pover=new JPanel();
    Pover.setLayout(new BoxLayout(Pover, BoxLayout.Y_AXIS));
    JPanel P2=new JPanel();
    P2.setLayout(new GridLayout(4,5,10,10));
    JPanel P1=new JPanel();
    P1.add(t);
    P1.setLayout(new GridLayout());
    Pover.add(P1);
    //Pover.add(Box.createRigidArea(new Dimension(0, 5)));
    Pover.add(P2);
    t.setEditable(false);
    t.setFont(new Font("arial", 1, 25));
    t.setSize(1000, 30);
    t.setHorizontalAlignment(SwingConstants.RIGHT);
    Buttons1_9=new JButton[10];
    for(int i=0;i<10;i++){
      Buttons1_9[i]=new JButton(Integer.toString(i));
      Buttons1_9[i].addActionListener(this);
      P2.add(Buttons1_9[i]);
    }
    P2.add(add);
    P2.add(sub);
    P2.add(mul);
    P2.add(div);
    P2.add(clear);
    P2.add(equal);
    add.addActionListener(this);
    mul.addActionListener(this);
    div.addActionListener(this);
    sub.addActionListener(this);
    clear.addActionListener(this);
    equal.addActionListener(this);

    F.add(Pover);
    F.setBounds(0,0,300,300);
    F.setVisible(true);
  }

  public void actionPerformed(ActionEvent e){
    System.out.println(e.getActionCommand());
    String res=e.getActionCommand();
    int result=(int)res.charAt(0)-(int)'0';
    if(result>=0&&result<=9){
      s+=e.getActionCommand();
      actualnum+=e.getActionCommand();
      t.setText(s);
    }
    //System.out.println(e.getSource());
    if(e.getActionCommand().equals("+")){
      int num=Integer.parseInt(actualnum);
      if(!which){num1=num;}
      else{
        num1=check(num1, num, sign);
      }
      actualnum="";
      which=true;
      s=Integer.toString(num1);
      sign="+";
      s+=sign;
      t.setText(s);
    }
    if(e.getActionCommand().equals("-")){
      int num=Integer.parseInt(actualnum);
      if(!which){num1=num;}
      else{
        num1=check(num1, num, sign);
      }
      actualnum="";
      which=true;
      s=Integer.toString(num1);
      sign="-";
      s+=sign;
      t.setText(s);
    }
    if(e.getActionCommand().equals("x")){
      int num=Integer.parseInt(actualnum);
      if(!which){num1=num;}
      else{
        num1=check(num1, num, sign);
      }
      actualnum="";
      which=true;
      s=Integer.toString(num1);
      sign="x";
      s+=sign;
      t.setText(s);
    }
    if(e.getActionCommand().equals("/")){
      int num=Integer.parseInt(actualnum);
      if(!which){num1=num;}
      else{
        num1=check(num1, num, sign);
      }
      actualnum="";
      which=true;
      s=Integer.toString(num1);
      sign="/";
      s+=sign;
      t.setText(s);
    }
    if(e.getSource().equals(equal)){
      int num=Integer.parseInt(actualnum);
      if(!which){num1=num;}
      else{
        num1=check(num1, num, sign);
      }
      actualnum="";
      which=false;
      s=Integer.toString(num1);
      sign="";
      s+=sign;
      t.setText(s);
    }
    if(e.getSource().equals(clear)){      
      sign="";
      s="";
      actualnum="";
      num1=0;
      which=false;
      t.setText("");
    }
  }
  public int check(int num11,int num12,String sig){
    if(sig.equals("+")){
      return num11+num12;
    }
    if(sig.equals("-")){
      return num11-num12;
    }
    if(sig.equals("x")){
      return num11*num12;
    }
    if(sig.equals("/")){
      if(num12==0){
        t.setText("Not valid");
        
      }
      return num11/num12;
    }
    if(s.equals("")){return num11;}
    return 0;
  }

  public static void main(String[] args){
    Q1 temp=new Q1();
  }

}


