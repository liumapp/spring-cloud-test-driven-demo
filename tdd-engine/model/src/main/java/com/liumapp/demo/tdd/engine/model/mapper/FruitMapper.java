package com.liumapp.demo.tdd.engine.model.mapper;

import com.liumapp.demo.tdd.engine.model.domain.Fruit;
import com.liumapp.demo.tdd.engine.model.domain.FruitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FruitMapper {
    int countByExample(FruitExample example);

    int deleteByExample(FruitExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Fruit record);

    int insertSelective(Fruit record);

    List<Fruit> selectByExample(FruitExample example);

    Fruit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Fruit record, @Param("example") FruitExample example);

    int updateByExample(@Param("record") Fruit record, @Param("example") FruitExample example);

    int updateByPrimaryKeySelective(Fruit record);

    int updateByPrimaryKey(Fruit record);
}