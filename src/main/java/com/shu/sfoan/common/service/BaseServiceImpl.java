package com.shu.sfoan.common.service;

import com.shu.sfoan.common.mapper.CustomMapper;
import com.shu.sfoan.common.model.BaseBean;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by dongyang.wang on 2018/11/7 0007.
 */
@Slf4j
public abstract class BaseServiceImpl <T extends BaseBean>{
    @Autowired
    protected CustomMapper<T> baseMapper;

    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 总数据
    * @Retn: java.lang.Integer
    */
    @Transactional(readOnly = true)
    public Integer selectCount() {
        return this.baseMapper.selectCount(null);
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 根据条件查询总数据数
    * @Retn: java.lang.Integer
    */
    @Transactional(readOnly = true)
    public Integer selectCountByWhere(T record) {
        return this.baseMapper.selectCount(record);
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 根据主键查询
    * @Retn: T
    */
    @Transactional(readOnly = true)
    public T selectByPrimaryKey(Serializable id) {
        return this.baseMapper.selectByPrimaryKey(id);
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 查询所有
    * @Retn: java.util.List<T>
    */
    @Transactional(readOnly = true)
    public List<T> selectAll() {
        return this.baseMapper.selectAll();
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 根据条件查询一条数据, 查询结果有多条,将抛异常
    * @Retn: T
    */
    @Transactional(readOnly = true)
    public T selectOne(T record) {
        return this.baseMapper.selectOne(record);
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 根据条件查询数据
    * @Retn: java.util.List<T>
    */
    @Transactional(readOnly = true)
    public List<T> selectListByWhere(T record) {
        return this.baseMapper.select(record);
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 新增数据
    * @Retn: java.lang.Integer
    */
    public Integer insert(T record) {
        attachDate(record);
        return this.baseMapper.insert(record);
    }


    private void attachDate(T record) {
        Date date = new Date();
        record.setCreateTime(date);
        record.setUpdateTime(date);
    }
    private void attachUpdateDate(T record) {
        Date date = new Date();
        record.setUpdateTime(date);
    }

    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 选择不为null的属性作为插入数据的字段，新增数据
    * @Retn: java.lang.Integer
    */
    public Integer insertSelective(T record) {
        attachDate(record);
        return this.baseMapper.insertSelective(record);
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 选择不为null的属性作为插入数据的字段，新增数据 不处理create_time 和 update_time
    * @Retn: java.lang.Integer
    */
    public Integer saveSelective(T record) {
        return this.baseMapper.insertSelective(record);
    }

    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 更新数据
    * @Retn: java.lang.Integer
    */
    public Integer update(T record) {
        attachUpdateDate(record);
        return this.baseMapper.updateByPrimaryKey(record);
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 选择不为null的属性作为更新数据的字段
    * @Retn: java.lang.Integer
    */
    public Integer updateSelective(T record) {
        attachUpdateDate(record);
        return this.baseMapper.updateByPrimaryKeySelective(record);
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 根据id删除数据
    * @Retn: java.lang.Integer
    */
    public Integer deleteByPrimaryKey(Serializable id) {
        return this.baseMapper.deleteByPrimaryKey(id);
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 根据条件删除数据
    * @Retn: java.lang.Integer
    */
    public Integer deleteByWhere(T record) {
        return this.baseMapper.delete(record);
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 通过条件查询数据列表
    * @Retn: java.util.List<T>
    */
    @Transactional(readOnly = true)
    public List<T> selectByExample(Object example) {
        return this.baseMapper.selectByExample(example);
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 通过条件统计数据条数
    * @Retn: java.lang.Integer
    */
    @Transactional(readOnly = true)
    public Integer selectCountByExample(Object example) {
        return this.baseMapper.selectCountByExample(example);
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 通过条件更新数据
    * @Retn: java.lang.Integer
    */
    public Integer updateByExample(T record, Object example) {
        attachUpdateDate(record);
        return this.baseMapper.updateByExample(record, example);
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 选择不为null的属性,通过条件更新数据
    * @Retn: java.lang.Integer
    */
    public Integer updateByExampleSelective(T record, Object example) {
        attachUpdateDate(record);
        return this.baseMapper.updateByExampleSelective(record, example);
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 通过条件删除数据
    * @Retn: java.lang.Integer
    */
    public Integer deleteByExample(Object example) {
        return this.baseMapper.deleteByExample(example);
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 分页查询数据
    * @Retn: java.util.List<T>
    */
    @Transactional(readOnly = true)
    public List<T> selectByRowBounds(T record, RowBounds rowBounds) {
        return this.baseMapper.selectByRowBounds(record, rowBounds);
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 根据条件分页查询数据
    * @Retn: java.util.List<T>
    */
    @Transactional(readOnly = true)
    public List<T> selectByExampleAndRowBounds(Object example, RowBounds rowBounds) {
        return this.baseMapper.selectByExampleAndRowBounds(example, rowBounds);
    }


    /**
    * Created by dongyang.wang on 2018/11/7 0007
    * @Desc: 批量插入数据
    * @Retn: java.lang.Integer
    */
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer insertList(List<T> recordList) {
        for (T record : recordList) {
            attachDate(record);
        }
        return this.baseMapper.insertList(recordList);
    }
}
