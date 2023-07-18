package TaskManager;

public class TaskManager {
    private String descripcion;

    public TaskManager() {
    }

    public TaskManager(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "TaskManager{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }
}