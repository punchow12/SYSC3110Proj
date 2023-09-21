import java.util.ArrayList;
import java.util.HashMap;

public class AddressBook {

    //private HashMap<BuddyInfo, String> addressBook;
    private ArrayList<BuddyInfo> buddys = new ArrayList<>();
    public AddressBook() {
        //addressBook.put();
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
    public void addBuddy(BuddyInfo bud){ //String num, String name, String address
        //BuddyInfo newFriend = new BuddyInfo(num,name,address);
        //addressBook.put(newFriend, name);
        buddys.add(bud);

    }

    public void removeBuddy(BuddyInfo bud){
        /* What if there are 2 of the same name? */
        buddys.remove(bud);
    }









}
