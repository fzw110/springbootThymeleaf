package springbootwei.com.service;

import org.springframework.stereotype.Service;
import springbootwei.com.pojo.Myself;

import java.util.List;
@Service
public interface MyselfService  {

    List<Myself> myselfList();

    void deleteMyself(int id);

    void addMyself(Myself myself);

    void editMyself(Myself myself);

    Myself queryOne(int id);
}
