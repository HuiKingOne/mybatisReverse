package com.rundejy.cloud;

import com.rundejy.cloud.entity.JwOrderInfoPromotionClass;
import com.rundejy.cloud.entity.JwOrderInfoPromotionClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JwOrderInfoPromotionClassMapper {
    long countByExample(JwOrderInfoPromotionClassExample example);

    int deleteByExample(JwOrderInfoPromotionClassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JwOrderInfoPromotionClass record);

    int insertSelective(JwOrderInfoPromotionClass record);

    List<JwOrderInfoPromotionClass> selectByExampleWithBLOBs(JwOrderInfoPromotionClassExample example);

    List<JwOrderInfoPromotionClass> selectByExample(JwOrderInfoPromotionClassExample example);

    JwOrderInfoPromotionClass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JwOrderInfoPromotionClass record, @Param("example") JwOrderInfoPromotionClassExample example);

    int updateByExampleWithBLOBs(@Param("record") JwOrderInfoPromotionClass record, @Param("example") JwOrderInfoPromotionClassExample example);

    int updateByExample(@Param("record") JwOrderInfoPromotionClass record, @Param("example") JwOrderInfoPromotionClassExample example);

    int updateByPrimaryKeySelective(JwOrderInfoPromotionClass record);

    int updateByPrimaryKeyWithBLOBs(JwOrderInfoPromotionClass record);

    int updateByPrimaryKey(JwOrderInfoPromotionClass record);
}