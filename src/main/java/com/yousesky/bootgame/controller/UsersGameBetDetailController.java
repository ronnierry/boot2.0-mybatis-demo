package com.yousesky.bootgame.controller;

import com.github.pagehelper.PageInfo;
import com.yousesky.bootgame.entity.UsersGameBetDetail;
import com.yousesky.bootgame.entity.UsersGameBetDetailExample;
import com.yousesky.bootgame.page.PageParameter;
import com.yousesky.bootgame.service.UsersGameBetDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.Instant;
import java.util.Date;
import java.util.Optional;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/10/10$ 15:55$
 * @Remark:
 */
@Slf4j
@RestController
@RequestMapping("users-game-bet-detail")
public class UsersGameBetDetailController {
    @Resource
    private UsersGameBetDetailService usersGameBetDetailService;

    @GetMapping("page-query")
    public PageInfo<UsersGameBetDetail> pageQuery(
            Long startTime,
            Long endTime,
            String gameType,
            String gameCode,
            PageParameter pageParameter) {
        UsersGameBetDetailExample usersGameBetDetailExample = new UsersGameBetDetailExample();
        if (startTime != null) {
            Instant startInstant = Instant.ofEpochMilli(startTime);
            Date startDate = Date.from(startInstant);
            usersGameBetDetailExample.createCriteria().andBettimeGreaterThan(startDate);
        }
        if (endTime != null) {
            Instant endInstant = Instant.ofEpochMilli(endTime);
            Date endDate = Date.from(endInstant);
            usersGameBetDetailExample.createCriteria().andBettimeLessThan(endDate);
        }
        if (!StringUtils.isEmpty(gameCode))
            usersGameBetDetailExample.or().andGamecodeEqualTo(gameCode);
        if (!StringUtils.isEmpty(gameType))
            usersGameBetDetailExample.or().andGametypeEqualTo(gameType);
        usersGameBetDetailExample.setOrderByClause("id desc");
        return usersGameBetDetailService.pageQuery(usersGameBetDetailExample, pageParameter);
    }
}
