package calculadora;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
// inicia el codigo
public class CCalcular extends JFrame implements ActionListener{
    private JLabel Number1, Number2, result;
    private JTextField num1, num2, result1;
    private JButton suma, resta, mult, div, salir, limpiar;
    // constructor
    CCalcular(){
        // ventana
        setTitle("Calculadora");
        setSize(650,510);
        setLocationRelativeTo(null);
        setLayout(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/calculadora.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("/imagenes/dos espadas.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Labels
        Number1 = new JLabel("Primer número");
        Number1.setBounds(40,120,200,30);
        Number1.setForeground(Color.CYAN);
        add(Number1);
        Number2 = new JLabel("Segundo número");
        Number2.setBounds(40,160,200,30);
        Number2.setForeground(Color.CYAN);
        add(Number2);
        result = new JLabel("Resultado");
        result.setBounds(40,200,200,30);
        result.setForeground(Color.CYAN);
        add(result);
        //TextFields
        num1 = new JTextField();
        num1.setBounds(150,120,100,20);
        add(num1);
        num2 = new JTextField();
        num2.setBounds(150,160,100,20);
        add(num2);
        result1 = new JTextField();
        result1.setBounds(150,200,100,20);
        add(result1);
        //Buttons
        suma = new JButton("Suma");
        suma.setBounds(400, 80, 175, 50);
        ImageIcon sum = new ImageIcon(getClass().getResource("/imagenes/plus.jpg"));
        suma.setIcon(new ImageIcon(sum.getImage().getScaledInstance(45,
                45, Image.SCALE_DEFAULT)));
        suma.addActionListener(this);
        add(suma);
        resta = new JButton("Resta");
        resta.setBounds(400, 140, 175, 50);
        ImageIcon rest = new ImageIcon(getClass().getResource("/imagenes/menos.png"));
        resta.setIcon(new ImageIcon(rest.getImage().getScaledInstance(45,
                45, Image.SCALE_DEFAULT)));
        resta.addActionListener(this);
        add(resta);
        mult = new JButton("Multiplicación");
        mult.setBounds(400, 200, 175, 50);
        ImageIcon multi = new ImageIcon(getClass().getResource("/imagenes/multiplicacion.png"));
        mult.setIcon(new ImageIcon(multi.getImage().getScaledInstance(45,
                45, Image.SCALE_DEFAULT)));
        mult.addActionListener(this);
        add(mult);
        div = new JButton("División");
        div.setBounds(400, 260, 175, 50);
        ImageIcon divi = new ImageIcon(getClass().getResource("/imagenes/division.png"));
        div.setIcon(new ImageIcon(divi.getImage().getScaledInstance(45,
                45, Image.SCALE_DEFAULT)));
        div.addActionListener(this);
        add(div);
        salir = new JButton("Salir");
        salir.setBounds(400, 350, 175, 50);
        ImageIcon exit = new ImageIcon(getClass().getResource("/imagenes/exit.png"));
        salir.setIcon(new ImageIcon(exit.getImage().getScaledInstance(45,
                45, Image.SCALE_DEFAULT)));
        salir.addActionListener(this);
        add(salir);
        limpiar = new JButton("Limpiar");
        limpiar.setBounds(150, 350, 175, 50);
        ImageIcon clean = new ImageIcon(getClass().getResource("/imagenes/clean.jpg"));
        limpiar.setIcon(new ImageIcon(clean.getImage().getScaledInstance(45,
                45, Image.SCALE_DEFAULT)));
        limpiar.addActionListener(this);
        add(limpiar);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Suma")){
            operaciones calc = new operaciones();
            calc.setNum1(Float.parseFloat(num1.getText()));
            calc.setNum2(Float.parseFloat(num2.getText()));
            result1.setText(String.valueOf(calc.sumar()));
        } else if(e.getActionCommand().equals("Resta")){
            operaciones calc = new operaciones();
            calc.setNum1(Float.parseFloat(num1.getText()));
            calc.setNum2(Float.parseFloat(num2.getText()));
            result1.setText(String.valueOf(calc.restar()));
        } else if(e.getActionCommand().equals("Multiplicación")){
            operaciones calc = new operaciones();
            calc.setNum1(Float.parseFloat(num1.getText()));
            calc.setNum2(Float.parseFloat(num2.getText()));
            result1.setText(String.valueOf(calc.multiplicar()));
        } else if(e.getActionCommand().equals("División")){
            operaciones calc = new operaciones();
            calc.setNum1(Float.parseFloat(num1.getText()));
            calc.setNum2(Float.parseFloat(num2.getText()));
            result1.setText(String.valueOf(calc.dividir()));
        } else if(e.getActionCommand().equals("Salir")){
            dispose();
            System.exit(0);
        } else if (e.getActionCommand().equals("Limpiar")){
            num1.setText("");
            num2.setText("");
            result1.setText("");
        }
    }
}