package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        /*
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String exampleText = "text";

        poemBeautifier.beautify(exampleText, (text)-> "AAA"+text+"AAA");
        poemBeautifier.beautify(exampleText, (text)-> text.toUpperCase());
        poemBeautifier.beautify(exampleText, (text)-> text.substring(text.length()-1) + text + text.substring(text.length()-1, text.length()));
        poemBeautifier.beautify(exampleText, (text)-> text + text + text);
        */

        Forum forum = new Forum();
        Map<Integer, ForumUser> map = forum.getUserList().stream()
                .filter(ForumUser -> ForumUser.getSex() == 'M')
                .filter(ForumUser -> ( LocalDate.now().getYear() - ForumUser.getDateOfBirth().getYear() ) >= 20)
                .filter(ForumUser -> ForumUser.getPostCount() > 0)
                .collect(Collectors.toMap(ForumUser::getUserID, ForumUser -> ForumUser));

        map.entrySet().stream()
                .map(entry -> entry.getKey() + " " + entry.getValue())
                .forEach(System.out::println);
    }
}