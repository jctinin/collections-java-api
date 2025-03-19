package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

  private List<Livro> livrosList;

  public CatalogoLivros() {
    this.livrosList = new ArrayList<Livro>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livrosList.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarLivrosPorAutor(String autor) {
    List<Livro> livrosPorAutorList = new ArrayList<Livro>();

    if (!livrosList.isEmpty()) {

      for (Livro livro : livrosList) {
        if (livro.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutorList.add(livro);
        }
      }
    }

    return livrosPorAutorList;
  }

  public List<Livro> pesquisarLivrosPorIntervaloDeAnos(int anoInicio, int anoFim) {
    List<Livro> livrosPorIntervaloDeAnosList = new ArrayList<Livro>();

    if (!livrosList.isEmpty()) {
      for (Livro livro : livrosList) {
        if (livro.getAnoPublicacao() >= anoInicio && livro.getAnoPublicacao() <= anoFim) {
          livrosPorIntervaloDeAnosList.add(livro);
        }
      }
    }
    return livrosPorIntervaloDeAnosList;
  }

  public Livro pesquisarLivroPotTitulo(String titulo) {
    Livro livroPorTitulo = null;

    if (!livrosList.isEmpty()) {
      for (Livro livro : livrosList) {
        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
          livroPorTitulo = livro;
          break;
        }
      }
    }

    return livroPorTitulo;
  }

  public static void main(String[] args) throws Exception {

    CatalogoLivros catalogoLivros = new CatalogoLivros();

    catalogoLivros.adicionarLivro("Java Como Programar", "Deitel", 2015);
    catalogoLivros.adicionarLivro("Java Para Iniciantes", "Deitel", 2017);
    catalogoLivros.adicionarLivro("Java Para Web", "Deitel", 2019);
    catalogoLivros.adicionarLivro("Java Para Android", "Deitel", 2020);

    System.out.println("Livros por autor:");
    System.out.println(catalogoLivros.pesquisarLivrosPorAutor("Deitel"));

    System.out.println("Livros por intervalo de anos:");
    System.out.println(catalogoLivros.pesquisarLivrosPorIntervaloDeAnos(2017, 2020));

    System.out.println("Livro por título:");
    System.out.println(catalogoLivros.pesquisarLivroPotTitulo("Java Para Web"));

  }
}
