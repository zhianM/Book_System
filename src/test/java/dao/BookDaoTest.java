package dao;

import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import ch.qos.logback.classic.Logger;
import cn.mzan.dao.BookDao;
import cn.mzan.entity.Book;

public class BookDaoTest extends BookTest {

	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	/*
	 * Error creating bean with name 'dao.BookDaoTest': Injection of autowired dependencies failed; 
	 * nested exception is org.springframework.beans.factory.BeanCreationException:
	 *  Could not autowire field: private cn.mzan.dao.BookDao dao.BookDaoTest.bookDao; 
	 *  nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: 
	 *  No qualifying bean of type [cn.mzan.dao.BookDao] found for dependency: 
	 *  expected at least 1 bean which qualifies as autowire candidate for this dependency. 
	 *  Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	 * 原因：
	 * 	spring-dao.xml中sqlSessionFactory对应的包地址配置错误，未配置sqlSessionFactory也会出现此类错误
	*/
	@Autowired()
	private BookDao bookDao;
	
	@Test
	public void selById() {
		Book bok = bookDao.selById(1L);
		System.out.println(bok);
	}
	
	
}
