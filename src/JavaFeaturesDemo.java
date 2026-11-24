import java.util.List;

public class JavaFeaturesDemo {

    public record Technology(String name, String domain, int releaseYear) {}

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("       Java Features & Ecosystem Demonstration    ");
        System.out.println("==================================================");

        List<Technology> techList = List.of(
            new Technology("Spring Boot", "Enterprise Microservices", 2014),
            new Technology("Apache Kafka", "Real-Time Event Streaming", 2011),
            new Technology("Apache Spark", "Big Data Analytics", 2014),
            new Technology("Android", "Mobile Operating Systems", 2008)
        );

        System.out.println("Key Real-World Java Technologies:");
        techList.forEach(t -> 
            System.out.println(" - " + t.name() + " [" + t.domain() + "], Active since " + t.releaseYear())
        );

        System.out.println("\nJava Platform Status: Verified and Runnable cleanly.");
    }
}
