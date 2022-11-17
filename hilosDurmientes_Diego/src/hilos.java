import java.time.Duration;

public class hilos extends  Thread{

    String nombreHilo;

    //Constructor
    public hilos(String nombreHilo) {
        this.nombreHilo = nombreHilo;
    }



    public void  run(){

        long aleatorio = (long) (Math.random()*10+1);//Generamos un número aleatorio entre 1 y 10

        while (true){
            //Imprimimos que hilo está trabajando
            System.out.println("Soy el bucle "+ this.nombreHilo +" y estoy trabajando");

            try {
                /*
                Hacemos que el método paré cuando en un segundo entre 1 y 10,
                lo hacemos pasándole el aleatorio por parámetro al método
                Duration.ofSeconds() para que los tome como segundos en el sleep
                 */

                Thread.sleep(Duration.ofSeconds(aleatorio));
            } catch (InterruptedException e) {
                //Manejamos las excepciones.
                System.out.println("El hilo se ha visto interrumpido por este error: "+e);;
            }
        }


    }


}
