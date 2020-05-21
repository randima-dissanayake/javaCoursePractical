public class User implements Cloneable{
        String name;
        String email;
//        String role;

        public User(String name,String email) {
            this.name= name;
            this.email = email;
//            this.role = role;
        }

        public String toString() {
            return "Name of user:"+this.name+"\nEmail of User:"+this.email;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
