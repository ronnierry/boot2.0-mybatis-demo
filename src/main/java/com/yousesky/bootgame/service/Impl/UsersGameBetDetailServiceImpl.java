package com.yousesky.bootgame.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yousesky.bootgame.entity.UsersGameBetDetail;
import com.yousesky.bootgame.entity.UsersGameBetDetailExample;
import com.yousesky.bootgame.mapper.UsersGameBetDetailMapper;
import com.yousesky.bootgame.page.PageParameter;
import com.yousesky.bootgame.service.UsersGameBetDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/10/10$ 15:40$
 * @Remark:
 */
@Service
public class UsersGameBetDetailServiceImpl implements UsersGameBetDetailService {
    @Resource
    private UsersGameBetDetailMapper usersGameBetDetailMapper;

    @Override
    public PageInfo<UsersGameBetDetail> pageQuery(UsersGameBetDetailExample example, PageParameter pageParameter) {
        PageHelper.startPage(pageParameter.getPageNum(), pageParameter.getPageSize());
        List<UsersGameBetDetail> list = usersGameBetDetailMapper.selectByExample(example);
        return listToPageInfo(list);
    }

}
