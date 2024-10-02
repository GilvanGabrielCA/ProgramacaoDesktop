package telas;

import ouvintes.ListenerSalvar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastro extends JFrame {

    public TelaCadastro(){
        this.initialize();
        this.setExtendedState(NORMAL);
    }

    //atributos
    private JPanel panel;

    //elementos da tela
    private JLabel label_cpf;
    private JLabel label_rg;
    private JLabel label_nome;
    private JLabel label_cargo;

    private JTextField text_cpf;
    private JTextField text_rg;
    private JTextField text_nome;
    private JTextField text_cargo;

    private JButton bt_ok;
    private JButton bt_cancela;


    //inicialização da janela
    public void initialize(){
        //cria o novo objeto para o JPanel
        panel = new JPanel();

        //grid layout
        //5 linhas e 2 colunas
        GridLayout gl = new GridLayout(5,2,10,10);
        panel.setLayout(gl);

        //seta o tamanho e a posição da janela
        this.setBounds(0,0,800,400);

        //inicialização
        label_cpf = new JLabel("CPF: ");
        label_rg = new JLabel("RG: ");
        label_nome = new JLabel("Nome: ");
        label_cargo = new JLabel("Cargo: ");

        text_cpf = new JTextField();
        text_rg = new JTextField();
        text_nome = new JTextField();
        text_cargo = new JTextField();

        bt_ok = new JButton("OK");
        bt_cancela = new JButton("Cancelar");

        //configuração

        //evento de clique
        bt_ok.addActionListener(new ListenerSalvar(text_nome, text_rg, text_cpf, text_cargo));
        bt_cancela.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
                System.exit(0);
            }
        });

        //adicionar ao painel
        panel.add(label_nome);
        panel.add(text_nome);
        panel.add(label_cpf);
        panel.add(text_cpf);
        panel.add(label_rg);
        panel.add(text_rg);
        panel.add(label_cargo);
        panel.add(text_cargo);
        panel.add(bt_ok);
        panel.add(bt_cancela);

        //adiciona o panel no frame
        this.add(panel);

        //define o título da janela
        this.setPreferredSize(new Dimension(400,200));

        //define o título da janela
        this.setTitle("Cadastro de Funcionarios");

        this.pack();

        //exibe
        this.setVisible(true);

        //define que quando fechar a janela o programa acaba
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
