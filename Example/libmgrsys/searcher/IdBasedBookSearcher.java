package Example.libmgrsys.searcher;

import java.util.List;

import Example.libmgrsys.Book.BookCopy;

public class IdBasedBookSearcher implements BookSearcher{

    private final int bookId;
    public IdBasedBookSearcher(int bookId){
        this.bookId=bookId;;
    }
    @Override
    public List<BookCopy> search() {
        return null;
    }
}
