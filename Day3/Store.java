
/* 5. Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated.*/



import java.util.ArrayList;
public class Store {
    static String storeName;
    static String storeLocation;

    ArrayList<Product> productList = new ArrayList<>();

    public static void setStoreDetails(String name, String location) {
        storeName = name;
        storeLocation = location;
    }

    public static void displayStoreDetails() {
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Location: " + storeLocation);
        System.out.println("============================");
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void displayAllProducts() {
        for (Product p : productList) {
            p.displayProduct();
        }
    }
    public static void main(String[] args) {
        Store.setStoreDetails("Ayiradass Stores", "Tirunelveli");
        Product p1 = new Product(1, "Pencil", 5.0, 100);
        Product p2 = new Product(2, "Notebook", 50.0, 200);
        Product p3 = new Product(3, "Marker", 30.0, 150);
        Store store = new Store();
        store.addProduct(p1);
        store.addProduct(p2);
        store.addProduct(p3);
        Store.displayStoreDetails();
        store.displayAllProducts();
    }
}
