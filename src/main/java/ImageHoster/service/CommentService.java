package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    //This Service Method calls saveComments() in Repository to save comments in database
    public void saveComments(Comment comment) {
        commentRepository.saveComments(comment);
    }

}
