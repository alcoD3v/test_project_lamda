
 class Employee extends Person implements PPL {

    private String position;
     private static String a="printing";

    static void ret(){
       System.out.println(a);


    }

    public String getPosition() {

        return position;
    }

    void setPosition(String position) {
        this.position = position;
    }


    @Override
    public void print() {

    }
}
