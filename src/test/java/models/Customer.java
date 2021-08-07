package models;

public class Customer {
    String id;
    String nombre;
    String sexo;
    String fechaNacimiento;
    String direccion;
    String ciudad;
    String estado;
    String pin;
    String celular;
    String email;
    String accountId;

    public Customer(String id, String nombre, String sexo, String fechaNacimiento, String direccion, String ciudad, String estado, String pin, String celular, String email) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.pin = pin;
        this.celular = celular;
        this.email = email;
        this.accountId = "";
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public String getPin() {
        return pin;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}




