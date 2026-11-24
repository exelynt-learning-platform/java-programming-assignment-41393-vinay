public class GitWorkflowDemo {
    public static void main(String[] args) {
        String[] steps = {"check status", "stage changes", "commit with a clear message"};

        for (int i = 0; i < steps.length; i++) {
            System.out.printf("%d. %s%n", i + 1, steps[i]);
        }
    }
}
