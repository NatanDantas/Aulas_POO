import java.sql.Date;
import java.time.LocalDate;

public class FrequenciaCardiaca {
    private String nome;
    private String sobreNome;
    private LocalDate dataDeNascimento;

    public FrequenciaCardiaca() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int calulaIdade() {
        LocalDate now = LocalDate.now();
        return now.getYear() - dataDeNascimento.getYear();

    }

    public int calculaFrequenciaMaxima() {

        return 220 - calulaIdade();

    }

    public String mostraDados(){
        return "Seu Nome: " + nome + " " + sobreNome + " Sua Idade: " + calulaIdade() + " Frequência Cardíaca: " + calculaFrequenciaMaxima();
    }

}