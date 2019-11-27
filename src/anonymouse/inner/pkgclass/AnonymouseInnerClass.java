
package anonymouse.inner.pkgclass;

public class AnonymouseInnerClass {

    
    public static void main(String[] args) {
        BitmStudent bitm = new BitmStudent("AMINUL", "98295", "3498049") {
            @Override
            public String getInfo() {
                return "good bye" ;
                
            }
            
            
        
        };
           
        System.out.println(bitm.getInfo());
     
    }
    
}
    

