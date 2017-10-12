package service.imp;

import mapper.TbItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.TbItem;
import service.ItemService;
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
   TbItemMapper tbItemMapper;
    @Override
    public TbItem getItemById(Long id) {
        return tbItemMapper.selectByPrimaryKey(id);
    }
}
