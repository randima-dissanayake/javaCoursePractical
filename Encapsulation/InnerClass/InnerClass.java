public class InnerClass{
    class Printer{
        private int printerId = 34;

        void setId(int id){
            this.printerId = id;
        }
        int getId(){
            return printerId;
        }

    }
    int print(){
        Printer printer=new Printer();
        return printer.getId();
    }
}

class Application{
    public static void main(String[] args) {
        InnerClass innerClass=new InnerClass();
        System.out.print(innerClass.print());
    }
}