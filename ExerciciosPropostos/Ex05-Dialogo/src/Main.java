import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double peso, altura;

        peso = Double.parseDouble(JOptionPane.showInputDialog(
          null,
          "Digite seu peso:",
          "Por favor",
          JOptionPane.QUESTION_MESSAGE
        ));

        altura = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                "Digite sua altura:",
                "Por favor",
                JOptionPane.QUESTION_MESSAGE
        ));

        double imc = peso / (altura * altura);

        JOptionPane.showMessageDialog(
                null,
                "IMC: " + String.format("%.2f", imc),
                "IMC",
                JOptionPane.QUESTION_MESSAGE
        );
    }
}