package Example.libmgrsys.searcher;

import java.util.List;

import Example.libmgrsys.Book.BookCopy;
public class AuthorBasedBookSearcher implements BookSearcher{

    private final List<String> authors;
    public AuthorBasedBookSearcher(List<String> authors){

        this.authors=authors;
    }

    @Override
    public List<BookCopy> search() {

        return null;
    }
}
