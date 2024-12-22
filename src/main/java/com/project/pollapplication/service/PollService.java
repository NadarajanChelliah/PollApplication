package com.project.pollapplication.service;

import com.project.pollapplication.exception.ResourceNotFoundException;
import com.project.pollapplication.model.Poll;
import com.project.pollapplication.repository.PollRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PollService
{
    PollRepository pollRepository;
    public PollService(PollRepository pollRepository)
    {
        this.pollRepository = pollRepository;
    }

    public void createPoll(Poll poll)
    {
        if(poll.getOptions() == null || poll.getOptions().isEmpty())
        {
            throw new IllegalArgumentException("Poll must have options");
        }
        pollRepository.save(poll);
    }

    public Poll getPollById(Long pollId)
    {
        return pollRepository.findById(pollId).orElseThrow(() -> new ResourceNotFoundException("Poll not found"));
    }

    public List<Poll> getAllPolls()
    {
        return pollRepository.findAll();
    }
}
