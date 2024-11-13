    import java.util.*;;
    public class Course extends Person {
        public Course(List<String> ID,List<String> Name){
            super(ID, Name);
        }

        public void addToIDCourse(String IdCousre){
            ID.add(IdCousre);
        }

        public void addToNameCourse(String NameCouse){
            Name.add(NameCouse);
        }
    }
