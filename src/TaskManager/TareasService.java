package TaskManager;

import java.util.ArrayList;

public class TareasService {
    ArrayList<TaskManager> tareas = new ArrayList<>();

    public void agregarTarea(String desc) {
        tareas.add(new TaskManager(desc));
    }

    public void eliminarTarea(int indice) {
        tareas.remove(indice);
    }

    public void listarTareas() {
        for (TaskManager tk : tareas) {
            System.out.println(tk);
        }
    }

}
