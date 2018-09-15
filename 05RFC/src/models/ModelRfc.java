package models;
//@author Norberto

import java.text.SimpleDateFormat;
import java.util.Date;


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

    public String rfcObtenerPP(String value) {
        try {
            String result = value; //Variable que se le va a aplicar split
            System.out.println(value);
            String[] arrayResult = result.split(" "); //Separar el apellido
            for (int i = 0; i < arrayResult.length; i++) {
                result = arrayResult[i];
            }
            System.out.println(result);

            String str = result;
            Character primerLRfc = null;
            Character primerLVRfc = null;

            for (int x = 0; x < str.length(); x++) {
                if (x == 0) {
                    primerLRfc = str.charAt(x);
                    System.out.println(primerLRfc);
                } else if (str.charAt(x) == 'a' || str.charAt(x) == 'e' || str.charAt(x) == 'i' || str.charAt(x) == 'o' || str.charAt(x) == 'u') {
                    primerLVRfc = str.charAt(x);
                    System.out.println(Character.toUpperCase(primerLVRfc));
                    break;
                }
            }
            value = Character.toString(primerLRfc) + Character.toString(primerLVRfc);
            System.out.println(value);
        } catch (Exception e) {
            System.out.println(e);
        }
        return value.toUpperCase();
    }

    public String rfcObtenerSP(String valueDos) {
        try {
            String result = valueDos; //Variable que se le va a aplicar split
            System.out.println(valueDos);
            String[] arrayResult = result.split(" "); //Separar el apellido
            for (int i = 0; i < arrayResult.length; i++) {
                result = arrayResult[i];
            }
            System.out.println(result);

            String str = result;
            Character primerLRfc = null;

            for (int x = 0; x < str.length(); x++) {
                if (x == 0) {
                    primerLRfc = str.charAt(x);
                    System.out.println(primerLRfc);
                    break;
                }
            }
            valueDos = Character.toString(primerLRfc);

        } catch (Exception e) {
        }
        return valueDos.toUpperCase();
    }

    public String rfcObtenerN(String valueTres) {
        try {
            String str = valueTres;
            Character primerLRfc = str.charAt(0);
            valueTres = Character.toString(primerLRfc);
            System.out.println(valueTres);
        } catch (Exception e) {
        }
        return valueTres.toUpperCase();
    }
    
     public String fechaactual(Date fecha) {
        Date fechaDos = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
        return sdf.format(fecha);
    }
}
