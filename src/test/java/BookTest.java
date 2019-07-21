import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;
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
        books.add(new Book(1236,"HarryPotter 3 ","J.K"));
        assertThat(books.size(),is(3));
    }

    @Test //황수진 method2
    public void Timeout테스트(){

        Book book = mock(Book.class);
        book.setTitle("Harry Potter");
        verify(book, timeout(100).atLeast(1)).setTitle(anyString());
    }

    @Test //황수진 method3
    public void 도서관리숫자(){

        List<Book> books =new ArrayList<Book>();
        List<Book> books_1200 =new ArrayList<Book>();

        books.add(new Book(1000,"HarryPotter Story","J.K"));
        books.add(new Book(1235,"HarryPotter 1","J.K"));
        books.add(new Book(1236,"HarryPotter 2 ","J.K"));

        for(int i=0;i<books.size();i++){
            if(books.get(i).getNum()>=1200){
                books_1200.add(books.get(i));
            }
        }
        assertTrue(books_1200.get(0).getNum()>=1200);
        assertTrue(books_1200.get(1).getNum()>=1200);

    }
}