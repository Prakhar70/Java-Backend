package Example.libmgrsys.searcher;

import java.util.List;

import Example.libmgrsys.user.Member;

public class IdBasedMemberSeacher implements MemberSearcher{

    private final int memberId;
    public IdBasedMemberSeacher(int memberId){
        this.memberId = memberId;
    }

    @Override
    public List<Member> search() {
        return null;
    }
}
