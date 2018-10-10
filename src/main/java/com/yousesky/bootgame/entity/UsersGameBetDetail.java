package com.yousesky.bootgame.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class UsersGameBetDetail {
    private Integer id;

    private String betorderno;

    private String username;

    private BigDecimal valibet;

    private BigDecimal winbet;

    private Date bettime;

    private Date addtime;

    private String gametype;

    private Integer producttype;

    private BigDecimal bet;

    private BigDecimal netpnl;

    private String gamecode;

}