package lx;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

/**
 * Created by luxin on 2016/9/5.
 */
@Entity(value = "user_rule_index", noClassnameStored = true)

public class UserRuleIndexEntity {
    public static final String Field_enterpriseAccount = "EA";
    public static final String Field_enterpriseId = "EId";
    public static final String Field_userId = "UId";
    public static final String Field_createTime = "CT";
    public static final String Field_modifyTime = "MT";
    public static final String Field_deleteFlag = "DF";
    public static final String Field_isStop = "IsS";
    public static final String Field_stopTime = "ST";
    public static final String Field_lastCheckTime = "LCT";

    //规则相关
    public static final String Field_ruleId = "RId";
    public static final String Field_ruleType = "RTy";
    public static final String Field_ruleName = "RN"; // 规则名称

    public static final String Field_totalRedPacketMoneyCount = "TRPMC"; // 个人获得红包总金额 分

    public static final String Field_isHistory = "IsH";

    @Id
    private String userAccount;//员工账号

    @Property(Field_enterpriseAccount)
    private String enterpriseAccount;//企业账号

    @Property(Field_enterpriseId)
    private Long enterpriseId;//企业id

    @Property(Field_userId)
    private Integer userId;//员工id

//    @Property(Field_userName)
//    private String userName;//员工姓名

    @Property(Field_createTime)
    private long createTime;//创建时间

    @Property(Field_modifyTime)
    private long modifyTime;//更新时间


    @Property(Field_deleteFlag)
    private int deleteFlag;//删除标志位 0 未删除，-1删除

    @Property(Field_isStop)
    private int isStop;//用户是否停用 0-否，1-是

    @Property(Field_stopTime)
    private long stopTime;//停用时间

    @Property(Field_lastCheckTime)
    private long lastCheckTime;//最后一次签到时间,用于判断用户是否是活跃用户，用于定时任务补全当天未签到员工的统计记录

    /**
     * 规则名称
     */
    @Property(Field_ruleName)
    private String ruleName;

    @Property(Field_ruleId)
    private String ruleId;//规则id

    @Property(Field_ruleType)
    private int ruleType;//规则类型：-1（无规则）， 0（固定制），1（弹性制），2（排班制）

    @Property(Field_totalRedPacketMoneyCount)
    private long totalRedPacketMoneyCount;//红包总金额

    @Property(Field_isHistory)
    private int isHistory ;//来源，0-5.4新创建规则，1-历史规则

}
