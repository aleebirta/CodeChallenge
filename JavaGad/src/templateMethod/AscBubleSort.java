package templateMethod;

public class AscBubleSort extends TemplateMethodBubleSort {
    @Override
    public boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        return i1 > i2;
    }
}
