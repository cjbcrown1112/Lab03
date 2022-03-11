public class NameRepository {
    public String names[] = {"CJ" , "Regina" , "Diloy" , "Corona" };

    public Iterator getIterator() {

        return new NameIterator();
    }

    public void sendMessage(String message) {

        InternalEmail.showMessage(this, message);
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {

            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
