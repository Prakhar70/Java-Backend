package Example.libmgrsys.Book;

import java.util.Date;
import java.util.List;

public class BookDetails {

    private final String name;
    private final Date publicationDate;
    private final List<String> authorNames;

    public BookDetails(String name, Date publicationDate, List<String> authorNames){
        this.name=name;
        this.publicationDate=publicationDate;
        this.authorNames=authorNames;
    }
}
