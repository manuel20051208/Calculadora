import java.time.LocalDate;

public class Usuario {
    private String id;
    private String nombre;
    private LocalDate fechaDeNacimiento;
    private String tipoDeSangre;
    private Double altura;

    public Usuario() {
    }

    public Usuario(String id, String nombre, LocalDate fechaDeNacimiento, String tipoDeSangre, Double altura) {
        setId(id);
        setNombre(nombre);
        setFechaDeNacimiento(fechaDeNacimiento);
        setTipoDeSangre(tipoDeSangre);
        setAltura(altura);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getTipoDeSangre() {
        return tipoDeSangre;
    }

    public void setTipoDeSangre(String tipoDeSangre) {
        this.tipoDeSangre = tipoDeSangre;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}