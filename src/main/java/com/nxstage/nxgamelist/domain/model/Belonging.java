package com.nxstage.nxgamelist.domain.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_belonging")
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Belonging {
    @EmbeddedId
    @EqualsAndHashCode.Include
    private BelongingPK id = new BelongingPK();
    private Integer position;

    public Belonging(Game game, GameList list, Integer position) {
        id = new BelongingPK(game,list);
        this.position = position;
    }
}
