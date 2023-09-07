public class ValidateCardNumber {

    public boolean isValidCardNumber(String cardNumber) {
        int sum = 0;
        boolean doubleDigit = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(cardNumber.charAt(i));
            if (doubleDigit) {
                digit *= 2;
                if (digit > 9) {
                    digit = digit / 10 + digit % 10;
                }
            }
            sum += digit;
            doubleDigit = !doubleDigit;
        }
        return sum % 10 == 0;
    } 

    public static void main(String[] args){
        ValidateCardNumber obj = new ValidateCardNumber();
        String cardNumber1 = "4242424242426742";
        String cardNumber2 = "1111111111111111";
        boolean isValid = obj.isValidCardNumber(cardNumber1);
        boolean isValid1 = obj.isValidCardNumber(cardNumber2);
        System.out.println("The card number is valid or not: " + isValid);
        System.out.println("The card number is valid or not: " + isValid1);
    }
}


