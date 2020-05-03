package com.zhang.service;

import com.zhang.domain.User;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;



@Path("/userService")
@Produces("*/*")
public interface IUserService {

	@POST
	@Path("/user")
	//@Consumes  服务器支持的  请求  的数据格式类型
	@Consumes({ "application/xml", "application/json" })
	public void saveUser(User user);

	@PUT
	@Path("/user")
	@Consumes({ "application/xml", "application/json" })
	public void updateUser(User user);

	@GET
	@Path("/user")
	//@Produces  服务器支持的  返回  的数据格式类型
	@Produces({ "application/xml", "application/json" })
	public List<User> findAllUsers();

	@GET
	@Path("/user/{id}")
	@Consumes("application/xml")
	@Produces({ "application/xml", "application/json" })
	public User finUserById(@PathParam("id") Integer id);

	@DELETE
	@Path("/user/{id}")
	@Consumes({"application/xml", "application/json"})
	public void deleteUser(@PathParam("id") Integer id);
}
