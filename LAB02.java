public class LAB02 {
    public static void main(String[] args) {
        boolean Carson_Jack_always_arguing = true;
        boolean Carson_is_murder = false;
        boolean Jack_is_murder = false;
        System.out.println("#########");
        System.out.println("Carson");
        System.out.println(Carson_Jack_always_arguing && Carson_is_murder); //and
        System.out.println(Carson_Jack_always_arguing || Carson_is_murder); //or
        System.out.println(!Carson_Jack_always_arguing || Carson_is_murder); //if..then
        System.out.println(!Carson_Jack_always_arguing || Carson_is_murder && !Carson_is_murder || Carson_Jack_always_arguing); //if..and ..only if
        System.out.println("#########");
        System.out.println("Jack");
        System.out.println(Carson_Jack_always_arguing && Jack_is_murder); //and
        System.out.println(Carson_Jack_always_arguing || Jack_is_murder); //or
        System.out.println(!Carson_Jack_always_arguing || Jack_is_murder); //if..then
        System.out.println(!Carson_Jack_always_arguing || Jack_is_murder && !Jack_is_murder || Carson_Jack_always_arguing); //if..and ..only if
        System.out.println("#########");
    }
}
