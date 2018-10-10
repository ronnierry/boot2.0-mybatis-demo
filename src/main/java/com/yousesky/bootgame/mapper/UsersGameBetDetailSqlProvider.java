package com.yousesky.bootgame.mapper;

import com.yousesky.bootgame.entity.UsersGameBetDetail;
import com.yousesky.bootgame.entity.UsersGameBetDetailExample.Criteria;
import com.yousesky.bootgame.entity.UsersGameBetDetailExample.Criterion;
import com.yousesky.bootgame.entity.UsersGameBetDetailExample;
import java.util.List;
import org.apache.ibatis.jdbc.SQL;

public class UsersGameBetDetailSqlProvider {

    public String insertSelective(UsersGameBetDetail record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("users_gamebetdetail");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getBetorderno() != null) {
            sql.VALUES("betorderno", "#{betorderno,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getValibet() != null) {
            sql.VALUES("valibet", "#{valibet,jdbcType=DECIMAL}");
        }
        
        if (record.getWinbet() != null) {
            sql.VALUES("winbet", "#{winbet,jdbcType=DECIMAL}");
        }
        
        if (record.getBettime() != null) {
            sql.VALUES("bettime", "#{bettime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAddtime() != null) {
            sql.VALUES("addtime", "#{addtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGametype() != null) {
            sql.VALUES("gametype", "#{gametype,jdbcType=VARCHAR}");
        }
        
        if (record.getProducttype() != null) {
            sql.VALUES("productType", "#{producttype,jdbcType=INTEGER}");
        }
        
        if (record.getBet() != null) {
            sql.VALUES("bet", "#{bet,jdbcType=DECIMAL}");
        }
        
        if (record.getNetpnl() != null) {
            sql.VALUES("netpnl", "#{netpnl,jdbcType=DECIMAL}");
        }
        
        if (record.getGamecode() != null) {
            sql.VALUES("gamecode", "#{gamecode,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(UsersGameBetDetailExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("betorderno");
        sql.SELECT("username");
        sql.SELECT("valibet");
        sql.SELECT("winbet");
        sql.SELECT("bettime");
        sql.SELECT("addtime");
        sql.SELECT("gametype");
        sql.SELECT("productType");
        sql.SELECT("bet");
        sql.SELECT("netpnl");
        sql.SELECT("gamecode");
        sql.FROM("users_gamebetdetail");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(UsersGameBetDetail record) {
        SQL sql = new SQL();
        sql.UPDATE("users_gamebetdetail");
        
        if (record.getBetorderno() != null) {
            sql.SET("betorderno = #{betorderno,jdbcType=VARCHAR}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getValibet() != null) {
            sql.SET("valibet = #{valibet,jdbcType=DECIMAL}");
        }
        
        if (record.getWinbet() != null) {
            sql.SET("winbet = #{winbet,jdbcType=DECIMAL}");
        }
        
        if (record.getBettime() != null) {
            sql.SET("bettime = #{bettime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getAddtime() != null) {
            sql.SET("addtime = #{addtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGametype() != null) {
            sql.SET("gametype = #{gametype,jdbcType=VARCHAR}");
        }
        
        if (record.getProducttype() != null) {
            sql.SET("productType = #{producttype,jdbcType=INTEGER}");
        }
        
        if (record.getBet() != null) {
            sql.SET("bet = #{bet,jdbcType=DECIMAL}");
        }
        
        if (record.getNetpnl() != null) {
            sql.SET("netpnl = #{netpnl,jdbcType=DECIMAL}");
        }
        
        if (record.getGamecode() != null) {
            sql.SET("gamecode = #{gamecode,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, UsersGameBetDetailExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}