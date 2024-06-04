

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.setNome("Paçoca");
        cachorro.setIdade(12);
        cachorro.setCor("Laranja");
        cachorro.setRaca("Golden Retriever");
        cachorro.setPeso(8);

        System.out.println("Meu cachorro " + cachorro.getNome() + " é "+ cachorro.getCor() + " , da raça " + cachorro.getRaca() + " ,tem " +                    cachorro.getIdade() + " anos de idade e pesa " + cachorro.getPeso() + " quilos"  );

        cachorro.latir();



    }
}
