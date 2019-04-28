package color.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("white")
@Qualifier("white")
@Scope("prototype")
public class WhiteServiceImpl implements ColorService, MixedColorService {

    @Autowired
    @Qualifier("red")
    ColorService red;

    @Autowired
    @Qualifier("blue")
    ColorService blue;

    @Autowired
    @Qualifier("green")
    ColorService green;


    @Override
    public void mix() {
        System.out.println(String.format("white = %s + %s + %s", red.toString(), blue.toString(), green.toString()));
    }

    @Override
    public String toString(){
        return "white";
    }

    @Override
    public void define(){
        mix();
    }
}
