public class CowTestDrive {
    public static void main(String[] args){
        Cow cow = new Cow();

        cow.setAge(4);
        cow.setName("daisy");
        cow.setBreed("yello");

        System.out.println(cow.getName() + " " +cow.getBreed() + " "+cow.getAge());
        cow.moo();
                                                              
    }
}
