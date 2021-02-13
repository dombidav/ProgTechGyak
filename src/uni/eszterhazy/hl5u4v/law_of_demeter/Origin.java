package uni.eszterhazy.hl5u4v.law_of_demeter;

public class Origin {
    private int field;

    public void setFieldTo3(Friend paramFriend){
        field = 3; //Side-effect, de igazából okés

        Friend f = new Friend();
        f.friendFunction(); //Általam létrehozott objektum, beszélhetek vele

        paramFriend.friendFunction(); //paraméterként kaptam, beszélhetek vele

        paramFriend.callAnotherFriend().FriendOfFriendFunction(); //MEGSZEGI a Law of Demeter-t!

        //Law of Demeter: "Csak a barátaiddal beszélj, a barátaid barátaival soha!"

        int a = paramFriend.callAnotherFriend().field;
    }
}
