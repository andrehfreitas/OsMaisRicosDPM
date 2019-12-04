package br.edu.ifsp.scl.osmaisricos;

public class Ricos {

    // Atributos
    private int id_;
    private String posicao;
    private String nome;
    private String fortuna;
    private String pais;
    private int foto;


    // Construtor
    public Ricos(
            int id_,
            String posicao,
            String nome,
            String fortuna,
            String pais,
            int foto){

        this.id_ = id_;
        this.posicao = posicao;
        this.nome = nome;
        this.fortuna = fortuna;
        this.pais = pais;
        this.foto = foto;
    }

    public String getPosicao() {
        return posicao;
    }

    public String getNome() {
        return nome;
    }

    public String getFortuna() {
        return fortuna;
    }

    public String getPais() {
        return pais;
    }

    public int getFoto() {
        return foto;
    }


}
