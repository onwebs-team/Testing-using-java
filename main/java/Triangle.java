public class Triangle {
    
    
    int length;
    int height;
    
    
    
    public Triangle(int length,int height) {
        try {
            if (length >0 || height>0) {
                this.length = length;
                this.height = height;
            }else {
                this.length = 0 ;
            }
        } catch (Exception e) {
            this.length = 0 ;
        }


    }
    public int calculateArea() {
        try {
            return (this.length * this.height)/2;
        } catch (Exception e) {
            return 0;
        }
    }
}
