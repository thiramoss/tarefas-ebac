/**
 * @author thiagoramos
 */
public class Cachorro {

    private String nome;

    private int idade;

    private String raca;

    private String cor;

    private int peso;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * o método latir indica que o cachorro está latindo
     */
    public void latir(){
        System.out.println("au au");
    }
}
