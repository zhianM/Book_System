package cn.mzan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.mzan.entity.Book;

public interface BookDao {
	Book selById(Long id);
	List<Book> selAll(@Param("offset")int offset,@Param("limit")int limit);
}
