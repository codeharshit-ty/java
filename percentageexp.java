import java.util.Scanner;

public class percentageexp {

    public static Candidate getCandidateDetails() throws InvalidInternException {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("enter the candidate details");
        System.out.println("Name");
        String name = scanner.next();
        
        System.out.println("Gender");
        String gender = scanner.next();
        
        System.out.println("enter the percentage in 10th");
        int percentage = scanner.nextInt();

        // Check condition directly
        if (percentage < 50) {
            throw new InvalidInternException("Registration Failed. Percentage cannot be less than 50 %.");
        }

        // If percentage is >= 50, create and return the Candidate object
        Candidate candidate = new Candidate();
        candidate.setName(name);
        candidate.setGender(gender);
        candidate.setPercentage(percentage);

        return candidate;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to InterHiring Tool");

        try {
            Candidate candidate = getCandidateDetails();
            System.out.println("Registration Successful for: " + candidate.getName());
        } catch (InvalidInternException e) {
            System.out.println(e.getMessage());
        }
    }
}