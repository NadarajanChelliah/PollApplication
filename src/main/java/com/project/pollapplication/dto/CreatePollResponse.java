package com.project.pollapplication.dto;

import com.project.pollapplication.model.Poll;

public class CreatePollResponse
{
    private String message;
    private Poll poll;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Poll getPoll() {
        return poll;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public CreatePollResponse(String message, Poll poll)
    {
        this.message = message;
        this.poll = poll;
    }
}
