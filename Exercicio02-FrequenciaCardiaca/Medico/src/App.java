import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate nascimento = LocalDate.of(2001, 07, 30);
        var frequenciaCardiaca = new FrequenciaCardiaca();
        frequenciaCardiaca.setDataDeNascimento(nascimento);
        frequenciaCardiaca.setNome("Bruno");
        frequenciaCardiaca.setSobreNome("Viana");
        System.out.println(frequenciaCardiaca.mostraDados());
        //System.out.println("Maxima: " + frequenciaCardiaca.calculaFrequenciaMaxima());

        
    }
}
