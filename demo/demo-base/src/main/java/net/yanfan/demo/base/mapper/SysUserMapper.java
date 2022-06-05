package net.yanfan.demo.base.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.yanfan.demo.base.domain.UserDomain;

@Mapper
public interface SysUserMapper {
	List<UserDomain> selectUserList();
}
