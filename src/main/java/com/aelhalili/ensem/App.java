package com.aelhalili.ensem;

import com.aelhalili.ensem.library.Book;
import com.aelhalili.ensem.sortable.BubbleSort;
import com.aelhalili.ensem.sortable.Sortable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main( String[] args )
    {
        Book book1 = new Book(3, "LLVM", "John");
        Book book2 = new Book(1, "LLVM", "John");
        Book book3 = new Book(0, "LLVM", "John");
        Book book4 = new Book(4, "LLVM", "John");
        book1.borrowBook();

        System.out.println("Borrowing a book");
        System.out.println("Borrowed Successfully");

        System.out.println("Availability after borrowing: " + book1.isAvailable());

        System.out.println("Returning the book...");
        book1.returnBook();
        System.out.println("Returned Successfully");
        System.out.println("Availability after returning: " + book1.isAvailable());

        List<Sortable> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        System.out.println(books);
        BubbleSort.sort(books);
        System.out.println(books);

    }
}
