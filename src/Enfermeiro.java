public class Enfermeiro {
    private String nome;
    private double ganho;
    public Enfermeiro(String nome)
    {
        this.nome = nome;
        ganho = 0;
    }
    public void ganhar(double valor)
    {
        ganho = ganho + valor;
    }
    public double resultado()
    {
        return ganho;
    }
}