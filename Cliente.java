package Cliente_Tienda;

public class Cliente
{
    private String nombres;
    private String apellidos;
    private Integer codigo;

    public Cliente(String nombres, String apellidos, Integer codigo)
    {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
    }

    public String getNombres()
    {
        return nombres;
    }

    public String getApellidos()
    {
        return apellidos;
    }

    public Integer getCodigo()
    {
        return codigo;
    }
}