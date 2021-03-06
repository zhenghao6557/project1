package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.maskmanage.entity.requirement;
import com.maskmanage.entity.requirementExample;

public interface requirementMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table requirement
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int countByExample(requirementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table requirement
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int deleteByExample(requirementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table requirement
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int deleteByPrimaryKey(Integer reqrid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table requirement
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int insert(requirement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table requirement
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int insertSelective(requirement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table requirement
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    List<requirement> selectByExample(requirementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table requirement
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    requirement selectByPrimaryKey(Integer reqrid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table requirement
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int updateByExampleSelective(@Param("record") requirement record, @Param("example") requirementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table requirement
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int updateByExample(@Param("record") requirement record, @Param("example") requirementExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table requirement
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int updateByPrimaryKeySelective(requirement record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table requirement
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    int updateByPrimaryKey(requirement record);
}