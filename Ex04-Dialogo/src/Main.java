import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        for(int i = 0; i < 10; i++){
            String input = JOptionPane.showInputDialog(
              null,
              "Digite o valor " + (i + 1) + ":",
                    JOptionPane.QUESTION_MESSAGE
            );
            numeros[i] = Integer.parseInt(input);
        }

        int menor = numeros[0];
        int maior = numeros[0];

        for (int i = 1; i < numeros.length; i++){
            if (numeros[i] < menor){
                menor = numeros[i];
            }
            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "O menor número digitado foi " + menor + "\nO maior número digitado foi: " + maior
        );
    }
}