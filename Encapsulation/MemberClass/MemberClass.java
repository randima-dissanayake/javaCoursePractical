public class MemberClass{
    int print(){
        class Printer{
            private int printerId = 30;
            int getId(){
                return printerId;
            }
            void setId(int id){
                this.printerId = id;
            }
        }
        Printer printer=new Printer();
        return printer.getId();
    }
}

class Application{
    public static void main(String[] args) {
        MemberClass memberClass=new MemberClass();
        System.out.print(memberClass.print());
    }
}