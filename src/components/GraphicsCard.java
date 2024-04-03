package components;

public class GraphicsCard {
  private String model;
  private int memoryGB;
  private double price;

  public GraphicsCard(String model, int memoryGB, double price) {
    this.model = model;
    this.memoryGB = memoryGB;
    this.price = price;
  }

  public String getModel() {
    return this.model;
  }

  public int getMemoryGB() {
    return this.memoryGB;
  }

  public double getPrice() {
    return this.price;
  }
}
