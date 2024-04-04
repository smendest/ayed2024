package tp1.ej7.d;

import java.util.ArrayList;
import java.util.List;

public class TestEstudiante {

  public static void main(String[] args) {

    // Estudiante est = new Estudiante("Carlos", "Menem", "Abogacia", 1234, 23);

    /* Primera Lista */
    List<Estudiante> studentsList = new ArrayList<Estudiante>();
    studentsList.add(new Estudiante("Carlos", "Menem", "Abogacia", 1234, 23));
    studentsList.add(new Estudiante("Daniel", "Scioli", "Economía", 1235, 14));
    studentsList.add(new Estudiante("Richard", "Stallman", "Computer Science", 2222, 33));

    /* Segunda Lista */
    List<Estudiante> secondList = new ArrayList<Estudiante>();
    // Copia directa: SE PUEDE?
    secondList = studentsList;

    secondList.get(0).setNombre("Carliños");
    System.out.println(studentsList.get(0).getNombre());
    System.out.println(secondList.get(0).getNombre());

  }
}
