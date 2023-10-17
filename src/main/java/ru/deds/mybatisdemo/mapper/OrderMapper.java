package ru.deds.mybatisdemo.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import ru.deds.mybatisdemo.model.Order;

import java.util.List;

@Mapper
public interface OrderMapper {

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "userId", column = "user_id"),
            @Result(property = "name", column = "name"),
            @Result(property = "comment", column = "comment"),
            @Result(property = "price", column = "price"),
            @Result(property = "date", column = "order_date")
    })
    @Select("SELECT * FROM usr_order WHERE id = #{id}")
    Order findOrderById(Long id);

    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "userId", column = "user_id"),
            @Result(property = "name", column = "name"),
            @Result(property = "comment", column = "comment"),
            @Result(property = "price", column = "price"),
            @Result(property = "date", column = "order_date")
    })
    @Select("SELECT * FROM usr_order")
    List<Order> findAllOrders();
    
    @Insert("insert into usr_order (usr_id, name, comment, price, order_date)" +
            "values (#{usr_id}, #{name}, #{comment}, #{price}, #{order_date})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insertOrder(Order order);

    @Delete("DELETE FROM usr_order WHERE id = #{id}")
    void deleteOrderById(Long id);
    
}
