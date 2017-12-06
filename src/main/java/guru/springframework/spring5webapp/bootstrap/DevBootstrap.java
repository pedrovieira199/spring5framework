package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRespository;
    private PublisherRepository publisherRespository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRespository, PublisherRepository publisherRespository) {
        this.authorRepository = authorRepository;
        this.bookRespository = bookRespository;
        this.publisherRespository = publisherRespository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initDate();
    }

    private void initDate(){

        Publisher publisher = new Publisher();
        publisher.setName("foo");

        publisherRespository.save(publisher);

        //Eric
        Author eric = new Author("Eric", "Evans");
        Book aaa = new Book("title-1", "123465", publisher);
        eric.getBooks().add(aaa);
        aaa.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRespository.save(aaa);

        Author rod = new Author("Eric", "Evans");
        Book noEJS = new Book("title-2", "1234", publisher);
        rod.getBooks().add(noEJS);

        authorRepository.save(rod);
        bookRespository.save(noEJS);
    }


}
