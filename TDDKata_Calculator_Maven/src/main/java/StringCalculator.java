public class StringCalculator {

    public static int add(String numbers) {
        if (numbers.equals(""))
            return 0;
        String[] values = numbers.replace("\n", ",").split(",");

        int result = 0;
        for (String value : values) {
            result += Integer.valueOf(value);
        }
        System.out.println(result);
        return result;
    }
}
