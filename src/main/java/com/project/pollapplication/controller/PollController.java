package com.project.pollapplication.controller;

import com.project.pollapplication.dto.CreatePollResponse;
import com.project.pollapplication.model.Poll;
import com.project.pollapplication.service.PollService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/poll")
public class PollController
{
    private final PollService pollService;

    public PollController(PollService pollService) {
        this.pollService = pollService;
    }

    @RequestMapping("/create")
    public ResponseEntity createPoll(@RequestBody Poll poll)
    {
        pollService.createPoll(poll);
        CreatePollResponse createPollResponse = new CreatePollResponse("Poll created successfully", poll);
        return ResponseEntity.ok(createPollResponse);
    }

    @RequestMapping("/{pollId}")
    public ResponseEntity<Poll> getPollById(@PathVariable Long pollId)
    {
        Poll poll = pollService.getPollById(pollId);
        return ResponseEntity.ok(poll);
    }

    @RequestMapping("/getall")
    public ResponseEntity<List<Poll>> getAllPolls()
    {
        List<Poll> polls = pollService.getAllPolls();
        return ResponseEntity.ok(polls);
    }
}
