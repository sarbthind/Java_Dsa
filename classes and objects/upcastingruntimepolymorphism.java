class mobile{
    // virtual method
    void display(){
        System.out.println("repreasenting mobile display");
    }
}

class ios extends mobile{
    void display(){
        System.out.println("represent ios display");
    }
}

class android extends mobile{
    void display(){
        System.out.println("repreasent android dislay");
    }
}

class Main{
    public static void main(String[] args) {
        mobile m=new mobile();
        m.display();
        m=new ios();  
        // m is reference to object of sub class ios
        m.display();
        m=new android();
        m.display();
        
    }
}