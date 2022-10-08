import java.math.BigDecimal;

public class Funcionario {

    private String nome;
    private String sobreNome;
    private BigDecimal salario;

    public Funcionario(String nome, String sobreNome, BigDecimal salario) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        setSalario(salario);
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

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        if (salario.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Salário Inválido");
            return;
        }

        this.salario = salario;
    }

    /*
     * public void mostraFuncionario() {
     * System.out.println("Nome do funcionário: " + nome + " " + sobreNome +
     * " Salário: " + salario + "\n");
     */

    @Override
    public String toString() {
        return "Nome do Funcionário" + nome + "" + sobreNome + ", Salário=" + salario;
    }

    /*
     * public void aumentoDeSalario(double percentual) {
     * 
     * setSalario(salario.pow(a));
     * 
     * }
     */

    public BigDecimal aumentoDeSalario(double percentual) {

        return this.salario.multiply(new BigDecimal(percentual));

    }
}