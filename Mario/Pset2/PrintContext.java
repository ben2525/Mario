package Mario.Pset2;

/**
 * Created by ben on 8/3/15.
 */
public class PrintContext {
    private PrintStrategy strategy;

    public void setStrategy(PrintStrategy strategy) {
        this.strategy = strategy;
    }

    public void printText(String layers) {
        strategy.printText(layers);
    }

}
