import java.util.Date;

public class InternalEmail {
    public  static void showMessage(NameRepository nameRepository, String message) {
        System.out.println(new Date().toString() + " System Generated Email : Good Day " + nameRepository.getIterator() + "! "+ message);
    }
}
