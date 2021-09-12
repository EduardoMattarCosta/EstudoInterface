package Modelos;

public class ModeloCliente{
    
    private String nome;    
    private String sobrenome;
    private String cidade;
    private String email;

    public ModeloCliente(String nome, String sobrenome, String cidade, String email) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cidade = cidade;
        this.email = email;
    }
    
    //#region Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    //#endregion
}