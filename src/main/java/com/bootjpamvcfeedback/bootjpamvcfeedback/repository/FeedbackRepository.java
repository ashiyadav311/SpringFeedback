package com.bootjpamvcfeedback.bootjpamvcfeedback.repository;

import com.bootjpamvcfeedback.bootjpamvcfeedback.entities.Feedback;
import org.springframework.data.repository.CrudRepository;

public interface FeedbackRepository extends CrudRepository<Feedback, Integer> {
    public Feedback findByRollno(int rollno);

}
