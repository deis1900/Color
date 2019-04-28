package color.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("black")
@Qualifier("black")
@Scope("prototype")
public class BlackServiceImpl implements ColorService, MixedColorService {

    @Override
    public void mix() {
        System.out.println("black");
    }

    @Override
    public void define() {
        mix();
    }

    @Override
    public String toString() {
        return "black";
    }
}
