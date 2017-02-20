package com.random;

import java.util.Scanner;

/**
 * Created by abhimanyunarwal on 2/20/17.
 */
public class AbstractMethodsBooks {

    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        String author=sc.nextLine();
        int price=sc.nextInt();
        Book new_novel=new MyBook(title,author,price);
        new_novel.display();

    }
}


abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}


class MyBook extends Book{

    int price;

    MyBook(String title, String author, int price){
        super(title, author);
        this.price=price;

    }

    public int getPrice() {
        return price;
    }

    void display(){
        System.out.println("Title: "+super.title);
        System.out.println("Author: "+super.author);
        System.out.println("Price: "+getPrice());
    }

}
