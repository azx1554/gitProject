package Xi.DesignPattern.MediatorPattern;

import java.util.ArrayList;

/**
 * Created by Xi on 2018/5/21.
 */
public abstract class Mediator {

    protected ArrayList<Colleague> colleagues = new ArrayList<>();

    public void register(Colleague colleague) {
        colleagues.add(colleague);
    }

    public abstract void operation();

}
