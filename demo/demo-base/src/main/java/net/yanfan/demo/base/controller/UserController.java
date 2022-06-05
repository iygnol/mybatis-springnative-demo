package net.yanfan.demo.base.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.yanfan.demo.base.domain.UserDomain;
import net.yanfan.demo.base.mapper.SysUserMapper;

@RestController
@RequestMapping(value = "/user")
public class UserController {
	
	@Autowired
	private SysUserMapper userMapper;

	@GetMapping()
	public List<UserDomain> getUser() {
		return userMapper.selectUserList();
	}
	
}
