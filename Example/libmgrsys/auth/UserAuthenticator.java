package Example.libmgrsys.auth;

public class UserAuthenticator {

    private UserAuthenticator() {}
    public static boolean isAdmin(String adminToken){
        return true;
    }
    public static boolean isMember(String memberToken){
        return true;
    }
}
