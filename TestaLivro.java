public class TestaLivro {
    public static void main(String[] args) {
        Livro Livro1 = new Livro("A Biblioteca da Meia-Noite", "Matt Haig",2021, "Bertrand Brasil");

        Livro Livro2 = new Livro("É Assim que Acaba", "Coleen hoover", 2018, "Galera");

        Livro Livro3 = new Livro("Café com Deus Pai", "Júnior Rostrirola", 2023, "Velos");

        System.out.println(Livro1.getTitulo() + "\n" + Livro1.getAutor() + "\n" + Livro1.getEditora() + ", " + Integer.toString(Livro1.getAno())+"\n");

        System.out.println(Livro2.getTitulo() + "\n" + Livro2.getAutor() + "\n" + Livro2.getEditora() + ", " + Integer.toString(Livro2.getAno())+"\n");
    
        System.out.println(Livro3.getTitulo() + "\n" + Livro3.getAutor() + "\n" + Livro3.getEditora() + ", " + Integer.toString(Livro3.getAno()));
    }
}