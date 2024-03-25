package tp1.ej3;

public class Estudiante {
  private String nombre;
  private String apellido;
  private String comision;
  private String email;
  private String direccion;

  // Getters
  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public String getComision() {
    return comision;
  }

  public String getEmail() {
    return email;
  }

  public String getDireccion() {
    return direccion;
  }
  // End getters

  // Setters
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public void setComision(String comision) {
    this.comision = comision;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
  // End setters

  public String tusDatos() {
    String nombre = getNombre();
    String apellido = getApellido();
    String comision = getComision();
    String email = getEmail();
    String direccion = getDireccion();

    return nombre + " " + apellido + " " + comision + " " + email + " " + direccion;

  }
}