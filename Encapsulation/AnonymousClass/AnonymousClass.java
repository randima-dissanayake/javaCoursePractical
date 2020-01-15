public class AnonymousClass{
    int print(){
        return new Object(){
            private int printerId = 30;
            int getId(){
                return printerId;
            }
        }.getId();
    }
}

class Application{
    public static void main(String[] args) {
        AnonymousClass anonymousClass=new AnonymousClass();
        System.out.print(anonymousClass.print());
    }
}