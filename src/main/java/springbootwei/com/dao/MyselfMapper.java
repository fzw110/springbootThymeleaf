package springbootwei.com.dao;

import org.apache.ibatis.annotations.Mapper;
import springbootwei.com.pojo.Myself;

import java.util.List;
@Mapper
public interface MyselfMapper {

    List<Myself> myselfList();


    void deleteMyself(int id);

    void addMyself(Myself myself);

    void editMyself(Myself myself);

    Myself queryById(int id);
}
