import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.timeout;
import static org.mockito.Mockito.verify;

public class BookTest{

    @Test //황수진 method 1
    public void 북리스트사이즈테스트(){
        List<Book> books =new ArrayList<Book>();
        books.add(new Book(1234,"HarryPotter 1","J.K"));
        books.add(new Book(1235,"HarryPotter 2","J.K"));
        books.add(new Book(1236,"HarryPotter3 ","J.K"));
        assertThat(books.size(),is(3));
    }

    @Test //황수진 method2
    public void Timeout테스트(){

        Book book = mock(Book.class);
        book.setTitle("Harry Potter");
        verify(book, timeout(100).atLeast(1)).setTitle(anyString());
    }



}