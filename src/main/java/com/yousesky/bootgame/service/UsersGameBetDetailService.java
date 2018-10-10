package com.yousesky.bootgame.service;

import com.github.pagehelper.PageInfo;
import com.yousesky.bootgame.entity.UsersGameBetDetail;
import com.yousesky.bootgame.entity.UsersGameBetDetailExample;
import com.yousesky.bootgame.page.PageAbility;
import com.yousesky.bootgame.page.PageParameter;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/10/10$ 15:33$
 * @Remark:
 */
public interface UsersGameBetDetailService extends PageAbility<UsersGameBetDetail> {
    PageInfo<UsersGameBetDetail> pageQuery(UsersGameBetDetailExample example, PageParameter pageParameter);
}
