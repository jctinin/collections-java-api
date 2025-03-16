import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

  private List<Tarefa> tarefaslist = new ArrayList<Tarefa>();

  public void adicionarTarefa(String descricao) {
    tarefaslist.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {

    List<Tarefa> tarefasParaRemoverList = new ArrayList<Tarefa>();

    for (Tarefa tarefa : tarefaslist) {
      if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasParaRemoverList.add(tarefa);
      }
    }

    tarefaslist.removeAll(tarefasParaRemoverList);

  }

  public int obterNumeroTarefas() {
    return tarefaslist.size();
  }

  public void obterDescricoesTarefas() {
    System.out.println(tarefaslist.toString());
  }

}
