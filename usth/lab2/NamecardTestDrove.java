public class NamecardTestDrove{
    public static void main(String[] args){
        Namecard namecard = new Namecard();

        namecard.setName("Polly Morfism");
        namecard.setPhone(5550343);
        namecard.setEmail("pm@wickedlysmart");

        System.out.println(namecard.getName());
        System.out.println(namecard.getPhone());
        System.out.println(namecard.getEmail());

    }
}