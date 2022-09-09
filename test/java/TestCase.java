import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.List;

public class TestCase {
    @DataProvider(name = "SquareData")
    public static Object[][] SquareDatagetData() throws Exception{
        List<String[]> lines = ReadCsvFile.readAllLines("SquareData.csv");
        lines.remove(0);
        Object[][] data = new Object[lines.size()][lines.get(0).length];
        int index = 0;
        for(String[] line : lines) {
            data[index] = line;
            index++;
        }
        return data;
    }

    @DataProvider(name = "TriangleData")
    public static Object[][] TriangleDatagetData() throws Exception{
        List<String[]> lines = ReadCsvFile.readAllLines("TriangleData.csv");
        lines.remove(0);
        Object[][] data = new Object[lines.size()][lines.get(0).length];
        int index = 0;
        for(String[] line : lines) {
            data[index] = line;
            index++;
        }
        return data;
    }

    @DataProvider(name = "RectangleData")
    public static Object[][] RectangleDatagetData() throws Exception{
        List<String[]> lines = ReadCsvFile.readAllLines("RectangleData.csv");
        lines.remove(0);
        Object[][] data = new Object[lines.size()][lines.get(0).length];
        int index = 0;
        for(String[] line : lines) {
            data[index] = line;
            index++;
        }
        return data;
    }

    @DataProvider(name = "ParallelogramData")
    public static Object[][] ParallelogramDatagetData() throws Exception{
        List<String[]> lines = ReadCsvFile.readAllLines("ParallelogramData.csv");
        lines.remove(0);
        Object[][] data = new Object[lines.size()][lines.get(0).length];
        int index = 0;
        for(String[] line : lines) {
            data[index] = line;
            index++;
        }
        return data;
    }

    @DataProvider(name = "TrapezoidData")
    public static Object[][] TrapezoidDatagetData() throws Exception{
        List<String[]> lines = ReadCsvFile.readAllLines("TrapezoidData.csv");
        lines.remove(0);
        Object[][] data = new Object[lines.size()][lines.get(0).length];
        int index = 0;
        for(String[] line : lines) {
            data[index] = line;
            index++;
        }
        return data;
    }

    @DataProvider(name = "CircleData")
    public static Object[][] CircleDatagetData() throws Exception{
        List<String[]> lines = ReadCsvFile.readAllLines("CircleData.csv");
        lines.remove(0);
        Object[][] data = new Object[lines.size()][lines.get(0).length];
        int index = 0;
        for(String[] line : lines) {
            data[index] = line;
            index++;
        }
        return data;
    }

    @DataProvider(name = "EllipseData")
    public static Object[][] EllipseDatagetData() throws Exception{
        List<String[]> lines = ReadCsvFile.readAllLines("EllipseData.csv");
        lines.remove(0);
        Object[][] data = new Object[lines.size()][lines.get(0).length];
        int index = 0;
        for(String[] line : lines) {
            data[index] = line;
            index++;
        }
        return data;
    }

    @DataProvider(name = "SectorData")
    public static Object[][] SectorDatagetData() throws Exception{
        List<String[]> lines = ReadCsvFile.readAllLines("SectorData.csv");
        lines.remove(0);
        Object[][] data = new Object[lines.size()][lines.get(0).length];
        int index = 0;
        for(String[] line : lines) {
            data[index] = line;
            index++;
        }
        return data;
    }
    @Test(dataProvider = "SquareData")
    public void SquareTestCase(String length, String area){
        int lenInt = Integer.parseInt(length);
        int areaInt = Integer.parseInt(area);

        Square square = new Square(lenInt);

        int sum = square.calculateArea();
        Assert.assertEquals(sum,areaInt);
    }

    @Test(dataProvider = "TriangleData")
    public void TriangleTestCase(String length,String height, String area){
        int lenInt = Integer.parseInt(length);
        int heiInt = Integer.parseInt(height);
        int areaInt = Integer.parseInt(area);

        Triangle triangle = new Triangle(lenInt,heiInt);

        int sum = triangle.calculateArea();
        Assert.assertEquals(sum,areaInt);
    }

    @Test(dataProvider = "RectangleData")
    public void RectangleTestCase(String length,String height, String area){
        int lenInt = Integer.parseInt(length);
        int heiInt = Integer.parseInt(height);
        int areaInt = Integer.parseInt(area);

        Rectangle rectangle = new Rectangle(lenInt,heiInt);

        int sum = rectangle.calculateArea();
        Assert.assertEquals(sum,areaInt);
    }

    @Test(dataProvider = "ParallelogramData")
    public void ParallelogramTestCase(String length,String height, String area){
        int lenInt = Integer.parseInt(length);
        int heiInt = Integer.parseInt(height);
        int areaInt = Integer.parseInt(area);

        Parallelogram parallelogram = new Parallelogram(lenInt,heiInt);

        int sum = parallelogram.calculateArea();
        Assert.assertEquals(sum,areaInt);
    }

    @Test(dataProvider = "TrapezoidData")
    public void TrapezoidTestCase(String length,String length2,String height, String area){
        int lenInt = Integer.parseInt(length);
        int lenInt2 = Integer.parseInt(length2);
        int heiInt = Integer.parseInt(height);
        int areaInt = Integer.parseInt(area);

        Trapezoid trapezoid = new Trapezoid(lenInt,lenInt2,heiInt);

        int sum = trapezoid.calculateArea();
        Assert.assertEquals(sum,areaInt);
    }

    @Test(dataProvider = "CircleData")
    public void CircleTestCase(String length, String area){
        int lenInt = Integer.parseInt(length);
        double areaInt = Double.parseDouble(area);

        Circle circle = new Circle(lenInt);

        double sum = circle.calculateArea();
        Assert.assertEquals(sum,areaInt);
    }

    @Test(dataProvider = "EllipseData")
    public void EllipseTestCase(String length,String height, String area){
        int lenInt = Integer.parseInt(length);
        int heiInt = Integer.parseInt(height);
        double areaInt = Double.parseDouble(area);

        Ellipse ellipse = new Ellipse(lenInt,heiInt);

        double sum = ellipse.calculateArea();
        Assert.assertEquals(sum,areaInt);
    }
    @Test(dataProvider = "SectorData")
    public void SectorTestCase(String length,String height, String area){
        int lenInt = Integer.parseInt(length);
        int heiInt = Integer.parseInt(height);
        double areaInt = Double.parseDouble(area);

        Sector sector = new Sector(lenInt,heiInt);

        double sum = sector.calculateArea();
        Assert.assertEquals(sum,areaInt);
    }
}
