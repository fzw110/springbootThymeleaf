package springbootwei.com.serviceImpl;
import springbootwei.com.dao.MyselfMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springbootwei.com.pojo.Myself;
import springbootwei.com.service.MyselfService;

import java.util.List;

@Service
public class MyselfServiceImpl implements MyselfService {
    @Autowired
    MyselfMapper myselfMapper;
    @Override
    public List<Myself> myselfList() {

        return myselfMapper.myselfList();
    }

    @Override
    public void deleteMyself(int id) {
      myselfMapper.deleteMyself(id);
    }

    @Override
    public void addMyself(Myself myself) {
       myselfMapper.addMyself(myself);
    }

    @Override
    public void editMyself(Myself myself) {
     myselfMapper.editMyself(myself);
    }

    @Override
    public Myself queryOne(int id) {
        return myselfMapper.queryById(id);
    }


}
