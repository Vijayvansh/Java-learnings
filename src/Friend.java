public class Friend {

    String name;
    String nickName;

    static String groupName;
    static int noOfFriends = 0;

    Friend(String name, String nickName, String groupName) {
        this.name = name;
        this.nickName = nickName;
        Friend.groupName = groupName;
        noOfFriends++;
    }

    void friendDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Nick Name: " + this.nickName);
        System.out.println("Group Name: " + Friend.groupName);
        System.out.println("No. of Friends: " + Friend.noOfFriends + "\n");
    }
}
