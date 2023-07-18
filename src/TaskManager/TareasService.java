package TaskManager;

import java.util.ArrayList;

public class TareasService {
    private ArrayList<TaskManager> tareas = new ArrayList<>();

    public ArrayList<TaskManager> getTareas() {
        return tareas;
    }
    public void agregarTarea(String desc){
        tareas.add(new TaskManager(desc));
    }

    public void eliminarTarea(int indice){
        tareas.remove(indice);
    }

    public void listarTareas(){
        for (TaskManager tk: tareas ) {
            System.out.println(tk);
        }
    }

    @Override
    public String toString() {
        return "TareasService{" +
                "tareas=" + tareas +
                '}';
    }
}