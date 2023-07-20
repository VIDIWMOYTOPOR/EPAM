package Exercises.Payment;

import java.util.ArrayList;
import java.util.List;

public class ex_2 {
    public static void main(String[] args) {
        class Payment {
            private List<Product> products;

            public Payment() {
                this.products = new ArrayList<>();
            }

            public void add(String name, double price) {
                Product product = new Product(name, price);
                products.add(product);
            }

            public double getTotalPrice() {
                double totalPrice = 0.0;
                for (Product product : products) {
                    totalPrice += product.getPrice();
                }
                return totalPrice;
            }

            public void print() {
                System.out.println("Products:");
                for (Product product : products) {
                    System.out.println(product);
                }
            }

            class Product {
                private String name;
                private double price;

                public Product(String name, double price) {
                    this.name = name;
                    this.price = price;
                }

                public String getName() {
                    return name;
                }

                public double getPrice() {
                    return price;
                }

                @Override
                public String toString() {
                    return "Product{" +
                            "name='" + name + '\'' +
                            ", price=" + price +
                            '}';
                }
            }
        }

        Payment payment = new Payment();

        payment.add("Book", 10.99);
        payment.add("Phone", 599.99);
        payment.add("Shirt", 29.99);

        payment.print();
        System.out.println("Total Price: $" + payment.getTotalPrice());
    }
}
