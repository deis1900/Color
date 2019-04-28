package color.starter;

import color.AppContext;
import color.services.ColorService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);
        ColorService green = (ColorService) context.getBean("green");
        green.define();
        ColorService red = (ColorService) context.getBean("red");
        red.define();
        ColorService blue = (ColorService) context.getBean("blue");
        blue.define();
        ColorService white = (ColorService) context.getBean("white");
        white.define();
        ColorService black = (ColorService) context.getBean("black");
        black.define();

    }
}
