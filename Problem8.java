// Define an interface named Filterable with abstract methods
// like apply_filter(filter_type) and reset_filter().
// Create two classes, ImageProcessor and DataAnalyzer, that
// both implement the Filterable interface.
// Implement the methods in each class to perform distinct actions relevant to image
// and data processing respectively, showcasing a shared contract with different
// implementations.

interface Filterable
{
    void apply_filter(String filter_type);
    void reset_filter();
}

class ImageProcessor implements Filterable
{
    public void apply_filter(String filter_type)
    {
        System.out.println("Applying " + filter_type + " filter on image");
    }

    public void reset_filter()
    {
        System.out.println("Image filter reset");
    }
}

class DataAnalyzer implements Filterable
{
    public void apply_filter(String filter_type)
    {
        System.out.println("Applying " + filter_type + " filter on data");
    }

    public void reset_filter()
    {
        System.out.println("Data filter reset");
    }
}

class mainclass
{
    public static void main(String args[])
    {
        ImageProcessor i = new ImageProcessor();
        i.apply_filter("blur");
        i.reset_filter();

        DataAnalyzer d = new DataAnalyzer();
        d.apply_filter("low-pass");
        d.reset_filter();
    }
}