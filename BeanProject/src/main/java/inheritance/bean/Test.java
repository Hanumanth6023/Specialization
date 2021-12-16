package inheritance.bean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
 public static void main(String a[]){
 
 ConfigurableApplicationContext context 
                    = new ClassPathXmlApplicationContext("books.xml");
        Book mybook = (Book) context.getBean("myBookBean");
        System.out.println(mybook.toString());
    }
}
