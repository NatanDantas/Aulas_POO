import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        var funcionario = new Funcionario("Natan", "Dantas", new BigDecimal(5000));
        var funcionario2 = new Funcionario("Bruno", "Viana", new BigDecimal(5000));

        funcionario.setSalario(new BigDecimal(5000));
        funcionario.aumentoDeSalario(1.5);
        System.out.println(funcionario);

        funcionario2.setSalario(new BigDecimal(5000));
        funcionario2.aumentoDeSalario(1.5);
        System.out.println(funcionario2);
    }
}
