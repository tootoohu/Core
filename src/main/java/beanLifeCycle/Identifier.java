package beanLifeCycle;

public class Identifier {

    private int id;

    private String country;

    private String hukou;

    private String passport;

    public Identifier(int id){
        System.err.println("constructor Identifier(int id) is invoked!");
        this.id = id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHukou() {
        return hukou;
    }

    public void setHukou(String hukou) {
        System.err.println("Identifier set hukou " + hukou);
        this.hukou = hukou;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        System.err.println("Identifier set passport " + passport);
        this.passport = passport;
    }
}
