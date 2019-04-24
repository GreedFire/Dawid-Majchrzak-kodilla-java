package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Biblioteka");

        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("title" + n, "author" + n, LocalDate.of(2019,2,25) )));

        Library shallowCopiedLibrary = null;
        try{
            shallowCopiedLibrary = library.shallowCopy();
            shallowCopiedLibrary.setName("shallowCopiedLibrary");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }


        Library deepCopiedLibrary = null;
        try{
            deepCopiedLibrary = library.deepCopy();
            deepCopiedLibrary.setName("shallowCopiedLibrary");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }


        //When
        shallowCopiedLibrary.getBooks().add(new Book("title100", "author100", LocalDate.of(2019, 2, 25)));

        //Then
        System.out.println("\n Library books:");
        for(Book book : library.getBooks()){
            System.out.println(book.toString());
        }

        System.out.println("\n ShallowCopiedLibrary books:");
        for(Book book : shallowCopiedLibrary.getBooks()){
            System.out.println(book.toString());
        }

        System.out.println("\n DeepCopiedLibrary books:");
        for(Book book : deepCopiedLibrary.getBooks()){
            System.out.println(book.toString());
        }


        Assert.assertEquals(11, library.getBooks().size());
        Assert.assertEquals(11, shallowCopiedLibrary.getBooks().size());
        Assert.assertEquals(10, deepCopiedLibrary.getBooks().size());
        Assert.assertNotEquals(shallowCopiedLibrary, deepCopiedLibrary);



    }
}
