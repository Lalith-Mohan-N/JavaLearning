class Liberary {
    static int totalBook;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;
    public String toString(){
        return "Book { "+
        "total books ="+totalBook+"}";
    }
    static{
        totalBook=200;
    }
    {
         totalBook++;
    }
    Book(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    Book(String isbn){
        this("unknown","unknown",isbn);
    }

    public static int getTotalBook(){
        System.out.print("total books in liberary are : ");
        return totalBook;
    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("The "+this.title+" Book is already borrowed !");
        }
        else{
            System.out.println(this.title+" book is borrowed from the liberary successfully !");
            System.out.println("Enjoy the "+this.title+" book");
            isBorrowed=true;
            totalBook--;
        }
    }

    int returnBook(){
        totalBook++;
        System.out.println("your "+this.title+" book returned successfully !");
        return totalBook;
    }
    public static void main(String[] args) {
        Book java =new Book("java","lalith","1234java");
        System.out.println(java);
        Book python = new Book("0923py");
        System.out.println();
        System.out.println(Book.getTotalBook());
        java.borrowBook();
        System.out.println();
        System.out.println(Book.getTotalBook());
        java.borrowBook();
        System.out.println(java.author);
        System.out.println(java.isbn);
        java.returnBook();
        System.out.println();
        System.out.println(Book.getTotalBook());
        python.borrowBook();
        System.out.println(Book.getTotalBook());
        System.out.println();
    }

}
