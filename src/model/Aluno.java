package model;

public class Aluno {

    private String matricula;
    private String nome;
    private String email;
    private double cr;
    


    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getCr() {
        return this.cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    
}