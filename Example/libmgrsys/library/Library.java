package Example.libmgrsys.library;

import java.util.List;

import Example.libmgrsys.Book.BookCopy;
import Example.libmgrsys.dataaccessor.DBAccessor;
import Example.libmgrsys.dataaccessor.ResultConverter;
import Example.libmgrsys.dataaccessor.Results;
import Example.libmgrsys.user.Member;


public class Library {
    private final DBAccessor dbAccessor;

    public Library(DBAccessor dbAccessor) {
        this.dbAccessor = dbAccessor;
    }

    public void addBookCopy(BookCopy bookCopy){
        if (bookCopy == null){

        }
        dbAccessor.insertBookCopy(bookCopy);


    }
    public void deleteBookCopy(BookCopy bookCopy){
        //check if book copy is avaiable
        //deletion // thread
        if(dbAccessor.isCopyAvaiable(bookCopy)){
            dbAccessor.deleteBookCopy(bookCopy);
        }

    }
    public void blockMember(Member member){

    }

    public void issueBook(BookCopy bookCopy, Member member){

    }
    public void submit (BookCopy bookCopy, Member member){

    }
    public Member getBorrower(BookCopy bookCopy){
        //valisation
        Results result= dbAccessor.getBorrower(bookCopy);
        return ResultConverter.convertToMember(result);

    }
    public List<BookCopy> getBorrowedBooks(Member member){
        return null;
    }

}
