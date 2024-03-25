package tp1.ej3;

public class Profesor {
  private String nombre;
  private String apellido;
  private String email;
  private String catedra;
  private String facultad;

  // Getters
  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public String getCatedra() {
    return catedra;
  }

  public String getEmail() {
    return email;
  }

  public String getFacultad() {
    return facultad;
  }
  // End getters

  // Setters
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public void setCatedra(String catedra) {
    this.catedra = catedra;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setFacultad(String facultad) {
    this.facultad = facultad;
  }
  // End setters

  public String tusDatos() {
    String nombre = getNombre();
    String apellido = getApellido();
    String catedra = getCatedra();
    String email = getEmail();
    String facultad = getFacultad();

    return nombre + " " + apellido + " " + catedra + " " + email + " " + facultad;

  }
}