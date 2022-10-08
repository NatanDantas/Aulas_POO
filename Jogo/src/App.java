public class App {
    public static void main(String[] args) throws Exception {
        
        Jogador jogador1 = new Jogador();
        Jogador jogador2 = new Jogador("José");

        

        //System.out.println(jogador1.getHp());
        jogador1.receberDano(50);
        System.out.println(jogador1.getHp());


        String mensagem = (jogador1.isEnvenenado())?"Está Envenenado":"Não Está Envenenado";
        
    }
}
