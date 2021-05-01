import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

 Map<String, Book> bookCollection = new HashMap<String, Book>();
 int currentDay = 0;
 int lengthOfCheckoutPeriod = 7;
 double intialLateFee = 0.50;
 double feePerLateDay = 0.50;

    public double getIntialLateFee() {
        return intialLateFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }

    public LibraryCatalogue(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public LibraryCatalogue(Map<String, Book> bookCollection, int currentDay, int lengthOfCheckoutPeriod, double intialLateFee, double feePerLateDay) {
        this.bookCollection = bookCollection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.intialLateFee = intialLateFee;
        this.feePerLateDay = feePerLateDay;
    }

    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }

    public void setBookCollection(Map<String, Book> bookCollection) {
        this.bookCollection = bookCollection;
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public Book getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
    }

    public int getLengthOfCheckoutPeriod() {
        return lengthOfCheckoutPeriod;
    }

    public void setLengthOfCheckoutPeriod(int lengthOfCheckoutPeriod) {
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
    }

    public void setFeePerLateDay(double feePerLateDay) {
        this.feePerLateDay = feePerLateDay;
    }

    public void nextDay(){
        currentDay++;
    }

    public void setDay(int current) {
        currentDay = current;
    }


    public void checkout(String title){
        Book book = getBook(title);
        if(book.isCheckedOut()){
            sorryBookIsAlreadyCheckedOut(title);
        }else{
            book.setCheckedOut(true, currentDay);
            System.out.println("You just checked out "+ title + " It is due on day" +
                    (getCurrentDay() + getLengthOfCheckoutPeriod()+ "."));
        }
    }

    public void returnBook(String title){
     Book book = getBook(title);
     int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckoutPeriod());
     if(daysLate > 0){
         System.out.println("You owe the lIbrary $" + (getIntialLateFee() + daysLate * getFeePerLateDay()) +
                 " Because your book is " + daysLate + " days overdue.");
     }else{
         System.out.println("Book Returned");
     }
     book.setCheckedOut(false, -1);
    }

    public void sorryBookIsAlreadyCheckedOut(String title){
        System.out.println("Sorry "+ title + " is already checked out. It will be back after " + getLengthOfCheckoutPeriod()+
                " days");
    }


    public static void main(String args []){
        Map<String, Book> bookCollections = new HashMap<String, Book>();
        Book gita = new Book("Gita", 8212, 9999);
        bookCollections.put("Gita", gita );
        LibraryCatalogue libc = new LibraryCatalogue(bookCollections);
        libc.checkout("Gita");
        libc.nextDay();
        libc.nextDay();
        libc.checkout("Gita");
        libc.setDay(17);
        libc.returnBook("Gita");
    }

}
