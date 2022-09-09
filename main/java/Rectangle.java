public class Rectangle {
    int length;
    int height;
    public Rectangle(int length,int height) {
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
            return this.length * this.height;
        } catch (Exception e) {
            return 0;
        }

    }
}
