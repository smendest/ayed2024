
// import tp1.ej1.Ejercicio1;
// import tp1.ej2.Ejercicio2;

import tp1.ej3.Estudiante;
import tp1.ej3.Profesor;

public class App {
  public static void main(String[] args) throws Exception {
    // Ejercicio1.showNumbersFor(88, 8);
    // Ejercicio1.showNumbersWhile(1, -3);
    // Ejercicio1.showNumbersRecursive(10, 3);

    // Aquí debería guardar el arreglo en una variable para luego utilizarlo.
    // Ejercicio2.multiplos();

    // ======================================================================================
    /* Ejercicio 3: Clase Test */
    /*
     * cree un arreglo con 2 objetos Estudiante,
     * otro arreglo con 3 objetos Profesor, y
     * luego recorra ambos arreglos imprimiendo los valores obtenidos mediante el
     * método tusDatos().
     * Recuerde asignar los valores de los atributos de los objetos Estudiante y
     * Profesor invocando los respectivos métodos setters.
     */
    int cantEstudiantes = 2;
    int cantProf = 3;
    Estudiante[] arrEstudiantes = new Estudiante[cantEstudiantes];
    Profesor[] arrProfesores = new Profesor[cantProf];

    // Se instancian los objetos
    // Como no enviamos params podría hacerse con un for()
    arrEstudiantes[0] = new Estudiante();
    arrEstudiantes[1] = new Estudiante();
    arrProfesores[0] = new Profesor();
    arrProfesores[1] = new Profesor();
    arrProfesores[2] = new Profesor();

    // Inicialización de Estudiantes
    arrEstudiantes[0].setApellido("Menem");
    arrEstudiantes[0].setNombre("Carlos");
    arrEstudiantes[0].setComision("2A");
    arrEstudiantes[0].setDireccion("avenida siempre vivas");
    arrEstudiantes[0].setEmail("carlitosmenem@gmail.com");

    arrEstudiantes[1].setApellido("Basile");
    arrEstudiantes[1].setNombre("Coco");
    arrEstudiantes[1].setComision("3A");
    arrEstudiantes[1].setDireccion("Ruta 15");
    arrEstudiantes[1].setEmail("coquito@gmail.com");

    for (int i = 0; i < cantEstudiantes; i++) {
      System.out.println(arrEstudiantes[i].tusDatos());
    }

    // Inicialización de Profesores
    arrProfesores[0].setApellido("Tevez");
    arrProfesores[0].setNombre("Carlos");
    arrProfesores[0].setCatedra("F2");
    arrProfesores[0].setFacultad("Fiorito");
    arrProfesores[0].setEmail("apache@gmail.com");

    arrProfesores[1].setApellido("Palacio");
    arrProfesores[1].setNombre("Rodrigo");
    arrProfesores[1].setCatedra("R2");
    arrProfesores[1].setFacultad("Banfiled");
    arrProfesores[1].setEmail("rodri78@gmail.com");

    arrProfesores[2].setApellido("Coloccini");
    arrProfesores[2].setNombre("Fabrizzio");
    arrProfesores[2].setCatedra("9B");
    arrProfesores[2].setFacultad("Newcastl");
    arrProfesores[2].setEmail("elcolo@gmail.com");

    for (int i = 0; i < cantProf; i++) {
      System.out.println(arrProfesores[i].tusDatos());
    }
    // ======================================================================================

    /* Ejercicio 4 */

  }
}
