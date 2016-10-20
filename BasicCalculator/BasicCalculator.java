
/**
 *
 * @author Dewey Kincheloe
 * @version LB07
 * @since 4/7/2016
 */
import javax.swing.*; /* for window*/
import java.awt.event.*; /*for events*/

public class BasicCalculator implements ActionListener /*implements means polymorphism - uses java.awt, BasicCalculator is re-undelined because there are no action performed methods - actionPerformed*/ 
{
    //Attributes
    private double o1, o2; /*o = operand*/
    private char op; /*operator*/
    private JFrame cWin; /*calculator window*/
    private JPanel kPad; /*used to assemble key pad in the window*/
    private JTextField dBox; /*display box*/
    private JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, dot; /*numbers and decimal buttons*/
    private JButton add, sub, mul, div, mod, com, clr; /*operation, compute, clear buttons*/
    
    //Constructors
    public BasicCalculator()
    {
        clean();
    }
    
    //Methods
    public void clean()
    {
        o1=0;
        o2=0;
        op = ' ';/*must be one char long use one space*/
    }
    
    public void createUserInterface()
    {
        cWin = new JFrame("Dewey Kincheloe");
        kPad = new JPanel(); 
        dBox = new JTextField(20); /*sets space to 20 characters long*/
        b0 = new JButton("0"); /* the "0" is the button's label */
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        dot = new JButton(".");
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("x");
        div = new JButton("/");
        mod = new JButton("%");
        com = new JButton("=");
        clr = new JButton("C");
        /* assemble kpad. The order of insertion is the order it is displayed in the window*/
        kPad.add(dBox);
        kPad.add(clr);
        kPad.add(b1);
        kPad.add(b2);
        kPad.add(b3);
        kPad.add(b4);
        kPad.add(b5);
        kPad.add(b6);
        kPad.add(b7);
        kPad.add(b8);
        kPad.add(b9);
        kPad.add(b0);
        kPad.add(dot);
        
        kPad.add(com);
        kPad.add(add);
        kPad.add(sub);
        kPad.add(mul);
        kPad.add(div);
        kPad.add(mod);
        
        
        /**/
        cWin.getContentPane().add(kPad);
        cWin.setSize(300,300);
        cWin.setVisible(true);
        
        /*tell computer to watch buttons for action = event*/
        b0.addActionListener(this); /*variable shadowing this means add object listener to this object - 0 button*/
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        dot.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
        com.addActionListener(this);
        clr.addActionListener(this);
        
        
               
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== b0) /*e = action event - if b0 is selected*/
        {
            dBox.setText(dBox.getText()+ "0"); /*set text writes text, get text reads text*/
        }
        if(e.getSource()== b1)
        {
            dBox.setText(dBox.getText()+ "1");
        }
        if(e.getSource()== b2)
        {
            dBox.setText(dBox.getText()+ "2");
        }
        if(e.getSource()== b3)
        {
            dBox.setText(dBox.getText()+ "3");
        }
        if(e.getSource()== b4)
        {
            dBox.setText(dBox.getText()+ "4");
        }
        if(e.getSource()== b5)
        {
            dBox.setText(dBox.getText()+ "5");
        }
        if(e.getSource()== b6)
        {
            dBox.setText(dBox.getText()+ "6");
        }
        if(e.getSource()== b7)
        {
            dBox.setText(dBox.getText()+ "7");
        }
        if(e.getSource()== b8)
        {
            dBox.setText(dBox.getText()+ "8");
        }
        if(e.getSource()== b9)
        {
            dBox.setText(dBox.getText()+ "9");
        }
        if(e.getSource()== dot)
        {
            dBox.setText(dBox.getText()+ ".");
        }
               
        
        if(e.getSource()== add)
        {
           o1 = Double.parseDouble(dBox.getText());  
           //Wrapper Class - this is a returning method that converts the text in the window to a double then assigns to o1
           //could also say o1 = new Double(dbox.getText()).doubleValue();
           op = '+';
           dBox.setText(""); /*no space = empty string*/ 
           
        }
        if(e.getSource()== sub)
        {
           if (dBox.getText().trim().equals (""))
           {
               dBox.setText("-");
           }
           else
           {
           o1 = Double.parseDouble(dBox.getText());
           op = '-';
           dBox.setText(""); 
           }
        }   
        if(e.getSource()== mul)
        {
           o1 = Double.parseDouble(dBox.getText());
           op = 'x';
           dBox.setText(""); 
        }
        if(e.getSource()== div)
        {
           o1 = Double.parseDouble(dBox.getText());
           op = '/';
           dBox.setText(""); 
        }
        if(e.getSource()== mod)
        {
           o1 = Double.parseDouble(dBox.getText());
           op = '%';
           dBox.setText(""); 
        }
        if(e.getSource()== clr)
        {
           clean();
           dBox.setText(""); 
        }
        if(e.getSource()== com) /*compute - calculate the input*/
        {
           o2 = Double.parseDouble(dBox.getText());
           calculate();
           //dBox.setText(""); 
        }
        
        
        
    }
    
    public void calculate()
    {
        switch(op)
        {
            case '+': dBox.setText(new Double(o1+o2).toString());break; /*overloading - same constructor but different parameters - provides double and returns string*/
            case '-': dBox.setText(new Double(o1-o2).toString());break;
            case 'x': dBox.setText(new Double(o1*o2).toString());break;
            case '/': dBox.setText(new Double(o1/o2).toString());break;
            case '%': dBox.setText(new Double(o1%o2).toString());break;
        }
    }
       


}

