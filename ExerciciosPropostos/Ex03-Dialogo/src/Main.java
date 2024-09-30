import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        //inputs
        String nome;
        String resposta;

        //Opções de times
        Object[] times = {
                "Palmeiras",
                "Corinthians",
                "São Paulo",
                "Santos",
                "Flamengo",
                "Fluminense",
                "Botafogo",
                "Vasco",
                "Cruzeiro",
                "Atletico",
                "Gremio",
                "Internacional",
                "Outro",
                "Não torce para ninguém"
        };

        nome = JOptionPane.showInputDialog(
                null,
                "Digite seu nome:",
                "Por favor",
                JOptionPane.QUESTION_MESSAGE
        );

        resposta = (String) JOptionPane.showInputDialog(
          null,
          "Selecione o seu time do coração:",
          "Por favor",
          JOptionPane.QUESTION_MESSAGE,
          null,
          times,
          "Palmeiras"
        );

        JOptionPane.showMessageDialog(
                null,
                nome + " torce para o " + resposta
        );
    }
}