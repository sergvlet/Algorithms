package problems_leet_code;

public class ValidPolindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.toLowerCase().replaceAll("[^A-Za-zА-Яа-я]", "");
        StringBuffer buffer = new StringBuffer(s);
        buffer.reverse();
        String data = buffer.toString();
        if (s.equals(data)) {
            System.out.println("Эта строка полиндром");
        } else {
            System.out.println("Эта строка не полиндром");
        }

    }

}

