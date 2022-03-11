

public class Main {

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            nameRepository.sendMessage("This is Email is to Remind You to Submit your BIR Form No. 1701");
        }
    }
}
