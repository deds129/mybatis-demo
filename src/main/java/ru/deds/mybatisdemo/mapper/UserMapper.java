package ru.deds.mybatisdemo.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import ru.deds.mybatisdemo.model.User;

import java.util.List;

@Mapper
public interface UserMapper {

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "lastName", column = "lastName"),
            @Result(property = "gender", column = "gender")
    })
    @Select("SELECT * FROM usr WHERE id = #{id}")
    User findUserById(Long id);

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "username", column = "username"),
            @Result(property = "firstName", column = "first_name"),
            @Result(property = "lastName", column = "last_name"),
            @Result(property = "gender", column = "gender")
    })
    @Select("SELECT * FROM usr")
    List<User> findAllUsers();
    
    @Insert("insert into usr (username, first_name, last_name, gender)" +
            "values (${user.username}, ${user.firstName}, ${user.lastName}, ${user.gender})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insertUser(User user);

    @Delete("DELETE FROM usr WHERE id = #{id}")
    void deleteUserById(Long id);
    
}
