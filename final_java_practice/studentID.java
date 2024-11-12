public class studentID extends Person {

    private double midtermCourse;
    private double finalCouse;
    public studentID(String ID, String name, double midtermCourse, double finalCouse){
        super(ID, name);
        this.midtermCourse = midtermCourse;
        this.finalCouse = finalCouse;

    }
    public double getMidtermCourse(){
        return midtermCourse;
    }

    public double getFinalCouse(){
        return finalCouse;
    }   
    public String eveluatePerformance(){
        double averageFinal = finalCouse;
        double averageMidterm = midtermCourse;
        if(averageFinal >= 10 && averageMidterm > 7){
            return "passed";
        }
        else {
            return "retake";
        }
    }
}