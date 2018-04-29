package General;

public class RandomString {

    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++)
//            System.out.println(randomAlphaNumeric());

//        System.out.println(UUID.randomUUID().toString());
//        System.out.println(Long.toHexString(Double.doubleToLongBits(Math.random())));


    }



    public static String randomAlphaNumeric() {
        final String ALPHA_NUMERIC_STRING = "abcdefghijklmnopqrstuvwxyz0123456789";
        int count = 8;
        StringBuilder builder = new StringBuilder();
        while (count-- != 0) {
            int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
            builder.append(ALPHA_NUMERIC_STRING.charAt(character));
        }
        return "mlcautomationuser_" + builder.toString() + "@mobilogy.com";
    }


}
