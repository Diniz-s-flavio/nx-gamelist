package com.nxstage.nxgamelist.api.dto;

import com.nxstage.nxgamelist.domain.model.Game;
import lombok.Getter;
import lombok.NoArgsConstructor;


public interface GameMinProjection {
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();


}
