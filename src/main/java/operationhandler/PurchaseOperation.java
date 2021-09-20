package operationhandler;

public class PurchaseOperation implements OperationHandler {

    @Override
    public int changeFruitAmount(int fruitInStorage, int amountFromOperation) {
        if (fruitInStorage < amountFromOperation) {
            throw new RuntimeException("");
        }
        return fruitInStorage - amountFromOperation;
    }
}
