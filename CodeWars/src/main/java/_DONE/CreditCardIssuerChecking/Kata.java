package _DONE.CreditCardIssuerChecking;

public class Kata {
    public static String getIssuer(String cardNumber) {
        String issuer = "Unknown";
        if((cardNumber.length() == 15) && (cardNumber.substring(0,2).equals("34") || cardNumber.substring(0,2).equals("37"))) {
            issuer = "AMEX";
        }
        else if((cardNumber.length() == 13 || cardNumber.length() == 16) && cardNumber.substring(0,1).equals("4")){
            issuer = "VISA";
        }
        else if(cardNumber.length() == 16 && cardNumber.substring(0,4).equals("6011")) {
                issuer = "Discover";
        }
        else if((cardNumber.length() == 16) && ((cardNumber.substring(0,2).equals("51") || (cardNumber.substring(0,2).equals("52"))
        || (cardNumber.substring(0,2).equals("53")) || (cardNumber.substring(0,2).equals("54")) || (cardNumber.substring(0,2).equals("55"))))) {
            issuer = "Mastercard";
        }
            return issuer;
    }
}