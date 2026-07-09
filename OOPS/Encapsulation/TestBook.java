package OOPS.Encapsulation;

public class TestBook{

    public static void main(String args[]){

        Author a=new Author("James","james@gmail.com",'M');
        Book b=new Book("Java Programming",a,650.50,20);
        System.out.println("Book Name : "+b.getName());
        System.out.println("Author Name : "+b.getAuthor().getName());
        System.out.println("Author Email : "+b.getAuthor().getEmail());
        System.out.println("Author Gender : "+b.getAuthor().getGender());
        System.out.println("Price : "+b.getPrice());
        System.out.println("Quantity : "+b.getQtyInStock());
    }
}