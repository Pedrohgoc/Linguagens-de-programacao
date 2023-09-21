package lotofacil;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class LotofacilGUI extends JFrame{
    // Atributos
    private JPanel painel = new JPanel();
    private JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    private JButton jButtonAposta2 = new JButton("Apostar de A a Z");
    private JButton jButtonAposta3 = new JButton("Apostar par ou ímpar");
    private JLabel jLabelMensagem = new JLabel("Exemplo de Simples Janela");
    // Construtor
    public LotofacilGUI(){
        this.setTitle("Lotofácil - Interface Gráfica");
        this.setSize(400,200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255,255,255));
        jButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //de: Scanner in = new Scanner(System.in)
                String aposta = JOptionPane.showInputDialog(null, "Digite um número de 0 a 100");
                Random rnd = new Random();
                int sorteio = rnd.nextInt(101);
                int numeroApostado = Integer.parseInt(aposta);
                if (numeroApostado==sorteio){
                    JOptionPane.showInputDialog(null, "parabéns ganhou 1000,00 Reais");
                }
                else {
                    //de System.out.println
                    JOptionPane.showInputDialog(null, "que pena, o número sorteado foi " + sorteio);
                }
            }
        });
        jButtonAposta2.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Input de Caractere");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 200);
                frame.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
                frame.setBackground(new Color(255,255,255));
                frame.setLocationRelativeTo(null);
                JLabel label = new JLabel("Digite um caractere de A a Z:");
                JTextField textField = new JTextField(1);
                JButton button = new JButton("apostar");
                JLabel resultadoLabel = new JLabel();

                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String inputText = textField.getText();
                        if (inputText.length() == 1) {
                            char caractere = inputText.charAt(0);
                            char caracteremaiusculo = Character.toUpperCase(caractere);
                            if (Character.isLetter(caractere)) {
                                if (caracteremaiusculo != 'P') {
                                    Character.toUpperCase(caractere);
                                    resultadoLabel.setText("QUE PENA A LETRA SORTEADA FOI P");
                                } else if (caracteremaiusculo == 'P') {
                                    resultadoLabel.setText("parabéns ganhou 500,00 Reais");
                                } else {
                                    resultadoLabel.setText("Por favor, digite apenas um caractere.");
                                }

                            } else resultadoLabel.setText("digite uma letra");
                        }
                    }
                });

                frame.add(label);
                frame.add(textField);
                frame.add(button);
                frame.add(resultadoLabel);

                frame.setVisible(true);
            }
        }));
        jButtonAposta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //de: Scanner in = new Scanner(System.in)
                String aposta = JOptionPane.showInputDialog(null, "Digite um número");
                int numeroApostado = Integer.parseInt(aposta);
                if (numeroApostado%2==0){
                    JOptionPane.showInputDialog(null, "parabéns ganhou 100,00 Reais");
                }
                else {
                    //de System.out.println
                    JOptionPane.showInputDialog(null, "que pena, você perdeu!");
                }
            }
        });
        painel.add(jButtonAposta1); painel.add(jButtonAposta2); painel.add(jButtonAposta3);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true); // Exibir janela
    }
    public static void main(String[] args) {new LotofacilGUI();}
}