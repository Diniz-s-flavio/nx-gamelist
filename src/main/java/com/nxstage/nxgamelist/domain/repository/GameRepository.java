package com.nxstage.nxgamelist.domain.repository;

import com.nxstage.nxgamelist.domain.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {
}
