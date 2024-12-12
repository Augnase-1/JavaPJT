package iterativestatement;

public class StringReverse {

	public static void main(String[] args) {
     
      String st = "Augnase";
      String reversedStr = "";
        for (int i = st.length() - 1; i >= 0; i--) {
            reversedStr += st.charAt(i);
        }
        System.out.println("Entered String: " + st);
        System.out.println("Reversed String: " + reversedStr);
    }
}

	