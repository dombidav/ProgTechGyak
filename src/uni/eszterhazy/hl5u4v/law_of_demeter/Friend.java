package uni.eszterhazy.hl5u4v.law_of_demeter;

public class Friend {
    public void friendFunction(){

    }

    public FriendOfFriend callAnotherFriend(){
        return new FriendOfFriend();
    }
}
