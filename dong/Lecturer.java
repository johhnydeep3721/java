public class Lecturer extends Person
{
    public Lecturer (String id, String name)
    {
        super(id, name);
    }

    public String display() 
    {
        return "Lecturer: " + id + " - " + name;
    }
}