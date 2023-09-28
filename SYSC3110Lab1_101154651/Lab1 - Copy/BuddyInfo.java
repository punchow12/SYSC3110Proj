public class BuddyInfo {


    private String phoneNumber;
    private String name;
    private String address;

    public static void main(String[] args) {
        BuddyInfo man = new BuddyInfo("3453435324", "Homer", "123 Sesame Street");
        System.out.println("Hello " + man.getName());
    }

    public BuddyInfo(String phoneNumber, String name, String address) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
