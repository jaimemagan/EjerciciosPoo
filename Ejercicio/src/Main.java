
public class Main {
    public static void main(String[] args) {
        //Creando un agujero
        RoundHole roundHole = new RoundHole(10);
        //creamos un RoungPeg
        RoundPeg roungPeg = new RoundPeg(8);

         boolean fits = roundHole.fits(roungPeg);
         System.out.println(fits);

         //creamos un SquarePeg
         SquarePeg squarePeg = new SquarePeg(10);
         SquarePegAdapter squarePegAdapter = new SquarePegAdapter(10, squarePeg);
         fits = roundHole.fits(squarePegAdapter);
         System.out.println(fits);




      /*  public class MenuPrincipal {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int opcion;

                do {
                    System.out.println("----- Menú Principal -----");
                    System.out.println("1. Agregar");
                    System.out.println("2. Eliminar");
                    System.out.println("3. Observar");
                    System.out.println("4. Salir");
                    System.out.print("Elige una opción (1-4): ");
                    opcion = scanner.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("Has seleccionado la opción de Agregar.");
                            // Aquí puedes implementar la lógica para agregar elementos.
                            break;
                        case 2:
                            System.out.println("Has seleccionado la opción de Eliminar.");
                            // Aquí puedes implementar la lógica para eliminar elementos.
                            break;
                        case 3:
                            System.out.println("Has seleccionado la opción de Observar.");
                            // Aquí puedes implementar la lógica para mostrar elementos.
                            break;
                        case 4:
                            System.out.println("¡Hasta luego!");
                            break;
                        default:
                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                    }
                } while (opcion != 4);

                scanner.close();
            }
        }
*/



    }
}