package com.bootjpamvcfeedback.bootjpamvcfeedback.controllers;

import com.bootjpamvcfeedback.bootjpamvcfeedback.entities.Feedback;
import com.bootjpamvcfeedback.bootjpamvcfeedback.services.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;
    @GetMapping("/feedbacks")
    public ResponseEntity<List<Feedback>> getFeedbacks()
    {
        List<Feedback> list=feedbackService.getAllFeedbacks();
        if(list.size()<=0){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(list);
    }
    @GetMapping("/feedbacks/{rollno}")
    public ResponseEntity<Feedback> getFeedback(@PathVariable("rollno") int rollno)
    {
        Feedback feedback=feedbackService.getFeedbackByRollno(rollno);
        if(feedback==null)
        {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(feedback));
    }

    @PostMapping("/feedbacks")
    public ResponseEntity<Feedback> addFeedback(@RequestBody Feedback feedback) {
        Feedback f = null;
        try {
            f = this.feedbackService.addFeedback(feedback);
            System.out.println(feedback);
            return ResponseEntity.of(Optional.of(f));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/feedbacks/{rollno}")
    public void deleteBook(@PathVariable("rollno") int rollno)
    {
        this.feedbackService.deleteFeedback(rollno);
    }
    @PutMapping("/feedbacks/{rollno}")
    public Feedback updateBook(@RequestBody Feedback feedback,@PathVariable("rollno") int rollno)
    {
        this.feedbackService.updateBook(feedback,rollno);
        return feedback;
    }

}
