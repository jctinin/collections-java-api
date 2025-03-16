public class App {
    public static void main(String[] args) throws Exception {

        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar Python");
        listaTarefas.adicionarTarefa("Estudar JavaScript");
        listaTarefas.adicionarTarefa("Estudar Ruby");

        listaTarefas.obterDescricoesTarefas();

        System.out.println("Número de tarefas: " + listaTarefas.obterNumeroTarefas());

        listaTarefas.removerTarefa("Estudar Python");

        listaTarefas.obterDescricoesTarefas();

        System.out.println("Número de tarefas: " + listaTarefas.obterNumeroTarefas());

    }
}
