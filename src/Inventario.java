import java.util.*;

public class Inventario {
    public static void main(String[] args) {

        // EJERCCIO: 1
        // TODO: Crear un ArrayList de Productos llamado "inventario"
        ArrayList <Producto> inventario = new ArrayList <Producto> ();
        System.out.println("EJERCICIO 1:\n");
        // TODO: Añadir 5 productos al inventario con estos datos:
        inventario.add(new Producto("P001", "Portátil", 899.99));
        System.out.println("Producto P001 - Portátil añadido al inventario.Añadido...");
        inventario.add(new Producto("P002", "Ratón", 25.50));
        System.out.println("Producto P002 - Ratón añadido al inventario. Añadido...");
        inventario.add(new Producto("P003", "Teclado", 45.00));
        System.out.println("Producto P003 - Teclado añadido al inventario. Añadido...");
        inventario.add(new Producto("P004", "Monitor", 199.99));
        System.out.println("Producto P004 - Monitor añadido al inventario. Añadido...");
        inventario.add(new Producto("P005", "Webcam", 59.90));
        System.out.println("Producto P005 - Webcam añadido al inventario. Añadido...\n");
        // TODO: Mostrar todos los productos
        for (Producto producto : inventario) {
            System.out.println(producto.toString());
        }
        System.out.println("\nEJERCICIO 2:\n");

        // EJERCCIO: 2
        // TODO: Buscar el producto con código "P003" y mostrar sus datos
        for (Producto producto : inventario) {
            if (producto.getCodigo().equals("P003")) {
                System.out.println("Producto encontrado: " + producto.toString() + "\n");
                break;
            }
        }
        // TODO: Verificar si existe un producto llamado "Ratón"
        boolean existeRaton = false;
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase("Ratón")){
                existeRaton = true;
                break;
            }
        }
        if (existeRaton) {
            System.out.println("El producto 'Ratón' existe en el inventario.");
        } else {
            System.out.println("\nEl producto 'Ratón' no existe en el inventario.");
        }
        // TODO: Mostrar cuántos productos hay en el inventario
        System.out.println("\nNúmero de productos en el inventario: " + inventario.size());

        System.out.println("\nEJERCICIO 3:\n");
        // EJERCCIO: 3
        // TODO: Cambiar el precio del Monitor a 179.99€
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase("Monitor")) {
                producto.setPrecio(179.99);
                System.out.println("Precio del Monitor actualizado: " + producto.toString() + "\n");
                break;
            }
        }

        // TODO: Eliminar la Webcam del inventario
        for (Producto producto : inventario) {
            if (producto.getNombre().equalsIgnoreCase("Webcam")) {
                inventario.remove(producto);
                System.out.println("Webcam eliminada del inventario.\n");
                break;
            }
        }
        // TODO: Añadir un nuevo producto: P006 - Altavoces - 35.00€Ç

        inventario.add(new Producto("P006", "Altavoces", 45.00));
        System.out.println("Altavoces añadidos al inventario.\n");

        //EJERCICIO: 4
        System.out.println("EJERCICIO 4:\n");
        // TODO: Calcular el precio total del inventario
        double precioTotal = 0.0;
        for (Producto producto : inventario) {
            precioTotal += producto.getPrecio();
        }
        System.out.println("Precio total del inventario: " + precioTotal + "€\n");
        // TODO: Encontrar el producto más caro
        Producto productoMasCaro = null;
        for (Producto producto : inventario) {
            if (productoMasCaro == null || productoMasCaro.getPrecio() < producto.getPrecio()){
                productoMasCaro = producto;
            }
        }
        System.out.println("El producto más caro es: " + productoMasCaro.toString() + "\n");
        // TODO: Mostrar solo productos con precio superior a 50€
        ArrayList <Producto> productosPrecioMayor50 = new ArrayList <Producto> ();
        for (Producto producto : inventario) {
            if (producto.getPrecio() > 50){
                productosPrecioMayor50.add(producto);
            }
        }

        // Mostrar los productos con precio superior a 50€
        for (Producto producto : productosPrecioMayor50) {
            System.out.println(producto.toString());
        }
    }
}
