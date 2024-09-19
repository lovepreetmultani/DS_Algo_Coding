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
    public Float getParentInterestRate() {
        return super.getInterestRate();
    }
}

public class InterestRateFinder {
    public static void main(String[] args) {
        var bank = new CitiBank();
        System.out.println("Interest Rate: " + bank.getInterestRate());
        System.out.println("Bank Interest Rate via CitiBank: " + bank.getParentInterestRate());
    }
}
