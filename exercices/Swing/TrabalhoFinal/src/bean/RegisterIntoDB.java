package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterIntoDB {
    
    private String nome;
    
    private String email;
    
    private String dataNas;
    
    private String Curso;
    
    private Double Matematica;
    
    private Double Fisica;
    
    private Double Historia;
    
    private Double Media;
    
    private String SituacaoAluno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNas() {
        return dataNas;
    }

    public void setDataNas(String dataNas) {
        this.dataNas = dataNas;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public Double getMatematica() {
        return Matematica;
    }

    public void setMatematica(Double Matematica) {
        this.Matematica = Matematica;
    }

    public Double getFisica() {
        return Fisica;
    }

    public void setFisica(Double Fisica) {
        this.Fisica = Fisica;
    }

    public Double getHistoria() {
        return Historia;
    }

    public void setHistoria(Double Historia) {
        this.Historia = Historia;
    }

    public Double getMedia() {
        return Media;
    }

    public void setMedia(Double Media) {
        this.Media = Media;
    }

    public String getSituacaoAluno() {
        return SituacaoAluno;
    }

    public void setSituacaoAluno(String SituacaoAluno) {
        this.SituacaoAluno = SituacaoAluno;
    }
    
    public void InsertIntoDB(Connection conn) throws SQLException{
        String insert = "insert into Alunos(nome, email, dataNas, Curso,    Matematica, Historia, Fisica, Media, SituacaoAluno) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement stm = null; 

        stm = conn.prepareStatement(insert);
        stm.setString(1, getNome());
        stm.setString(2, getEmail());
        stm.setString(3, getDataNas());
        stm.setString(4, getCurso());
        stm.setDouble(5, getMatematica());
        stm.setDouble(6, getHistoria());
        stm.setDouble(7, getFisica());
        stm.setDouble(8, getMedia());
        stm.setString(9, getSituacaoAluno());

        stm.execute();
    }
    
}
