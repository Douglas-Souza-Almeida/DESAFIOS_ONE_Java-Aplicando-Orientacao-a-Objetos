package models;

//criando a classe
public class Book {
    private String title;
    private String author;

    //métodos getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    //métodos setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //método para exibir detalhes
    public void displayDetails () {
        System.out.println(String.format("""
                Título: %s
                Autor: %s""", title, author));
    }
}
