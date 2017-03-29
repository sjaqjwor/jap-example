package com.example.Repository;

import com.example.Team;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by seungki on 2017-03-29.
 */
public interface TeamRepository extends JpaRepository<Team, Integer> {
}
