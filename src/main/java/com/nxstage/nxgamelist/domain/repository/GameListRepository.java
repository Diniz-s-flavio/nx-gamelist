package com.nxstage.nxgamelist.domain.repository;

import com.nxstage.nxgamelist.domain.model.Game;
import com.nxstage.nxgamelist.domain.model.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList,Long> {
}
