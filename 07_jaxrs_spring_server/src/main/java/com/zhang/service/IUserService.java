package com.zhang.service;

import com.zhang.domain.User;

import javax.ws.rs.*;
import java.util.List;


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
