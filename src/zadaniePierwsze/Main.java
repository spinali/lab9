package zadaniePierwsze;

public class Main {
    public static void main(String[] args) {
        ExtentionGen gen = new ExtentionGen();
        try{
            gen.generateNullPointerException();
        }catch (NullPointerException e){
            System.out.println("Wystapil wyjatek NullPointerException");
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
