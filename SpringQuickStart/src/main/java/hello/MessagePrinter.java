package hello;



/**
 * Printer class
 */

public class MessagePrinter {
    /**
     *  create a relationship with class MessageService, Agregation
     */

    private MessageService service;


    public MessagePrinter() {
        super();
        System.out.println("Message Printer");
    }

    /**
     * setter of the value service
     * @param service
     */

    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
