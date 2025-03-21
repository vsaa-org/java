import java.util.Arrays;

public class Book 
{
    String bookName;            //Instance String variable to store book name.
    String author;              //Instance String variable to store author name.
    Page []pages;               //Instance Page variable to store pages in book.
    int pageCount;              //Instance variable to store no of pages in book.

    //Constructor to set Bookname and author to given argument book name and author and also allocating memory to one page.
    Book(String bookName, String author)
    {
        this.bookName = bookName;
        this.author = author;

        pages = new Page[1];
    }

    //Method to add page to the array pages by taking external page as argument.
    public void addPage(Page page)
    {
        pages[pageCount++] = page;

        pages = Arrays.copyOf(pages, pages.length+1);               //Increasing the size of array by 1.
    }

    //Method to total no of occurrence of a argument taken keyword in book.
    public int countKeywordOccurrences(String keyword)
    {
        int count = 0;

        for(int i=0;i<pageCount;i++)
        {
            count += pages[i].countKeywordOccurrences(keyword);
        }

        return count;
    }
}
