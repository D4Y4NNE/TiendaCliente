package Cliente_Tienda;

public class Tienda
{
    private String nombres;
    private String direccion;
    private Cliente cliente[];
    private int contadorCliente;

    public Tienda()
    {
        this.cliente = new Cliente[5];
        this.contadorCliente = 0;
    }

    public Tienda(String nombres, String direccion)
    {
        this.nombres = nombres;
        this.direccion = direccion;
    }
    public void agregarCliente(Cliente cliente[])
    {
        this.cliente[contadorCliente++] = cliente;
    }

    public Cliente[] getCliente()
    {
        return this.cliente;
    }

    public void ordenar()
    {
        for(int i=0; i<cliente.length; i++)
        {
            for(int j=i+1; j<cliente.length; j++)
            {
                if(cliente[i].getCodigo()>cliente[j].getCodigo())
                {
                    Cliente clientes=cliente[i];
                    cliente[i]=cliente[j];
                    cliente[j]=clientes;
                }
            }
        }
    }

    public void setNombres(String nombres)
    {
        this.nombres = nombres;
    }

    public String getNombres()
    {
        return nombres;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public String getDireccion()
    {
        return direccion;
    }
}
