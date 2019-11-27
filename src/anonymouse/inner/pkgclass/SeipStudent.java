
package anonymouse.inner.pkgclass;


public class SeipStudent  extends BitmStudent{
    
    private  String seid;
    private double stippend;

    public SeipStudent(String seid, double stippend, String Name, String Phone, String NID) {
        super(Name, Phone, NID);
        this.seid = seid;
        this.stippend = stippend;
    }

    

    public String getSeid() {
        return seid;
    }

    public void setSeid(String seid) {
        this.seid = seid;
    }

    public double getStippend() {
        return stippend;
    }

    public void setStippend(double stippend) {
        this.stippend = stippend;
    }

    @Override
    public String getInfo() {
        return super.getName()+"\n"+seid;

   
    }

}