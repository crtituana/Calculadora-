import javax.swing.*;
import java.awt.*;


public class nuevo extends JFrame{

private JTextField visor;

public nuevo (){
        super("Calculadora");

        this.setSize(350,350);
        JButton[] btNums = new JButton[10];
        for (byte i=0;i<btNums.length;i++){
            final byte c=i;
            btNums[i]=new JButton(""+i);
            btNums[i].addActionListener(
                    actionEvent -> visor.setText(RnCalculadoraKt.mostrar(c))
            );
        }
        JButton[]btAcoes =new JButton[6];
        final char []acoes={'+','-','X','=','C','/'};
        for (int i=0; i<btAcoes.length;i++){
            final char c=acoes[i];
            btAcoes[i]=new JButton(""+acoes[i]);
            btAcoes[i].addActionListener(
                actionEvent -> visor.setText(RnCalculadoraKt.calcular(c))
        );

    }
        JPanel pnCentral=new JPanel();
        pnCentral.setLayout(new GridLayout(4,4));
        final byte[][] num ={
                {7,8,9,0,4,5,6,1,1,2,3,2,0,3,4,5},
                {0,0,0,1,0,0,0,1,0,0,0,1,0,1,1,1}
        };
        for (int i=0;i<num[0].length;i++){
            if(num[1][i]==0){
                pnCentral.add(btNums[num[0][i]]);
            }else {
                pnCentral.add(btAcoes[num[0][i]]);
            }

        }
        Font font =new Font(" Font Squirrel",Font.BOLD,20);
        visor=new JTextField("0.0");
        visor.setFont(font);
        visor.setHorizontalAlignment(JTextField.RIGHT);
        visor.setEnabled(false);
        visor.setDisabledTextColor(Color.blue);

        this.add(pnCentral);
        this.add(visor,BorderLayout.NORTH);
        this.setVisible(true);

        }


        }