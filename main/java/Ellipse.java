public class Ellipse {
    int length;
    int height;

    double pie=3.14159;
    public Ellipse(int length,int height) {
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
    public double calculateArea() {
        try {
            return this.length * this.height *pie;
        } catch (Exception e) {
            return 0;
        }
    }
}
