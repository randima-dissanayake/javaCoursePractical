public class BasicEncapsulation{
    private int userId = 12;

    public int getId(){
        return userId;
    }
    public void setId(int id){
        if (id<1)
            System.out.print("Id is invalid!");
        else
            userId = id;
    }
}
