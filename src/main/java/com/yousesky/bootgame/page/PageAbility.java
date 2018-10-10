package com.yousesky.bootgame.page;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/10/10$ 15:35$
 * @Remark:
 */
public interface PageAbility<T> {
    default PageInfo<T> listToPageInfo(List<T> list) {
        return PageInfo.of(list);
    }
}
