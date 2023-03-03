public class Product {
    String name , brand;
    int price , weight;

    public Product(){
        name = "";
        brand = "";
        price = 0;
        weight = 0;
    }

    public Product(String name, String brand , int price , int weight){
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.weight = weight;
    }
    @Override
    public String toString(){
        return "Product Name   : "+name+"\n"+
        "Product Brand  : "+brand+"\n"+
        "Product Price  : "+price+"\n"+
        "Product Weigth : "+weight+"";
    }
}
