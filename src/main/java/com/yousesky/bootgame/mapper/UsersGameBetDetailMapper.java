package com.yousesky.bootgame.mapper;

import com.yousesky.bootgame.entity.UsersGameBetDetail;
import com.yousesky.bootgame.entity.UsersGameBetDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
@Mapper
public interface UsersGameBetDetailMapper {
    @Delete({
        "delete from users_gamebetdetail",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into users_gamebetdetail (id, betorderno, ",
        "username, valibet, ",
        "winbet, bettime, ",
        "addtime, gametype, ",
        "productType, bet, ",
        "netpnl, gamecode)",
        "values (#{id,jdbcType=INTEGER}, #{betorderno,jdbcType=VARCHAR}, ",
        "#{username,jdbcType=VARCHAR}, #{valibet,jdbcType=DECIMAL}, ",
        "#{winbet,jdbcType=DECIMAL}, #{bettime,jdbcType=TIMESTAMP}, ",
        "#{addtime,jdbcType=TIMESTAMP}, #{gametype,jdbcType=VARCHAR}, ",
        "#{producttype,jdbcType=INTEGER}, #{bet,jdbcType=DECIMAL}, ",
        "#{netpnl,jdbcType=DECIMAL}, #{gamecode,jdbcType=VARCHAR})"
    })
    int insert(UsersGameBetDetail record);

    @InsertProvider(type=UsersGameBetDetailSqlProvider.class, method="insertSelective")
    int insertSelective(UsersGameBetDetail record);

    @SelectProvider(type=UsersGameBetDetailSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="betorderno", property="betorderno", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="valibet", property="valibet", jdbcType=JdbcType.DECIMAL),
        @Result(column="winbet", property="winbet", jdbcType=JdbcType.DECIMAL),
        @Result(column="bettime", property="bettime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="addtime", property="addtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gametype", property="gametype", jdbcType=JdbcType.VARCHAR),
        @Result(column="productType", property="producttype", jdbcType=JdbcType.INTEGER),
        @Result(column="bet", property="bet", jdbcType=JdbcType.DECIMAL),
        @Result(column="netpnl", property="netpnl", jdbcType=JdbcType.DECIMAL),
        @Result(column="gamecode", property="gamecode", jdbcType=JdbcType.VARCHAR)
    })
    List<UsersGameBetDetail> selectByExample(UsersGameBetDetailExample example);

    @Select({
        "select",
        "id, betorderno, username, valibet, winbet, bettime, addtime, gametype, productType, ",
        "bet, netpnl, gamecode",
        "from users_gamebetdetail",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="betorderno", property="betorderno", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="valibet", property="valibet", jdbcType=JdbcType.DECIMAL),
        @Result(column="winbet", property="winbet", jdbcType=JdbcType.DECIMAL),
        @Result(column="bettime", property="bettime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="addtime", property="addtime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gametype", property="gametype", jdbcType=JdbcType.VARCHAR),
        @Result(column="productType", property="producttype", jdbcType=JdbcType.INTEGER),
        @Result(column="bet", property="bet", jdbcType=JdbcType.DECIMAL),
        @Result(column="netpnl", property="netpnl", jdbcType=JdbcType.DECIMAL),
        @Result(column="gamecode", property="gamecode", jdbcType=JdbcType.VARCHAR)
    })
    UsersGameBetDetail selectByPrimaryKey(Integer id);

    @UpdateProvider(type=UsersGameBetDetailSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(UsersGameBetDetail record);

    @Update({
        "update users_gamebetdetail",
        "set betorderno = #{betorderno,jdbcType=VARCHAR},",
          "username = #{username,jdbcType=VARCHAR},",
          "valibet = #{valibet,jdbcType=DECIMAL},",
          "winbet = #{winbet,jdbcType=DECIMAL},",
          "bettime = #{bettime,jdbcType=TIMESTAMP},",
          "addtime = #{addtime,jdbcType=TIMESTAMP},",
          "gametype = #{gametype,jdbcType=VARCHAR},",
          "productType = #{producttype,jdbcType=INTEGER},",
          "bet = #{bet,jdbcType=DECIMAL},",
          "netpnl = #{netpnl,jdbcType=DECIMAL},",
          "gamecode = #{gamecode,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UsersGameBetDetail record);
}