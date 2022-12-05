/*
Luiz Felipe Oliveira Gonçalves Leitão -> 0050017010
Jo�o Marcos Salom�o do Nascimento -> 0050016976
*/

package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.AlunoController;
import model.Aluno;

public class AlunoView {
    
    public void create(){
        try {
            Aluno aluno = new Aluno();
            AlunoController controller = new AlunoController();

            JFrame frame = new JFrame("Create");
            frame.setSize(400, 400);
            frame.setLayout(null);
            frame.setVisible(true);

            JLabel labelMatricula = new JLabel("Matricula: ");
            labelMatricula.setBounds(10, 10, 100, 20);
            frame.add(labelMatricula);

            JLabel labelNome = new JLabel("Nome: ");
            labelNome.setBounds(10, 40, 100, 20);
            frame.add(labelNome);

            JLabel labelCR = new JLabel("CR: ");
            labelCR.setBounds(10, 70, 100, 20);
            frame.add(labelCR);

            JLabel labelEmail = new JLabel("Email: ");
            labelEmail.setBounds(10, 100, 100, 20);
            frame.add(labelEmail);

            JTextField textFieldMatricula = new JTextField();
            textFieldMatricula.setBounds(120, 10, 100, 20);
            frame.add(textFieldMatricula);

            JTextField textFieldNome = new JTextField();
            textFieldNome.setBounds(120, 40, 100, 20);
            frame.add(textFieldNome);

            JTextField textFieldCR = new JTextField();
            textFieldCR.setBounds(120, 70, 100, 20);
            frame.add(textFieldCR);

            JTextField textFieldEmail = new JTextField();
            textFieldEmail.setBounds(120, 100, 100, 20);
            frame.add(textFieldEmail);

            JButton buttonCreate = new JButton("Create");
            buttonCreate.setBounds(10, 130, 100, 20);
            frame.add(buttonCreate);

            buttonCreate.addActionListener(e -> {
                aluno.setMatricula(textFieldMatricula.getText());
                aluno.setNome(textFieldNome.getText());
                aluno.setEmail(textFieldEmail.getText());
                aluno.setCr(Double.parseDouble(textFieldCR.getText()));
                controller.create(aluno);
                frame.dispose();
            });
            
        } catch (Exception e) {
        }
    }

    public void readAll(){
        AlunoController controller = new AlunoController();
        
        System.out.println("Listagem de alunos");
        System.out.println("------------------");
        for (Aluno aluno : controller.readAll()) {
            System.out.println(aluno.getMatricula() + " - " + aluno.getNome() + " - " + aluno.getCr() + " - " + aluno.getEmail());
        }


    }

    public void update(){
        try {
            Aluno aluno = new Aluno();
            AlunoController controller = new AlunoController();

            JFrame frame = new JFrame("Update");
            frame.setSize(300, 300);
            frame.setLayout(null);
            frame.setVisible(true);

            JLabel labelMatricula = new JLabel("Matricula: ");
            labelMatricula.setBounds(10, 10, 100, 20);
            frame.add(labelMatricula);

            JLabel labelNome = new JLabel("Nome: ");
            labelNome.setBounds(10, 40, 100, 20);
            frame.add(labelNome);

            JLabel labelCR = new JLabel("CR: ");
            labelCR.setBounds(10, 70, 100, 20);
            frame.add(labelCR);

            JLabel labelEmail = new JLabel("Email: ");
            labelEmail.setBounds(10, 100, 100, 20);
            frame.add(labelEmail);

            JTextField textFieldMatricula = new JTextField();
            textFieldMatricula.setBounds(120, 10, 100, 20);
            frame.add(textFieldMatricula);

            JTextField textFieldNome = new JTextField();
            textFieldNome.setBounds(120, 40, 100, 20);
            frame.add(textFieldNome);

            JTextField textFieldCR = new JTextField();
            textFieldCR.setBounds(120, 70, 100, 20);
            frame.add(textFieldCR);

            JTextField textFieldEmail = new JTextField();
            textFieldEmail.setBounds(120, 100, 100, 20);
            frame.add(textFieldEmail);


            JButton buttonUpdate = new JButton("Update");
            buttonUpdate.setBounds(10, 130, 100, 20);
            frame.add(buttonUpdate);
            
            buttonUpdate.addActionListener(e -> {
                aluno.setMatricula(textFieldMatricula.getText());
                aluno.setNome(textFieldNome.getText());
                aluno.setEmail(textFieldEmail.getText());
                aluno.setCr(Double.parseDouble(textFieldCR.getText()));
                controller.update(aluno);
                frame.dispose();
            });
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void delete(){
        try {
            Aluno aluno = new Aluno();

            AlunoController controller = new AlunoController();
            
            JFrame frame = new JFrame("Delete");
            frame.setSize(400, 400);
            frame.setLayout(null);
            frame.setVisible(true);

            JLabel labelMatricula = new JLabel("Matricula: ");
            labelMatricula.setBounds(10, 10, 100, 20);
            frame.add(labelMatricula);

            JTextField textFieldMatricula = new JTextField();
            textFieldMatricula.setBounds(120, 10, 100, 20);
            frame.add(textFieldMatricula);

            JButton buttonDelete = new JButton("Delete");
            buttonDelete.setBounds(10, 50, 100, 20);
            frame.add(buttonDelete);

            buttonDelete.addActionListener(e -> {
                aluno.setMatricula(textFieldMatricula.getText());
                controller.delete(aluno);
                frame.dispose();
            });
            
        } catch (Exception e) {
        }
            
    }
    
    public static void main(String[] args) {
        AlunoView telaAluno = new AlunoView();

        JFrame frame = new JFrame("Aluno");
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);

        JButton buttonCreate = new JButton("Create");
        buttonCreate.setBounds(10, 10, 100, 20);
        frame.add(buttonCreate);

        JButton buttonReadAll = new JButton("Read");
        buttonReadAll.setBounds(10, 40, 100, 20);
        frame.add(buttonReadAll);

        JButton buttonUpdate = new JButton("Update");
        buttonUpdate.setBounds(10, 70, 100, 20);
        frame.add(buttonUpdate);

        JButton buttonDelete = new JButton("Delete");
        buttonDelete.setBounds(10, 100, 100, 20);
        frame.add(buttonDelete);

        JLabel labelIntegrantes = new JLabel("Integrantes: ");
        labelIntegrantes.setBounds(10, 130, 100, 20);
        frame.add(labelIntegrantes);
        JLabel labelIntegrante1 = new JLabel("Luiz Felipe Oliveira");
        labelIntegrante1.setBounds(10, 150, 200, 20);
        frame.add(labelIntegrante1);
        JLabel labelIntegrante2 = new JLabel("João Marcos Salomão");
        labelIntegrante2.setBounds(10, 170, 200, 20);
        frame.add(labelIntegrante2);

        buttonCreate.addActionListener(e -> {
            telaAluno.create();
        });
        buttonReadAll.addActionListener(e -> {
            telaAluno.readAll();
        });
        buttonUpdate.addActionListener(e -> {
            telaAluno.update();
        });
        buttonDelete.addActionListener(e -> {
            telaAluno.delete();
        });   
    }
}
