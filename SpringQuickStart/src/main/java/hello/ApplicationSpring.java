package hello;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class ApplicationSpring {

    public static void main(String [] args) {
        System.out.println("applicationSpring");

        // initiser Spring
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationSpring.class);
        // MessagePrinter Object
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        // MessageService Object
        // MessageService service = context.getBean(MessageService.class);

        System.out.println(printer);
        // System.out.println(service);
        // printer.setService(service);
        printer.printMessage();
    }
}
