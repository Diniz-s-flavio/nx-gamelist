package com.nxstage.nxgamelist.api.dto;

import com.nxstage.nxgamelist.domain.model.GameList;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Data
@NoArgsConstructor
public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(GameList entity){
        BeanUtils.copyProperties(entity,this);
    }
}
