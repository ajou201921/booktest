import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;
@RunWith(MockitoJUnitRunner.class)
public class BookTest {
    @Mock
    BookManagement bookManagement;


    @Test(expected = IllegalArgumentException.class)
    public void 책번호를_음수로_저장하면_예외발생(){
        Book book=mock(Book.class);
        doThrow(new IllegalArgumentException()).when(book).setNum(-1);
        book.setNum(-1);
    }

    @Test
    public void 빈객체인지테스트(){
        List<Book>bookList=mock(List.class);
assertThat(bookList.size(),is(0));
    }

}