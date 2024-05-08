package devandroid.fernando.applistacurso.model;

public class Pessoa {

    // Construtor da Classe Pessoa
    // Atributos da Classe Pessoa - Relacionado aos objetos (Molde / Modelo / Template)
    // O Atributo é sempre protegido (private)
    // Métodos de Acesso - Getters e Setters

    private String primeiroNome;
    private String sobrenome;
    private String cursoDesejado;
    private String telefoneContato;

    public Pessoa(){
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }
}
