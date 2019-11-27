
package anonymouse.inner.pkgclass;


public class collaborativeStudent extends BitmStudent {
    
    private double courseFee;
private String Company;

    public collaborativeStudent(double courseFee, String Company, String Name, String Phone, String NID) {
        super(Name, Phone, NID);
        this.courseFee = courseFee;
        this.Company = Company;
    }

    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    @Override
    public String getInfo() {
      return super.getName()+"\n"+  Company;
    }

    

   
    

    
   
    }
    
    

