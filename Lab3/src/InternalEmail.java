
import java.util.logging.Logger;
import java.util.logging.Level;


public class InternalEmail {
    final private static Logger logger = Logger.getLogger(InternalEmail.class.getName());
    public  static void showMessage(NameRepository nameRepository, String message) {

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            logger.log(Level.INFO, " System Generated Email : Good Day " + name + "! " + message);
        }
    }
}
