package models;
//@author Norberto

public class ModelRfc {

    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String fechaNacimiento;
    private String rfc;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String rfcObtener(String value) {
        try {
            String result = value;
            System.out.println(value);
            String[] arrayResult = result.split(" ");
            for (int i = 0; i < arrayResult.length; i++) {
                result = arrayResult[i];
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

}
