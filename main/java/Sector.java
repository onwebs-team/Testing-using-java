public class Sector {
    int r;
    double angle;
    public Sector(int r,double angle) {
        try {
            if (r >0) {
                this.r = r;
                this.angle = angle;
            }else {
                this.r = 0 ;
            }
        } catch (Exception e) {
            this.r = 0 ;
        }


    }
    public double calculateArea() {
        try {
            return (int) Math.pow(this.r, 2) * this.angle/2;
        } catch (Exception e) {
            return 0;
        }

    }
}
