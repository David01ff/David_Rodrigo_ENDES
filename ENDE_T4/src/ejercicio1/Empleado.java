package ejercicio1;

/**
 * Clase Empleado que representa la información y las operaciones de
un empleado.
 * <p>
 * Esta clase proporciona métodos para establecer y obtener los
detalles de un empleado
 * como su nombre, edad y departamento.
 * </p>
 *
 * @author Rodrigo Moreno Bielsa
 * @version 1.0
 */

public class Empleado extends Persona {
    private String departamento;

    /**
     * Nombre del empleado, del tipo 'String'.
     * Edad del empleado, del tipo 'edad'.
     * Departamento del empleado, del tipo 'String'.
     */

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
}