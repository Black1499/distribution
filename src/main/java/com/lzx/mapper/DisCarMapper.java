package com.lzx.mapper;

import com.lzx.entity.DisCar;
import com.lzx.entity.DisCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DisCarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    long countByExample(DisCarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    int deleteByExample(DisCarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String carId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    int insert(DisCar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    int insertSelective(DisCar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    List<DisCar> selectByExample(DisCarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    DisCar selectByPrimaryKey(String carId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DisCar record, @Param("example") DisCarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DisCar record, @Param("example") DisCarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DisCar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dis_car
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DisCar record);
}