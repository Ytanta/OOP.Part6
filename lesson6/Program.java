package geekbrains.lesson6;

public class Program {
    public static void main(String[] args) {


        NewScannerOrder infoOrder = new NewScannerOrder();

        Order order = new Order(infoOrder.getClientName(), infoOrder.getProduct(), infoOrder.getQnt(), infoOrder.getPrice());

        SaveToJson saveToJson = new SaveToJson(order);

        saveToJson.saveToJson();

    }
}
