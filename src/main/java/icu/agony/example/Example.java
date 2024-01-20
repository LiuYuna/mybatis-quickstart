package icu.agony.example;

import icu.agony.example.domain.User;
import icu.agony.example.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Example {

    public static void main(String[] args) throws Exception {
        try (InputStream is = Resources.getResourceAsStream("mybatis_config.xml")) {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            SqlSession sqlSession = sqlSessionFactory.openSession(true);
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = userMapper.selectAll();
            System.out.println("data: " + users);
            sqlSession.close();
        }
    }

}