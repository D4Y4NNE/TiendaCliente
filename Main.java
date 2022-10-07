package Cliente_Tienda;

public class Main
{

    public static void main(String args[])
    {
        //Cliente cliente = new Cliente("Jimmin", "Kim", 12345678);

        Tienda tienda = new Tienda();

        tienda.setNombres("VIP");
        tienda.setDireccion("Av. Scatle");

        tienda.agregarCliente(new Cliente("Jimmin", "Sandoval",12345678));
        tienda.agregarCliente(new Cliente("Jin", "Palacios",438295043));
        tienda.agregarCliente(new Cliente("Mike", "Reyes",37481032));
        tienda.agregarCliente(new Cliente("Jake", "Alvarado",594301293));
        tienda.agregarCliente(new Cliente("Jey", "Kamikase",34921039));

        System.out.println(tienda.getNombres()+tienda.getDireccion());

        for(Cliente cliente: tienda.getCliente())
        
        tienda.ordenar();

        for(Cliente cliente: tienda.getCliente())
        {
            System.out.println(cliente.getNombres()+cliente.getApellidos()+cliente.getCodigo());
        }
    }
}
