import java.util.HashMap;

public class AddressBook {

    private final HashMap<BuddyInfo, String> addressBook;

    public AddressBook(HashMap<BuddyInfo, String> addressBook) {
        this.addressBook = addressBook;
    }

    public static void main(String[] args) {
        System.out.println("AddressBook");
    }
    public void addBuddy(String num, String name, String address){
        BuddyInfo newFriend = new BuddyInfo(num,name,address);
        addressBook.put(newFriend, name);
    }

    public void removeBuddy(String name){
        /* What if there are 2 of the same name? */
    }









}
