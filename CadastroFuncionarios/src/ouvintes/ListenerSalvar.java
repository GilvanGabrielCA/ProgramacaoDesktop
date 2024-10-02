package ouvintes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerSalvar implements ActionListener {
    private JTextField nome;
    private JTextField rg;
    private JTextField cpf;
    private JTextField cargo;

    public ListenerSalvar(JTextField nome, JTextField rg, JTextField cpf, JTextField cargo) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, e);{
            String msg = "nome: " + nome.getText() + "\nRG: " + rg.getText();
            msg += "\nCPF: " + cpf.getText() + "\nCargo: " + cargo.getText();

            JOptionPane.showMessageDialog(null, msg);
        }
    }
}
