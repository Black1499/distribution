package com.lzx.mapper;

import com.lzx.entity.DisProvince;
import com.lzx.entity.DisProvinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisProvinceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_province
     *
     * @mbg.generated
     */
    long countByExample(DisProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_province
     *
     * @mbg.generated
     */
    int deleteByExample(DisProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_province
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String provinceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_province
     *
     * @mbg.generated
     */
    int insert(DisProvince record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_province
     *
     * @mbg.generated
     */
    int insertSelective(DisProvince record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_province
     *
     * @mbg.generated
     */
    List<DisProvince> selectByExample(DisProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_province
     *
     * @mbg.generated
     */
    DisProvince selectByPrimaryKey(String provinceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_province
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DisProvince record, @Param("example") DisProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_province
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DisProvince record, @Param("example") DisProvinceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_province
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DisProvince record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_province
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DisProvince record);
}