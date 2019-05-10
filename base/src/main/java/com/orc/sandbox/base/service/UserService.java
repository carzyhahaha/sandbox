package com.orc.sandbox.base.service;

import com.orc.sandbox.base.dao.UserDao;
import com.orc.sandbox.base.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService extends BaseService <User, Long, UserDao> {


    public List<User> findByCondition(User user) {
        return dao.findAll(new Specification<User>() {

            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> predicates = new ArrayList<>();

                if (user.getId() != null) {
                    predicates.add(criteriaBuilder.equal(root.get("id").as(Integer.class), user.getId()));
                }

                Predicate[] parr = new Predicate[predicates.size()];
                parr = predicates.toArray(parr);
                return criteriaBuilder.and(parr);
            }
        });
    }


    public Page<User> pageQuery(User user, Integer pageSize, Integer pageNum) {

        Pageable pageable = PageRequest.of(pageNum-1, pageSize);
        return dao.findAll(new Specification<User>() {

            @Override
            public Predicate toPredicate(Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return null;
            }
        }, pageable);
    }
}
