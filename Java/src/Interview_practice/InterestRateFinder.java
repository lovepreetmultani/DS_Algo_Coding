package src.Interview_practice;

class Bank {
    public Float getInterestRate() {
        return 3.0f;
    }
}

class CitiBank extends Bank {
    @Override
    public Float getInterestRate() {
        return 5.0f;
    }
}

public class InterestRateFinder {
    public static void main(String[] args) {
        var citiBank = new CitiBank();
        System.out.println("Interest Rate: " + citiBank.getInterestRate());
    }
}
