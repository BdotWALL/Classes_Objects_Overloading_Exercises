public class Book {
    private String bookTitle;
    private int numOfPages;
    private int publicationYear;


        public Book(String title,  int pages, int pubYear) {
            this.bookTitle = title;
            this.numOfPages = pages; 
            this.publicationYear = pubYear;

        }

        public String getName() {
            return this.bookTitle;
        }

        public int getPages() {
            return this.numOfPages;
        }

        public int getPubYear() {
            return this.publicationYear;
        }

        public String toString(){
            return this.bookTitle + ", " + this.numOfPages + " pages, " + this.publicationYear;
        }
    
}
