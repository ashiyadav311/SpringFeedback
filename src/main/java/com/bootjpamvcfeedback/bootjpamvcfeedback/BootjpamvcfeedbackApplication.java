package com.bootjpamvcfeedback.bootjpamvcfeedback;

import com.bootjpamvcfeedback.bootjpamvcfeedback.entities.Feedback;
import com.bootjpamvcfeedback.bootjpamvcfeedback.repository.FeedbackRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
@SpringBootApplication
public class BootjpamvcfeedbackApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootjpamvcfeedbackApplication.class, args);
		FeedbackRepository feedbackRepository = context.getBean(FeedbackRepository.class);

	}

}
