import javax.swing.JOptionPane;

public class Main {
    public class Ex01Dialogo {
        /**
         * @param args the command line arguments
         */
    }

    public static void main(String[] args) {
        String resposta;
        int idade;

        resposta = (String) JOptionPane.showInputDialog(
                null,
                "Digite a sua idade",
                "Por favor",
                JOptionPane.QUESTION_MESSAGE
        );

        //converte a resposta em inteiro
        idade = Integer.parseInt(resposta);

        if (idade >= 18){
            JOptionPane.showMessageDialog(
                    null,
                    "Você é maior de idade, OK."
            );
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    "Entrada proibida!",
                    "Aviso",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}