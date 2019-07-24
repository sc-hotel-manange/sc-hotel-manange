package net.suncaper.hotel_manager.mapper;

import java.util.List;
import net.suncaper.hotel_manager.domain.H_User;
import net.suncaper.hotel_manager.domain.H_UserExample;
import org.apache.ibatis.annotations.Param;

public interface H_UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_user
     *
     * @mbg.generated Wed Jul 24 11:31:09 CST 2019
     */
    long countByExample(H_UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_user
     *
     * @mbg.generated Wed Jul 24 11:31:09 CST 2019
     */
    int deleteByExample(H_UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_user
     *
     * @mbg.generated Wed Jul 24 11:31:09 CST 2019
     */
    int deleteByPrimaryKey(Integer uId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_user
     *
     * @mbg.generated Wed Jul 24 11:31:09 CST 2019
     */
    int insert(H_User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_user
     *
     * @mbg.generated Wed Jul 24 11:31:09 CST 2019
     */
    int insertSelective(H_User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_user
     *
     * @mbg.generated Wed Jul 24 11:31:09 CST 2019
     */
    List<H_User> selectByExample(H_UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_user
     *
     * @mbg.generated Wed Jul 24 11:31:09 CST 2019
     */
    H_User selectByPrimaryKey(Integer uId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_user
     *
     * @mbg.generated Wed Jul 24 11:31:09 CST 2019
     */
    int updateByExampleSelective(@Param("record") H_User record, @Param("example") H_UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_user
     *
     * @mbg.generated Wed Jul 24 11:31:09 CST 2019
     */
    int updateByExample(@Param("record") H_User record, @Param("example") H_UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_user
     *
     * @mbg.generated Wed Jul 24 11:31:09 CST 2019
     */
    int updateByPrimaryKeySelective(H_User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_user
     *
     * @mbg.generated Wed Jul 24 11:31:09 CST 2019
     */
    int updateByPrimaryKey(H_User record);
}