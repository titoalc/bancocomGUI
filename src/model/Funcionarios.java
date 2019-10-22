package model;

public class Funcionarios {
    private String nome;
    private String area;
    private Double codigo;
    private String lider;

    public Funcionarios(String nome, String area, Double codigo, String lider) {
        // constructor
        this.nome = nome;
        this.area = area;
        this.codigo = codigo;
        this.lider = lider;
    }

    @Override
    public String toString() {
        // to string
        return "Funcionarios{" +
                // retorna as strings em vez do endereço de memoria do objeto
                "nome='" + nome + '\'' +
                ", area='" + area + '\'' +
                ", codigo=" + codigo +
                ", lider='" + lider + '\'' +
                '}';
    }
}
