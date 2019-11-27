
package anonymouse.inner.pkgclass;

public abstract class BitmStudent {
    
    private String Name ;
    private String Phone ;
    private String NID;

    public BitmStudent(String Name, String Phone, String NID) {
        
        this.Name = Name;
        this.Phone = Phone;
        this.NID = NID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getNID() {
        return NID;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }

    
   public abstract String getInfo();
    
    
    
}