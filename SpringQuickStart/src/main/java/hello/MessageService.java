package hello;


/**
 * print service
 */


public class MessageService {

    public MessageService() {
        super();
        System.out.println("MessageService");
    }

    /**
     * run the print service
     * @return string type
     */
    public String getMessage(){
        return "Hello, world!";
    }
}
