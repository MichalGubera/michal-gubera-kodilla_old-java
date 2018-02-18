package com.kodilla.stream.book;

public final class Book {
    private final String author;
    private final String title;
    private final int yearOfPublication;
    private final String signature;

    public Book(final String author, final String title, final int yearOfPublication, final String signature) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
        this.signature = signature;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", signature='" + signature + '\'' +
                '}';
    }
}

//      .joining to execute in Main
//
//      BookDirectory theBookDirectory = new BookDirectory();
//
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//
//        System.out.println(theResultStringOfBooks);


//    collection Map to execute in Main
//
//    BookDirectory theBookDirectory = new BookDirectory();
//
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("# elenents: " + theResultMapOfBooks.size());
//            theResultMapOfBooks.entrySet().stream()
//                    .map(entry -> entry.getKey() + ":" + entry.getValue())
//                    .forEach(System.out::println);


//    collection List to execute in Main
//
//    BookDirectory theBookDirectory = new BookDirectory();
//
//    List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
//            .filter(book -> book.getYearOfPublication() > 2005)
//            .collect(Collectors.toList());
//
//        System.out.println("# elenents: " + theResultListOfBooks.size());
//                theResultListOfBooks.stream()
//                .forEach(System.out :: println);