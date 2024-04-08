
package bean;

public class Userbean {
    private String tendn;
    private String pass;
    
    public Userbean() {
    }

    public Userbean(String tendn, String pass) {
        this.tendn = tendn;
        this.pass = pass;
    }

    public String getTendn() {
        return tendn;
    }

    public void setTendn(String tendn) {
        this.tendn = tendn;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    

}
