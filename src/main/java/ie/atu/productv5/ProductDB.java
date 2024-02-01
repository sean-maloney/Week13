package ie.atu.productv5;


public class ProductDB {

    public static Product getProduct(String productCode) {

        Product myProduct = null;
        if (productCode.equalsIgnoreCase("studios")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Visual Studios");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Microsoft 1.1");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("eclipse")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Build Java apps");
            mySoftware.setPrice(57.50);
            mySoftware.setVersion("Eclipse Neon");
            myProduct = mySoftware;
        } else if (productCode.equalsIgnoreCase("oracle")) {
            Software mySoftware = new Software();
            mySoftware.setCode(productCode);
            mySoftware.setDescription("Latest MySQL");
            mySoftware.setPrice(54.50);
            mySoftware.setVersion("Oracle 3.0");
            myProduct = mySoftware;
        }





        if (productCode.equalsIgnoreCase("java")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("ATU Java Programming");
            myBook.setPrice(57.50);
            myBook.setAuthor("Joe Brown");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("jsp")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Java Servlets and JSP");
            myBook.setPrice(57.50);
            myBook.setAuthor("Mike White");
            myProduct = myBook;
        } else if (productCode.equalsIgnoreCase("mysql")) {
            Book myBook = new Book();
            myBook.setCode(productCode);
            myBook.setDescription("Lennon's MySQL");
            myBook.setPrice(54.50);
            myBook.setAuthor("Jim Lennon");
            myProduct = myBook;
        }



        if (productCode.equalsIgnoreCase("gold")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Gold Digger");
            myMusic.setPrice(8.50);
            myMusic.setArtist("Kayne West");
            myMusic.setLabel("MTV");
            myProduct = myMusic;
        } else if (productCode.equalsIgnoreCase("ring")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("Ring of Fire");
            myMusic.setPrice(6.50);
            myMusic.setArtist("Johhny Cash");
            myMusic.setLabel("MTV");
            myProduct = myMusic;
        } else if (productCode.equalsIgnoreCase("toot")) {
            Music myMusic = new Music();
            myMusic.setCode(productCode);
            myMusic.setDescription("tootsie slide");
            myMusic.setPrice(7.50);
            myMusic.setArtist("Drake");
            myMusic.setLabel("MTV");
            myProduct = myMusic;
        }




        if (productCode.equalsIgnoreCase("samsung")) {
            Television myTv = new Television();
            myTv.setCode(productCode);
            myTv.setDescription("OLED");
            myTv.setPrice(685.50);
            myTv.setBrand("Samsung");
            myTv.setSize("55 inch");
            myProduct = myTv;
        } else if (productCode.equalsIgnoreCase("sharp")) {
            Television myTv = new Television();
            myTv.setCode(productCode);
            myTv.setDescription("TN");
            myTv.setPrice(360.50);
            myTv.setBrand("Sharp");
            myTv.setSize("35 inch");
            myProduct = myTv;
        } else if (productCode.equalsIgnoreCase("sony")) {
            Television myTv = new Television();
            myTv.setCode(productCode);
            myTv.setDescription("QLED");
            myTv.setPrice(869.50);
            myTv.setBrand("SONY");
            myTv.setSize("65 Inch");
            myProduct = myTv;
        }

        return myProduct;

        //  public static Book or Software getProduct(String productCode) {
        // In a more realistic application, this code would get the data for the product from a file or database
        // For now, this code just uses if/else statements to return the correct product data

        //We need all the book and software objects, but what kind of object do we return?
    }
}

