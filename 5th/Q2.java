import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class Q2 {
  JFrame f=new JFrame();
  Q2(){
    f.setTitle("NotePad");
    f.setBounds(0,0,600,600);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

    JMenuBar mb=new JMenuBar();
    JMenu File=new JMenu("File");
    JMenu Edit=new JMenu("Edit");
    JMenu Settings=new JMenu("Settings");
    JMenu Lang=new JMenu("Languages");
    mb.add(File);
    mb.add(Edit);
    mb.add(Settings);
    mb.add(Lang);
    JTextArea txt=new JTextArea();
    JMenuItem F1=new JMenuItem("New");
    JMenuItem F2=new JMenuItem("Open");
    JMenuItem F3=new JMenuItem("Save");
    JMenuItem F4=new JMenuItem("Delete");
    JMenuItem F5=new JMenuItem("Print");
    File.add(F1);
    File.add(F2);
    File.add(F3);
    File.add(F4);
    File.add(F5);


    JMenuItem E1=new JMenuItem("Cut");
    JMenuItem E2=new JMenuItem("Copy");
    JMenuItem E3=new JMenuItem("Paste");
    JMenuItem E4=new JMenuItem("Convert Case");
    JMenuItem E5=new JMenuItem("Undo");
    Edit.add(E1);
    Edit.add(E2);
    Edit.add(E3);
    Edit.add(E4);
    Edit.add(E5);

    JMenuItem S1=new JMenuItem("Import");
    JMenuItem S2=new JMenuItem("Change Background");
    JMenuItem S3=new JMenuItem("Apply Theme");
    Settings.add(S1);
    Settings.add(S2);
    Settings.add(S3);


    JMenuItem L1=new JMenuItem("C");
    JMenuItem L2=new JMenuItem("C++");
    JMenuItem L3=new JMenuItem("Java");
    JMenuItem L4=new JMenuItem("Python");
    JMenuItem L5=new JMenuItem("Go");
    JMenuItem L6=new JMenuItem("Ruby");
    JMenuItem L7=new JMenuItem("PHP");
    JMenuItem L8=new JMenuItem("Java Script");



    Lang.add(L1);
    Lang.add(L2);
    Lang.add(L3);
    Lang.add(L4);
    Lang.add(L5);
    Lang.add(L6);
    Lang.add(L7);
    Lang.add(L8);


    f.setJMenuBar(mb);
    f.add(txt);
    f.setVisible(true);
  }
  public static void main(String[] args) {
    Q2 check=new Q2();
  }  
}
