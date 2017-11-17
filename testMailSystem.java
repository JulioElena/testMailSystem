
/**
 * Realiza una serie de test para verificar las funcionalidades de
 * las clases del proyecto.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testMailSystem
{
    // Simula un primer usuario de correo.
    private MailClient primerUsuario;
    // Simula un segundo usuario de correo.
    private MailClient segundoUsuario;
    // Simula nuestro servidor de correo.
    private MailServer grupoDServer;
    // Añadimos contador
    int ContadorDeSendMailItemm;
     
    /**
     * Constructor for objects of class testMailSystem
     */
    public testMailSystem()
    {
        grupoDServer = new MailServer();
        primerUsuario = new MailClient(grupoDServer,"Agapito");
        segundoUsuario = new MailClient(grupoDServer,"Eutanasia");
    }
    
    /**
     * Este test debe comprobar que nos de el n?mero de mensajes
     * recibidos correcto para cada usuario y 0 si no hay ningun mensaje.
     */
    public void primeraFuncionTest ()
    {
       primerUsuario.howManyMailItems();
       System.out.print("Se esperaba 0");
       segundoUsuario.howManyMailItems();
       System.out.print("Se esperaba 0");
       primerUsuario.sendMailItem("Eutanasia","Mensaje de pruega","Prueba");
       primerUsuario.sendMailItem("Eutanasia","Mensaje de pruega","Prueba");
       primerUsuario.sendMailItem("Eutanasia","Mensaje de pruega","Prueba");
       segundoUsuario.howManyMailItems();
       System.out.print("Se esperaba 3");
       segundoUsuario.sendMailItem("Agapito","Mensaje de pruega","Prueba");
       segundoUsuario.sendMailItem("Agapito","Mensaje de pruega","Prueba");
       segundoUsuario.sendMailItem("Agapito","Mensaje de pruega","Prueba");
       segundoUsuario.sendMailItem("Agapito","Mensaje de pruega","Prueba");
       segundoUsuario.sendMailItem("Agapito","Mensaje de pruega","Prueba");
       System.out.print("Se esperaba 5");
       segundoUsuario.howManyMailItems();
       ContadorDeSendMailItemm = + 1;
    }

}