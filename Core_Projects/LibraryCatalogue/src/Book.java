public class Book {

    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut = -1;

    public Book(String bookTitle, int bookPageCount, int bookISBN){
       title = bookTitle;
       pageCount = bookPageCount;
       ISBN = bookISBN;
       isCheckedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut, int currentDayCheckedOut) {
        isCheckedOut = checkedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }

    public int getDayCheckedOut() {
        return dayCheckedOut;
    }

    private void setDayCheckedOut(int dayCheckedOut) {
        this.dayCheckedOut = dayCheckedOut;
    }
}
