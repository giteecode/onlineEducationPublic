package top.qiudb.service.user;

import top.qiudb.pojo.user.CoinRecord;

import java.util.List;

/**
 * @author  Qiu
 * @email qiudb.top@aliyun.com
 * @date  2021/5/8 9:52
 * @description 花卷币记录表
 */public interface CoinRecordService {
    //添加一条交易记录
    public Boolean insertRecord(CoinRecord coinRecord);

    //根据用户id查询个人积分变化记录
    public List<CoinRecord> queryRecordById(Integer userId,int pageNum, int pageSize);

    //查询总数
    public Integer queryCount(Integer userId);
}
