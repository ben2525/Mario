package Mario.Pset2;

public class PrintContext {
    private PrintStrategy strategy;

    public void setStrategy(PrintStrategy strategy) {
        this.strategy = strategy;
    }

    public void printTextContext(String layers) {
        strategy.printText(layers);
    }

}
