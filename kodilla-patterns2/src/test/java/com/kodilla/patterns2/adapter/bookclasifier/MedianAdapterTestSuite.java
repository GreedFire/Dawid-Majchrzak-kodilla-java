package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest(){
        //Given
        Set<Book> bookset = new HashSet<>();
        bookset.add(new Book("title1", "author1", 1995, "xxx1"));
        bookset.add(new Book("title2", "author2", 2002, "xxx2"));
        bookset.add(new Book("title3", "author3", 2000, "xxx3"));
        MedianAdapter adapter = new MedianAdapter();
        //When
        int result = adapter.publicationYearMedian(bookset);
        //Then
        Assert.assertEquals(2000, result);
    }
}
