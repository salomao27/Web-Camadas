/*
Luiz Felipe Oliveira Gonçalves Leitão -> 0050017010
João Marcos Salomão do Nascimento -> 0050016976
*/

package controller;

import java.util.ArrayList;
import java.util.List;

import dao.AlunoDAO;
import model.Aluno;

public class AlunoController {

    public void create(Aluno aluno){

        try {
            AlunoDAO dao = new AlunoDAO();
            dao.create(aluno);
            
        } catch (Exception e) {
            System.out.println("Erro no controller");
        }
        
    }
    
    public List<Aluno> readAll(){
       List<Aluno> alunos = new ArrayList<Aluno>();
       try {
           AlunoDAO dao = new AlunoDAO();
           alunos = dao.readAll();

       } catch (Exception e) {
           //TODO: handle exception
       }
         return alunos;
    }

    public void update(Aluno aluno){
        try {
            AlunoDAO dao = new AlunoDAO();
            dao.update(aluno);
            
        } catch (Exception e) {
            System.out.println("Erro ao atualizar o aluno");
        }
    }
    
    public void delete(Aluno aluno){
        try {
            AlunoDAO dao = new AlunoDAO();
            dao.delete(aluno);
            
        } catch (Exception e) {
            System.out.println("Erro ao deletar o aluno");
        }
    }
}
