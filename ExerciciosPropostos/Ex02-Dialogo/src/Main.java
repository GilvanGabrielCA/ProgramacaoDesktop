import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        //opcoes da primeira caixa de diálogo
        Object[] tipos = {"Gerente", "Funcionário"};

        //inputs
        String resposta1, resposta2;
        double salario_bruto, salario_corrigido;

        //primeiro dialogo
        resposta1 = (String) JOptionPane.showInputDialog(
                null,
                "Selecione o tipo de funcionario:",
                "Por favor",
                JOptionPane.WARNING_MESSAGE,
                null,
                tipos,
                "Gerente"
        );

        resposta2 = (String) JOptionPane.showInputDialog(
                null,
                "Digite o salário do funcionario (com ponto):",
                "Por favor",
                JOptionPane.QUESTION_MESSAGE
        );

        salario_bruto = Double.parseDouble(resposta2);

        salario_corrigido = switch (resposta1) {
            case "Gerente" -> salario_bruto * 1.15;
            case "Funcionário" -> salario_bruto * 1.075;
            default -> 0.0;
        };

        JOptionPane.showMessageDialog(
                null,
                "O salário corrigido é de R$" + String.format("%.2f", salario_corrigido)
        );
    }
}