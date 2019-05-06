package builder;

public class Member {

        //All final attributes

    
        private final String firstName; // required
        private final String lastName; // required
        private final String userName;// required
        private final String password;// required
        private final String phone; // optional
        private final String address; // optional
        private final String email; // optional
        

    public Member(MemberBuilder builder) {
        this.lastName = builder.lastName;
        this.firstName = builder.firstName;
        this.phone = builder.phone;
        this.address = builder.address;
        this.email = builder.email;
        this.userName = builder.userName;
        this.password = builder.password;
    }
    
        //All getter, and NO setter to provde immutability

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
    

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    @Override
        public String toString() {

            return "User: "+this.firstName+", "+this.lastName+", "+this.address+", "+this.phone+", "+this.address+","+this.email+","+this.userName+","+this.password;

        }

        public static class MemberBuilder
        {

            private final String lastName; // required
            private final String firstName;  //required
            private final String userName;// required
            private final String password;// required
            private  String phone; // optional
            private  String address; // optional
            private  String email; // optional

            public MemberBuilder(String firstName, String lastName, String userName, String password) {
                this.lastName = lastName;
                this.firstName = firstName;
                this.userName = userName;
                this.password = password;
            }

           
            public MemberBuilder phone(String phone) {
                this.phone = phone;
                return this;
            }
            public MemberBuilder address(String address) {
                this.address = address;
                return this;
            }
            public MemberBuilder email(String email) {
                this.email = email;
                return this;
            }
            //Return the finally consrcuted User object
            public Member build() {
                
                Member member =  new Member(this);

                return member;
            }

        }

}
