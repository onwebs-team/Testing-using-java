public class Trapezoid {
    int length;
    int height;
    int length2;

    public Trapezoid(int length, int length2, int height) {
        try {
            if (length > 0 || length2 > 0 || height > 0) {
                this.length = length;
                this.length2 = length2;
                this.height = height;
            } else {
                this.length = 0;
            }
        } catch (Exception e) {
            this.length = 0;
        }


    }

    public int calculateArea() {
        try {
            return (this.length * this.length2)/2 *this.height;
        } catch (Exception e) {
            return 0;
        }

    }
}
