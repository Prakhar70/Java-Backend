package Example.libmgrsys.searcher;

import java.util.List;

import Example.libmgrsys.Book.BookCopy;

public interface BookSearcher {//why interface OCP

    List<BookCopy> search ();
}
