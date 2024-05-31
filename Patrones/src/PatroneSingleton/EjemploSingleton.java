package PatroneSingleton;

public class EjemploSingleton {

    public static void main(String[] args) {

        for(int i = 0;i<10;i++){
            ConexionBDSingleton com =ConexionBDSingleton.getInstacia();
            System.out.println("com = " + com);
        }

    }
}
