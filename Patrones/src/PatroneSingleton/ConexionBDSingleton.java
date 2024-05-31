package PatroneSingleton;

public class ConexionBDSingleton {
    private static ConexionBDSingleton instacia;

    //constructor privado
    private ConexionBDSingleton() {
        System.out.println("Conectando con la base de datos");
    }


    public static ConexionBDSingleton getInstacia() {
        if (instacia == null) {
            instacia = new ConexionBDSingleton();
        }
        return instacia;


    }
}

