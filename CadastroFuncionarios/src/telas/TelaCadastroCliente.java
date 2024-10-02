package telas;

import ouvintes.ListenerSalvarCliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCadastroCliente extends JFrame {

    public TelaCadastroCliente(){
        this.initialize();
        this.setExtendedState(NORMAL);
    }

    //atributos
    private JPanel panel;

    //elementos da tela
    private JLabel label_cpf;
    private JLabel label_rg;
    private JLabel label_nome;
    private JLabel label_email;
    private JLabel label_endereco;

    private JTextField text_cpf;
    private JTextField text_rg;
    private JTextField text_nome;
    private JTextField text_email;
    private JTextField text_endereco;

    private JButton bt_ok;
    private JButton bt_cancela;


    //inicialização da janela
    public void initialize(){
        //cria o novo objeto para o JPanel
        panel = new JPanel();

        //grid layout
        //5 linhas e 2 colunas
        GridLayout gl = new GridLayout(6,2,10,10);
        panel.setLayout(gl);

        //seta o tamanho e a posição da janela
        this.setBounds(0,0,800,400);

        //inicialização
        label_cpf = new JLabel("CPF: ");
        label_rg = new JLabel("RG: ");
        label_nome = new JLabel("Nome: ");
        label_email = new JLabel("Email: ");
        label_endereco = new JLabel("Endereço");

        text_cpf = new JTextField();
        text_rg = new JTextField();
        text_nome = new JTextField();
        text_email = new JTextField();
        text_endereco = new JTextField();

        bt_ok = new JButton("OK");
        bt_cancela = new JButton("Cancelar");

        //configuração

        //evento de clique
        bt_ok.addActionListener(new ListenerSalvarCliente(text_nome, text_rg, text_cpf, text_email, text_endereco));
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
        panel.add(label_email);
        panel.add(text_email);
        panel.add(label_endereco);
        panel.add(text_endereco);
        panel.add(bt_ok);
        panel.add(bt_cancela);

        //adiciona o panel no frame
        this.add(panel);

        //define o título da janela
        this.setPreferredSize(new Dimension(400,200));

        //define o título da janela
        this.setTitle("Cadastro de Clientes");

        this.pack();

        //exibe
        this.setVisible(true);

        //define que quando fechar a janela o programa acaba
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
