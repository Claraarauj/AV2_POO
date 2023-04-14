package AV2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q8_anaclara extends JFrame implements ActionListener {
        private JLabel texto;
        private JButton[] teclas;
        private JButton enviar;

        private int aleatorio;
        private int numTentativas;
        private int restantes = 5;

        public Q8_anaclara () {



            super("Adivinhar um numero de 0 a 20");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            enviar = new JButton("Adivinhar");
            enviar.addActionListener(this);




            texto = new JLabel("Tente adivinhar o número entre 1 e 20");
            add(texto, BorderLayout.NORTH);

            JPanel digitosPanel = new JPanel(new GridLayout(4, 5));
            teclas = new JButton[20];


            for (int i = 0; i < 20; i++) {
                JButton botao = new JButton(Integer.toString(i));
                botao.addActionListener(this);
                digitosPanel.add(botao);
            }
            add(digitosPanel, BorderLayout.CENTER);




            aleatorio = (int) (Math.random() * 20) + 1;
            System.out.println(aleatorio);


            Container c = getContentPane();
            c.setLayout(new FlowLayout());
            c.add(texto);
            c.add(enviar);

            numTentativas = 0;

            setSize(300, 200);
            setVisible(true);

        }

        public void actionPerformed(ActionEvent e) {
            int palpite = Integer.parseInt(e.getActionCommand());
            numTentativas++;
            restantes--;

            if (palpite == aleatorio) {
                texto.setText("Parabens! Voce acertou na " + numTentativas + "º tentativa!");
                enviar.setEnabled(false);
            } else if (numTentativas == 5) {
                texto.setText("Infelizmente voce perdeu todas as chances, o numero era: " + aleatorio);

                enviar.setEnabled(false);
            } else {
                texto.setText("Voce errou essa vez, mas ainda tem " + restantes + " tentativas");

            }

        }


        public static void main (String [] args) {

            Q8_anaclara play = new Q8_anaclara();


        }

    }

