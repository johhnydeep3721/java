public class Student extends Person
{
    double mid;
    double end;

    public Student (String id, String name, double mid, double end)
    {
        super(id, name);
        this.mid = mid;
        this.end = end;
    }

    public String status()
    {
        return (end >= 10 && mid > 7) ? "Passed" : "Retake";
    }

    public String display()
    {
        return id + " - " + name + ": " + status();
    }
}
