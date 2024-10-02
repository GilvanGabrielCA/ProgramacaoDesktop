package ouvintes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerSalvarCliente implements ActionListener {
    private JTextField nome;
    private JTextField rg;
    private JTextField cpf;
    private JTextField email;
    private JTextField endereco;

    public ListenerSalvarCliente(JTextField nome, JTextField rg, JTextField cpf, JTextField email, JTextField endereco) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.email = email;
        this.endereco = endereco;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, e);{
            String msg = "nome: " + nome.getText() + "\nRG: " + rg.getText();
            msg += "\nCPF: " + cpf.getText() + "\nEmail: " + email.getText() + "\nEndereço: " + endereco.getText();

            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
