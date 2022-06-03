package com.bootjpamvcfeedback.bootjpamvcfeedback.services;
import com.bootjpamvcfeedback.bootjpamvcfeedback.entities.Feedback;
import com.bootjpamvcfeedback.bootjpamvcfeedback.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public List<Feedback> getAllFeedbacks() {
        List<Feedback> list = (List<Feedback>) this.feedbackRepository.findAll();
        return list;
    }

    public Feedback getFeedbackByRollno(int rollno) {
        Feedback feedback = null;
        try {
            feedback = this.feedbackRepository.findByRollno(rollno);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return feedback;
    }

    public Feedback addFeedback(Feedback f) {
        Feedback result = feedbackRepository.save(f);
        return result;
    }

    public void deleteFeedback(int frn) {
        feedbackRepository.deleteById(frn);
    }

    public void updateBook(Feedback feedback, int rollno) {
        feedback.setRollno(rollno);
        feedbackRepository.save(feedback);
    }
}

