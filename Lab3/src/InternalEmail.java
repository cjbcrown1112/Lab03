import java.util.Date;

public class InternalEmail {
    public static void showMessage(NameRepository nameRepository, String message) {

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println(new Date().toString() + " System Generated Email : Good Day " + name + "! " + message);
        }
    }
}
