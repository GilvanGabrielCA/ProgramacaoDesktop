package app;
import entidades.Cliente;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Gilvan Gabriel");
        cliente.setEmail("gilvangabriel@email.com");
        cliente.setIdade(22);

        JOptionPane.showMessageDialog(
                null,
                "Dados do cliente: \n"
                        + "Nome: " + cliente.getNome() + "\n"
                        + "E-mail: " + cliente.getEmail() + "\n"
                        + "Idade: " + cliente.getIdade()
        );
    }
}