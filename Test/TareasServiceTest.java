import TaskManager.TareasService;
import TaskManager.TaskManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class TareasServiceTest {

    TaskManager tm;
    TareasService ts;

    @BeforeEach
    void setUp() {
        tm = new TaskManager();
        ts = new TareasService();
        ts.agregarTarea("tarea 1");


    }
    @AfterEach
    void tearDown() {
    }

    @Test
    void agregarTarea() {
        assertEquals(1, ts.getTareas().size());
        ts.agregarTarea("tarea 2");
        assertEquals(2, ts.getTareas().size());
    }

    @Test
    void eliminarTarea() {
        ts.eliminarTarea(0);
        assertEquals(0, ts.getTareas().size());
    }

    @Test
    void listarTareas() {
    }
}