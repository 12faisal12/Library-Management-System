package com.example.LibraryManagementSystem.service;

import com.example.LibraryManagementSystem.entity.Publisher;
import com.example.LibraryManagementSystem.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublisherService {
    @Autowired
    private PublisherRepository publisherRepository;

    public List<Publisher> findAllPublishers(){
        return publisherRepository.findAll();
    }

    public Publisher findPublisherById(Long id){
        return publisherRepository.findById(id).orElseThrow(() -> new RuntimeException("Publisher Not Found"));
    }

    public void createPublisher(Publisher publisher){
        publisherRepository.save(publisher);
    }

    public void updatePublisher(Publisher publisher){
        publisherRepository.save(publisher);
    }

    public void deletePublissher(Long id){
        publisherRepository.deleteById(id);
    }

}
