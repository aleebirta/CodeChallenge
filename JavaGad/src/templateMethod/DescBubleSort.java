package templateMethod;

public class DescBubleSort extends TemplateMethodBubleSort {
    @Override
    public boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        return i1 < i2;
    }
}
