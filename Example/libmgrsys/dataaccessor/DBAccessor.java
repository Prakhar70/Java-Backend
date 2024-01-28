package Example.libmgrsys.dataaccessor;

import java.util.List;

import Example.libmgrsys.Book.BookCopy;
import Example.libmgrsys.user.Member;

public class DBAccessor {

    public Results getBookWithNames(String bookName){
        return null;
    }
    public Results getBookWithAuthorName(List<String> authorNames){
        return null;
    }
    public Results getMembersWithName(String name){
        return null;
    }
    public void insertBookCopy(BookCopy bookCopy){

    }
    public void deleteBookCopy(BookCopy bookCopy){

    }

    public void issueBookCopy(BookCopy bookCopy, Member member){

    }
    public void submitBookCopyFromMember(BookCopy bookCopy, Member member){

    }
    public boolean isCopyAvaiable(BookCopy bookCopy){

        return false;
    }

    public Results getBorrower(BookCopy bookCopy){
        return null;
    }

    public Results getBorrowedBooks(Member member){
        return null;
    }


}
