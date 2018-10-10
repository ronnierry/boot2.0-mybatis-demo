package com.yousesky.bootgame.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersGameBetDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersGameBetDetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBetordernoIsNull() {
            addCriterion("betorderno is null");
            return (Criteria) this;
        }

        public Criteria andBetordernoIsNotNull() {
            addCriterion("betorderno is not null");
            return (Criteria) this;
        }

        public Criteria andBetordernoEqualTo(String value) {
            addCriterion("betorderno =", value, "betorderno");
            return (Criteria) this;
        }

        public Criteria andBetordernoNotEqualTo(String value) {
            addCriterion("betorderno <>", value, "betorderno");
            return (Criteria) this;
        }

        public Criteria andBetordernoGreaterThan(String value) {
            addCriterion("betorderno >", value, "betorderno");
            return (Criteria) this;
        }

        public Criteria andBetordernoGreaterThanOrEqualTo(String value) {
            addCriterion("betorderno >=", value, "betorderno");
            return (Criteria) this;
        }

        public Criteria andBetordernoLessThan(String value) {
            addCriterion("betorderno <", value, "betorderno");
            return (Criteria) this;
        }

        public Criteria andBetordernoLessThanOrEqualTo(String value) {
            addCriterion("betorderno <=", value, "betorderno");
            return (Criteria) this;
        }

        public Criteria andBetordernoLike(String value) {
            addCriterion("betorderno like", value, "betorderno");
            return (Criteria) this;
        }

        public Criteria andBetordernoNotLike(String value) {
            addCriterion("betorderno not like", value, "betorderno");
            return (Criteria) this;
        }

        public Criteria andBetordernoIn(List<String> values) {
            addCriterion("betorderno in", values, "betorderno");
            return (Criteria) this;
        }

        public Criteria andBetordernoNotIn(List<String> values) {
            addCriterion("betorderno not in", values, "betorderno");
            return (Criteria) this;
        }

        public Criteria andBetordernoBetween(String value1, String value2) {
            addCriterion("betorderno between", value1, value2, "betorderno");
            return (Criteria) this;
        }

        public Criteria andBetordernoNotBetween(String value1, String value2) {
            addCriterion("betorderno not between", value1, value2, "betorderno");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andValibetIsNull() {
            addCriterion("valibet is null");
            return (Criteria) this;
        }

        public Criteria andValibetIsNotNull() {
            addCriterion("valibet is not null");
            return (Criteria) this;
        }

        public Criteria andValibetEqualTo(BigDecimal value) {
            addCriterion("valibet =", value, "valibet");
            return (Criteria) this;
        }

        public Criteria andValibetNotEqualTo(BigDecimal value) {
            addCriterion("valibet <>", value, "valibet");
            return (Criteria) this;
        }

        public Criteria andValibetGreaterThan(BigDecimal value) {
            addCriterion("valibet >", value, "valibet");
            return (Criteria) this;
        }

        public Criteria andValibetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("valibet >=", value, "valibet");
            return (Criteria) this;
        }

        public Criteria andValibetLessThan(BigDecimal value) {
            addCriterion("valibet <", value, "valibet");
            return (Criteria) this;
        }

        public Criteria andValibetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("valibet <=", value, "valibet");
            return (Criteria) this;
        }

        public Criteria andValibetIn(List<BigDecimal> values) {
            addCriterion("valibet in", values, "valibet");
            return (Criteria) this;
        }

        public Criteria andValibetNotIn(List<BigDecimal> values) {
            addCriterion("valibet not in", values, "valibet");
            return (Criteria) this;
        }

        public Criteria andValibetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valibet between", value1, value2, "valibet");
            return (Criteria) this;
        }

        public Criteria andValibetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("valibet not between", value1, value2, "valibet");
            return (Criteria) this;
        }

        public Criteria andWinbetIsNull() {
            addCriterion("winbet is null");
            return (Criteria) this;
        }

        public Criteria andWinbetIsNotNull() {
            addCriterion("winbet is not null");
            return (Criteria) this;
        }

        public Criteria andWinbetEqualTo(BigDecimal value) {
            addCriterion("winbet =", value, "winbet");
            return (Criteria) this;
        }

        public Criteria andWinbetNotEqualTo(BigDecimal value) {
            addCriterion("winbet <>", value, "winbet");
            return (Criteria) this;
        }

        public Criteria andWinbetGreaterThan(BigDecimal value) {
            addCriterion("winbet >", value, "winbet");
            return (Criteria) this;
        }

        public Criteria andWinbetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("winbet >=", value, "winbet");
            return (Criteria) this;
        }

        public Criteria andWinbetLessThan(BigDecimal value) {
            addCriterion("winbet <", value, "winbet");
            return (Criteria) this;
        }

        public Criteria andWinbetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("winbet <=", value, "winbet");
            return (Criteria) this;
        }

        public Criteria andWinbetIn(List<BigDecimal> values) {
            addCriterion("winbet in", values, "winbet");
            return (Criteria) this;
        }

        public Criteria andWinbetNotIn(List<BigDecimal> values) {
            addCriterion("winbet not in", values, "winbet");
            return (Criteria) this;
        }

        public Criteria andWinbetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("winbet between", value1, value2, "winbet");
            return (Criteria) this;
        }

        public Criteria andWinbetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("winbet not between", value1, value2, "winbet");
            return (Criteria) this;
        }

        public Criteria andBettimeIsNull() {
            addCriterion("bettime is null");
            return (Criteria) this;
        }

        public Criteria andBettimeIsNotNull() {
            addCriterion("bettime is not null");
            return (Criteria) this;
        }

        public Criteria andBettimeEqualTo(Date value) {
            addCriterion("bettime =", value, "bettime");
            return (Criteria) this;
        }

        public Criteria andBettimeNotEqualTo(Date value) {
            addCriterion("bettime <>", value, "bettime");
            return (Criteria) this;
        }

        public Criteria andBettimeGreaterThan(Date value) {
            addCriterion("bettime >", value, "bettime");
            return (Criteria) this;
        }

        public Criteria andBettimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bettime >=", value, "bettime");
            return (Criteria) this;
        }

        public Criteria andBettimeLessThan(Date value) {
            addCriterion("bettime <", value, "bettime");
            return (Criteria) this;
        }

        public Criteria andBettimeLessThanOrEqualTo(Date value) {
            addCriterion("bettime <=", value, "bettime");
            return (Criteria) this;
        }

        public Criteria andBettimeIn(List<Date> values) {
            addCriterion("bettime in", values, "bettime");
            return (Criteria) this;
        }

        public Criteria andBettimeNotIn(List<Date> values) {
            addCriterion("bettime not in", values, "bettime");
            return (Criteria) this;
        }

        public Criteria andBettimeBetween(Date value1, Date value2) {
            addCriterion("bettime between", value1, value2, "bettime");
            return (Criteria) this;
        }

        public Criteria andBettimeNotBetween(Date value1, Date value2) {
            addCriterion("bettime not between", value1, value2, "bettime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("addtime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("addtime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("addtime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("addtime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("addtime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("addtime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("addtime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("addtime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("addtime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("addtime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("addtime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("addtime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andGametypeIsNull() {
            addCriterion("gametype is null");
            return (Criteria) this;
        }

        public Criteria andGametypeIsNotNull() {
            addCriterion("gametype is not null");
            return (Criteria) this;
        }

        public Criteria andGametypeEqualTo(String value) {
            addCriterion("gametype =", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeNotEqualTo(String value) {
            addCriterion("gametype <>", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeGreaterThan(String value) {
            addCriterion("gametype >", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeGreaterThanOrEqualTo(String value) {
            addCriterion("gametype >=", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeLessThan(String value) {
            addCriterion("gametype <", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeLessThanOrEqualTo(String value) {
            addCriterion("gametype <=", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeLike(String value) {
            addCriterion("gametype like", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeNotLike(String value) {
            addCriterion("gametype not like", value, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeIn(List<String> values) {
            addCriterion("gametype in", values, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeNotIn(List<String> values) {
            addCriterion("gametype not in", values, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeBetween(String value1, String value2) {
            addCriterion("gametype between", value1, value2, "gametype");
            return (Criteria) this;
        }

        public Criteria andGametypeNotBetween(String value1, String value2) {
            addCriterion("gametype not between", value1, value2, "gametype");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNull() {
            addCriterion("productType is null");
            return (Criteria) this;
        }

        public Criteria andProducttypeIsNotNull() {
            addCriterion("productType is not null");
            return (Criteria) this;
        }

        public Criteria andProducttypeEqualTo(Integer value) {
            addCriterion("productType =", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotEqualTo(Integer value) {
            addCriterion("productType <>", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThan(Integer value) {
            addCriterion("productType >", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("productType >=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThan(Integer value) {
            addCriterion("productType <", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeLessThanOrEqualTo(Integer value) {
            addCriterion("productType <=", value, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeIn(List<Integer> values) {
            addCriterion("productType in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotIn(List<Integer> values) {
            addCriterion("productType not in", values, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeBetween(Integer value1, Integer value2) {
            addCriterion("productType between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andProducttypeNotBetween(Integer value1, Integer value2) {
            addCriterion("productType not between", value1, value2, "producttype");
            return (Criteria) this;
        }

        public Criteria andBetIsNull() {
            addCriterion("bet is null");
            return (Criteria) this;
        }

        public Criteria andBetIsNotNull() {
            addCriterion("bet is not null");
            return (Criteria) this;
        }

        public Criteria andBetEqualTo(BigDecimal value) {
            addCriterion("bet =", value, "bet");
            return (Criteria) this;
        }

        public Criteria andBetNotEqualTo(BigDecimal value) {
            addCriterion("bet <>", value, "bet");
            return (Criteria) this;
        }

        public Criteria andBetGreaterThan(BigDecimal value) {
            addCriterion("bet >", value, "bet");
            return (Criteria) this;
        }

        public Criteria andBetGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bet >=", value, "bet");
            return (Criteria) this;
        }

        public Criteria andBetLessThan(BigDecimal value) {
            addCriterion("bet <", value, "bet");
            return (Criteria) this;
        }

        public Criteria andBetLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bet <=", value, "bet");
            return (Criteria) this;
        }

        public Criteria andBetIn(List<BigDecimal> values) {
            addCriterion("bet in", values, "bet");
            return (Criteria) this;
        }

        public Criteria andBetNotIn(List<BigDecimal> values) {
            addCriterion("bet not in", values, "bet");
            return (Criteria) this;
        }

        public Criteria andBetBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bet between", value1, value2, "bet");
            return (Criteria) this;
        }

        public Criteria andBetNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bet not between", value1, value2, "bet");
            return (Criteria) this;
        }

        public Criteria andNetpnlIsNull() {
            addCriterion("netpnl is null");
            return (Criteria) this;
        }

        public Criteria andNetpnlIsNotNull() {
            addCriterion("netpnl is not null");
            return (Criteria) this;
        }

        public Criteria andNetpnlEqualTo(BigDecimal value) {
            addCriterion("netpnl =", value, "netpnl");
            return (Criteria) this;
        }

        public Criteria andNetpnlNotEqualTo(BigDecimal value) {
            addCriterion("netpnl <>", value, "netpnl");
            return (Criteria) this;
        }

        public Criteria andNetpnlGreaterThan(BigDecimal value) {
            addCriterion("netpnl >", value, "netpnl");
            return (Criteria) this;
        }

        public Criteria andNetpnlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("netpnl >=", value, "netpnl");
            return (Criteria) this;
        }

        public Criteria andNetpnlLessThan(BigDecimal value) {
            addCriterion("netpnl <", value, "netpnl");
            return (Criteria) this;
        }

        public Criteria andNetpnlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("netpnl <=", value, "netpnl");
            return (Criteria) this;
        }

        public Criteria andNetpnlIn(List<BigDecimal> values) {
            addCriterion("netpnl in", values, "netpnl");
            return (Criteria) this;
        }

        public Criteria andNetpnlNotIn(List<BigDecimal> values) {
            addCriterion("netpnl not in", values, "netpnl");
            return (Criteria) this;
        }

        public Criteria andNetpnlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("netpnl between", value1, value2, "netpnl");
            return (Criteria) this;
        }

        public Criteria andNetpnlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("netpnl not between", value1, value2, "netpnl");
            return (Criteria) this;
        }

        public Criteria andGamecodeIsNull() {
            addCriterion("gamecode is null");
            return (Criteria) this;
        }

        public Criteria andGamecodeIsNotNull() {
            addCriterion("gamecode is not null");
            return (Criteria) this;
        }

        public Criteria andGamecodeEqualTo(String value) {
            addCriterion("gamecode =", value, "gamecode");
            return (Criteria) this;
        }

        public Criteria andGamecodeNotEqualTo(String value) {
            addCriterion("gamecode <>", value, "gamecode");
            return (Criteria) this;
        }

        public Criteria andGamecodeGreaterThan(String value) {
            addCriterion("gamecode >", value, "gamecode");
            return (Criteria) this;
        }

        public Criteria andGamecodeGreaterThanOrEqualTo(String value) {
            addCriterion("gamecode >=", value, "gamecode");
            return (Criteria) this;
        }

        public Criteria andGamecodeLessThan(String value) {
            addCriterion("gamecode <", value, "gamecode");
            return (Criteria) this;
        }

        public Criteria andGamecodeLessThanOrEqualTo(String value) {
            addCriterion("gamecode <=", value, "gamecode");
            return (Criteria) this;
        }

        public Criteria andGamecodeLike(String value) {
            addCriterion("gamecode like", value, "gamecode");
            return (Criteria) this;
        }

        public Criteria andGamecodeNotLike(String value) {
            addCriterion("gamecode not like", value, "gamecode");
            return (Criteria) this;
        }

        public Criteria andGamecodeIn(List<String> values) {
            addCriterion("gamecode in", values, "gamecode");
            return (Criteria) this;
        }

        public Criteria andGamecodeNotIn(List<String> values) {
            addCriterion("gamecode not in", values, "gamecode");
            return (Criteria) this;
        }

        public Criteria andGamecodeBetween(String value1, String value2) {
            addCriterion("gamecode between", value1, value2, "gamecode");
            return (Criteria) this;
        }

        public Criteria andGamecodeNotBetween(String value1, String value2) {
            addCriterion("gamecode not between", value1, value2, "gamecode");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}