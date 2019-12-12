package org.humingk.movie.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.humingk.movie.entity.StateScene;
import org.humingk.movie.entity.StateSceneExample;

public interface StateSceneMapper {
    long countByExample(StateSceneExample example);

    int deleteByExample(StateSceneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StateScene record);

    int insertSelective(StateScene record);

    List<StateScene> selectByExample(StateSceneExample example);

    StateScene selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StateScene record, @Param("example") StateSceneExample example);

    int updateByExample(@Param("record") StateScene record, @Param("example") StateSceneExample example);

    int updateByPrimaryKeySelective(StateScene record);

    int updateByPrimaryKey(StateScene record);
}