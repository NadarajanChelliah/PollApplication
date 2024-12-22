package com.project.pollapplication.repository;

import com.project.pollapplication.model.Poll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PollRepository extends JpaRepository<Poll, Long>
{

}
