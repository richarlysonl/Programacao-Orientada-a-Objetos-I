package biblioteca;
public class Main {
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("livro","sem autor","11/12/20","3-23543-213");
        Livro livro2 = new Livro("livro","sem autor","11/12/20","3-23543-213");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        if(livro2.emprestimo()){
            System.out.println("tudo certo");
        }else{
            System.out.println("livro já em uso");
        }
        if(livro2.emprestimo()){
            System.out.println("tudo certo");
        }else{
            System.out.println("livro já em uso");
        }
        System.out.println("biblioteca livros " + biblioteca.getLivros());
    }
}
