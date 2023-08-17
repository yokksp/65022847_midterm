/**
 * midterm
 */
public class midterm {

    public static void main(String[] args) {
        Product P1 = new Product();
        Electronics P2 = new Electronics();
        Smartphone P3 = new Smartphone();
        Book P4 = new Book();

        P1.setName("chair");
        P1.setPrice(500);

        P2.setName("Television");
        P2.setPrice(20000);
        P2.setBrand("Samsung");
        P2.setModel("Neo QLED");

        P3.setName("Iphone");
        P3.setPrice(40000);
        P3.setBrand("Apple");
        P3.setModel("Iphone 99");
        P3.setOperatingSystem("IOS");

        P4.setName("OOP Programming");
        P4.setPrice(250);
        P4.setAuthor("John Doe");
        P4.setPages(300);

        System.out.println("Product Name : " + P1.getname());
        System.out.println("Product Price : " + P1.getPrice());

        System.out.println("Product Name : " + P2.getname());
        System.out.println("Product Price : " + P2.getPrice());
        System.out.println("Brand : " + P2.getBrand());
        System.out.println("Model : " + P2.getmodel());
       

        System.out.println("Product Name : " + P3.getname());
        System.out.println("Product Price : " + P3.getPrice());
        System.out.println("Brand : " + P3.getBrand());
        System.out.println("Model : " + P3.getmodel());
        System.out.println("Opereting System : " + P3.getOperatingSystem());

        System.out.println("Product Name : " + P4.getname());
        System.out.println("Product Price : " + P4.getPrice());
        System.out.println("Author : " + P4.getAuthor());
        System.out.println("Namber of Pages : " + P4.getPages());

    }
}
class Product{
    private String name;
    private double price;

    Product(){

    }
    public String getname(){
        return this.name;

    }
    public void setName(String Name){
        this.name = Name;

    }
    public double getPrice(){
        return this.price;

    }
    public void setPrice(double price){
        this.price = price;
    }

}
class Electronics extends Product{
    private String brand;
    private String model;

    Electronics(){

    }
    public String getBrand(){
        return this.brand;

    }
    public void setBrand(String brand){
        this.brand = brand;

    }
    public String getmodel(){
        return this.model;

    }
    public void setModel(String model){
        this.model = model;
    }
}
class Book extends Product{
    private String author;
    private int pages;

    Book(){

    }
    public String getAuthor(){
        return this.author;

    }
    public void setAuthor(String author){
        this.author = author;

    }
    public int getPages(){
        return this.pages;

    }
    public void setPages(int pages){
        this.pages = pages;
    }
}
class Smartphone extends Electronics{
    private String OperatingSystem;

    Smartphone(){

    }
    public String getOperatingSystem(){
        return this.OperatingSystem;
    }
    public void setOperatingSystem(String OperatingSystem){
        this.OperatingSystem = OperatingSystem;
    }
}