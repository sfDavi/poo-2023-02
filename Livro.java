public class Livro {
    private String titulo;
    private String autor;
    private Integer ano;
    private String editora;

    //Construtor
    public Livro(String titulo, String autor, int ano, String editora){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }

    //set e get para o titulo
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    //set e get para o autor
    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return autor;
    }

    //set e get para ano
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }

    //set e get para editora
    public void setEditora(String editora){
        this.editora = editora;
    }

    public String getEditora(){
        return editora;
    }

}