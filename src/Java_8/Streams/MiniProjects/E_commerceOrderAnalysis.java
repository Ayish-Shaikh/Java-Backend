package Java_8.Streams.MiniProjects;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class E_commerceOrderAnalysis {
    public static void main(String[] args) {
        List<Order> orderList = List.of(
                new Order("Abir" , "Air Conditioner" , 50000),
                new Order("Riya", "Laptop", 78000),
                new Order("Aman", "Smartphone", 42000),
                new Order("Neha", "Refrigerator", 62000),
                new Order("Sahil", "Washing Machine", 45000),
                new Order("Kiran", "Microwave Oven", 18000),
                new Order("Vikram", "Smart TV", 65000),
                new Order("Tara", "Vacuum Cleaner", 22000),
                new Order("Deepak", "Gaming Console", 55000),
                new Order("Simran", "Dishwasher", 58000),
                new Order("Rohit", "Bluetooth Speaker", 12000),
                new Order("Aditi", "Tablet", 35000),
                new Order("Manav", "Water Purifier", 15000),
                new Order("Pooja", "Camera", 48000),
                new Order("Kunal", "Smartwatch", 25000),
                new Order("Sneha", "Hair Dryer", 5000),
                new Order("Arjun", "Printer", 14000),
                new Order("Meera", "Home Theater System", 40000),
                new Order("Ravi", "Air Purifier", 28000),
                new Order("Isha", "Induction Cooktop", 7000),
                new Order("Rahul", "Ceiling Fan", 3500),
                new Order("Ananya", "Electric Kettle", 2500),
                new Order("Varun", "Router", 6000),
                new Order("Divya", "Smart Light Bulb", 1500),
                new Order("Rakesh", "Drone", 85000),
                new Order("Priya", "Monitor", 30000),
                new Order("Tanmay", "Keyboard", 4500),
                new Order("Avni", "Mouse", 2200),
                new Order("Yash", "Headphones", 9000),
                new Order("Nisha", "Coffee Maker", 8000),
                new Order("Harsh", "Iron", 3500),
                new Order("Muskan", "Toaster", 2700),
                new Order("Aarav", "Projector", 43000),
                new Order("Nitin", "Smart Door Lock", 12000),
                new Order("Ira", "Electric Scooter", 88000),
                new Order("Dhruv", "Treadmill", 60000),
                new Order("Ritika", "Smartwatch", 18000),
                new Order("Sanya", "Hair Straightener", 4500),
                new Order("Kabir", "Power Bank", 3200),
                new Order("Tanishq", "Wireless Earbuds", 7800),
                new Order("Aniket", "Desktop PC", 90000),
                new Order("Charu", "Washing Machine", 47000),
                new Order("Dev", "Vacuum Robot", 52000),
                new Order("Maya", "Smart Speaker", 11000),
                new Order("Saurabh", "Refrigerator", 63000),
                new Order("Avantika", "Blender", 4200),
                new Order("Zoya", "Food Processor", 9500),
                new Order("Parth", "Water Geyser", 11500),
                new Order("Rehan", "Air Fryer", 10500),
                new Order("Kiara", "Electric Stove", 8900)
        );

        //This is the total revenue sold by our company
        System.out.println( "August Sales By our Company : "+orderList.stream().mapToDouble(x -> x.amount).sum());

        System.out.println("\nTop 3 Expensive Orders at our Company : ");
        //finding 3 expensive orders
        orderList.stream().sorted((a,b) -> Double.compare(b.amount,a.amount))
                .limit(3).forEach(e -> System.out.println(e.product + " ₹ " + e.amount));

        //customer spending summary

        System.out.println("\nTop Customer Spending Summary : ");
        Map<String, Double> collect = orderList.stream().collect(Collectors.groupingBy(x -> x.customer, Collectors.summingDouble(x -> x.amount)));
        collect.forEach((cust , sum) ->
                System.out.println(cust + " spent ₹ " + sum));
    }
}
class Order {
    String customer, product;
    double amount;

    Order(String customer, String product, double amount) {
        this.customer = customer;
        this.product = product;
        this.amount = amount;
    }
}