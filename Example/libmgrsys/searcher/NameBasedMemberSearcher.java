package Example.libmgrsys.searcher;

import java.util.List;

import Example.libmgrsys.user.Member;

public class NameBasedMemberSearcher implements MemberSearcher{
    private final String memberName;
    public NameBasedMemberSearcher(String memberName){
        this.memberName=memberName;
    }
    @Override
    public List<Member> search() {
        return null;
    }
}
