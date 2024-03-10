public class Main {
    public static void main(String[] args) {
        String sr=null;
        try {
            int length=sr.length();
        }catch (NullPointerException e){
            System.out.println("Caught Exception: "+e.getMessage());
        }
    }
}