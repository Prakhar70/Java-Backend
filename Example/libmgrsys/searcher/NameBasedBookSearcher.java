package Example.libmgrsys.searcher;

import java.util.List;

import Example.libmgrsys.Book.BookCopy;
import Example.libmgrsys.dataaccessor.DBAccessor;
import Example.libmgrsys.dataaccessor.ResultConverter;
import Example.libmgrsys.dataaccessor.Results;

public class NameBasedBookSearcher implements BookSearcher{

    private final String bookName;
    private final DBAccessor dbAccessor;
    public NameBasedBookSearcher(String bookName){

        this.bookName=bookName;
        this.dbAccessor = new DBAccessor();
    }
    @Override
    public List<BookCopy> search() {
        Results results= dbAccessor.getBookWithNames(bookName);
        return ResultConverter.convertToBookCopies(results);
    }
}
