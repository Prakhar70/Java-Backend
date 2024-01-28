package Example.libmgrsys.tester;

import java.util.List;

import Example.libmgrsys.Book.BookCopy;
import Example.libmgrsys.Book.BookDetails;
import Example.libmgrsys.auth.UserAuthenticator;
import Example.libmgrsys.dataaccessor.DBAccessor;
import Example.libmgrsys.id.IdGenerator;
import Example.libmgrsys.library.Library;
import Example.libmgrsys.searcher.*;
import Example.libmgrsys.user.Member;

import java.util.Date;


public class Tester {

    private final Library library=new Library(new DBAccessor());



    public List<BookCopy> searchBooksByName(String bookName){
//        1.Validation
        if (bookName == null){
            throw new IllegalArgumentException("book Name can't be null");
        }
        BookSearcher bookSearcher=new NameBasedBookSearcher(bookName);//factory design pattern -- top level have to use new
        return bookSearcher.search();
    }
    public List<BookCopy> searchBooksByAuthorNames(List<String> authorNames){
        if (authorNames == null || authorNames.isEmpty()) {
            throw new IllegalArgumentException("author Name can't be null or empty");
        }
        BookSearcher bookSearcher=new AuthorBasedBookSearcher(authorNames);
        return bookSearcher.search();
    }
    public List<Member> searchBooksByMemberName(String memberName, String adminToken) throws IllegalAccessException {
        //authentication && authorization
        if (!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("Operation forbidden");
        }
        MemberSearcher memberSearcher=new NameBasedMemberSearcher(memberName);
        return memberSearcher.search();
    }
    public void addBook(String bookName, Date publicationDate, List<String> authors, String adminToken) throws IllegalAccessException {
        if (!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("Operation forbidden");
        }
        BookCopy bookCopy= new BookCopy(new BookDetails(bookName, publicationDate, authors), IdGenerator.getUniqueId());
        library.addBookCopy(bookCopy);
    }

    public void deleteBook(int bookCopyId,String adminToken ) throws IllegalAccessException {
        if (bookCopyId>=0 || adminToken==null || !UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("bookId/admintToken cant be null");
        }
        BookSearcher bookSearcher=new IdBasedBookSearcher(bookCopyId);
        List<BookCopy> bookCopies = bookSearcher.search();
        if (bookCopies ==null || bookCopies.isEmpty()){
            throw new RuntimeException("No book copies retrieved for given id");
        }
        library.deleteBookCopy(bookCopies.get(0));
    }
    public void blockMember(int memberId ,String adminToken) throws IllegalAccessException {
        if (memberId<0 || adminToken==null || adminToken.isEmpty()){

            throw new IllegalArgumentException("memberId/admintToken cant be null or empty");
        }
        if (!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("Operation forbidden");
        }
        MemberSearcher memberSearcher=new IdBasedMemberSeacher(memberId);
        List<Member> members= memberSearcher.search();
        if (members ==null || members.isEmpty()){
            throw new RuntimeException("No book copies retrieved for given id");
        }
        library.blockMember(members.get(0));
    }
    public void issueBook(int memberId, int bookCopyId, String adminToken) throws IllegalAccessException {
        if (memberId<0 || bookCopyId<0 || adminToken==null || adminToken.isEmpty()){

            throw new IllegalArgumentException("memberId/bookId/admintToken cant be null or empty");
        }
        if (!UserAuthenticator.isAdmin(adminToken)){
            throw new IllegalAccessException("Operation forbidden");
        }
        MemberSearcher memberSearcher=new IdBasedMemberSeacher(memberId);
        List<Member> members= memberSearcher.search();
        if (members ==null || members.isEmpty()){
            throw new RuntimeException("No book copies retrieved for given id");
        }
        BookSearcher bookSearcher=new IdBasedBookSearcher(bookCopyId);
        List<BookCopy> bookCopies = bookSearcher.search();
        if (bookCopies ==null || bookCopies.isEmpty()){
            throw new RuntimeException("No book copies retrieved for given id");
        }
        library.issueBook(bookCopies.get(0), members.get(0));
    }
    public void submitBook(int memberId, int bookCopyId, String adminToken){

    }
    public Member getBorrowerOfBook(int bookCopyId, String adminToken){
        return null;
    }
    public List<BookCopy> getBooksBorrowedByMember(int memberId, String adminToken){
        return null;
    }


}
