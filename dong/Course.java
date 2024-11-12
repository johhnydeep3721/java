public class Course extends Person
{
    public Course (String id, String name)
    {
        super(id, name);
    }

    public String display() 
    {
        return "Course: " + id + " - " + name;
    }
}