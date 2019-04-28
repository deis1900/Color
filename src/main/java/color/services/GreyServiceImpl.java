package color.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("grey")
@Scope("prototype")
public class GreyServiceImpl implements ColorService, MixedColorService {

    @Autowired
    @Qualifier("white")
    private ColorService white;

    @Autowired
    @Qualifier("black")
    private ColorService black;

    @Override
    public void mix() {
        System.out.println(String.format("yellow = %s + %s", white.toString(), black.toString()));
    }

    @Override
    public String toString() {
        return "grey";
    }

    @Override
    public void define() {
        mix();
    }
}
