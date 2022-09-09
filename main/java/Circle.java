public class Circle {
    int rm;
    double pie=3.14159;
    public Circle(int rm) {
        try {
            if (rm >0) {
                this.rm = rm;
            }else {
                this.rm = 0 ;
            }
        } catch (Exception e) {
            this.rm = 0 ;
        }


    }
    public double calculateArea() {
        try {
            return (int) Math.pow(this.rm, 2) * pie;
        } catch (Exception e) {
            return 0;
        }

    }
}
