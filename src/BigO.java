public class BigO {
    public void reverse() {
        String[] rev = new String[values.length];
        //int newI = values.length-1;
        for (int i = 0; i < values.length; i++) {

            rev[i] = values[values.length-i-1];
            //rev[i] = values[newI];
            //newI--;
        }
        values = rev;
    }
}
