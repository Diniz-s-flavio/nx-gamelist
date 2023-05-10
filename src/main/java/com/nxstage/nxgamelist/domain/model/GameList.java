package com.nxstage.nxgamelist.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "tb_game_list")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class GameList {
    @Id
    @EqualsAndHashCode.Include
    private Long id;
    private String nome;
}
