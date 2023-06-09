package com.lewis.base.mapper;

import com.lewis.base.entity.Srecord;
import java.util.List;

public interface SrecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srecord
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srecord
     *
     * @mbg.generated
     */
    int insert(Srecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srecord
     *
     * @mbg.generated
     */
    Srecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srecord
     *
     * @mbg.generated
     */
    List<Srecord> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srecord
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Srecord record);

    Srecord getRecord(Srecord srecord);
}